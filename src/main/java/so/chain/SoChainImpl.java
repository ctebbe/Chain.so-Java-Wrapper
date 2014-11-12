package so.chain;

import com.google.gson.*;

import so.chain.entity.*;

import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLEncoder;

/**
 * @author ct.
 */
public class SoChainImpl {

    private static final String baseApiURL = "https://chain.so/api/v2";
    private static final Gson gson = new GsonBuilder().create();

    private static SoChainImpl instance;
    public static synchronized SoChainImpl getInstance() {
        if(instance==null) instance = new SoChainImpl();
        return instance;
    }
    private SoChainImpl() { }

    public AddressBalance getAddressBalance(Network network, String address) throws IOException {
        URL url=null;
        AddressBalance addressBalance=null;
        try {
            url = new URL(
                    baseApiURL+
                    "/get_address_balance/"+
                    URLEncoder.encode(network.toString(), "UTF-8")+"/"+
                    URLEncoder.encode(address, "UTF-8"));
            addressBalance = gson.fromJson(getJsonFromUrl(url), AddressBalance.class);
        } catch (MalformedURLException e) { e.printStackTrace(); }
        return addressBalance;
    }
    
    public AddressReceived getAddressReceived(Network network, String address) throws IOException {
        URL url=null;
        AddressReceived addressReceived=null;
        try {
            url = new URL(
                    baseApiURL+
                    "/get_address_received/"+
                    URLEncoder.encode(network.toString(), "UTF-8")+"/"+
                    URLEncoder.encode(address, "UTF-8"));
            addressReceived = gson.fromJson(getJsonFromUrl(url), AddressReceived.class);
        } catch (MalformedURLException e) { e.printStackTrace(); }
        return addressReceived;
    }
    
    public AddressSpent getAddressSpent(Network network, String address) throws IOException {
        URL url=null;
        AddressSpent addressSpent=null;
        try {
            url = new URL(
                    baseApiURL+
                    "/get_address_spent/"+
                    URLEncoder.encode(network.toString(), "UTF-8")+"/"+
                    URLEncoder.encode(address, "UTF-8"));
            addressSpent = gson.fromJson(getJsonFromUrl(url), AddressSpent.class);
        } catch (MalformedURLException e) { e.printStackTrace(); }
        return addressSpent;
    }
    
    public AddressValid getAddressValid(Network network, String address) throws IOException {
        URL url=null;
        AddressValid addressValid=null;
        try {
            url = new URL(
                    baseApiURL+
                    "/is_address_valid/"+
                    URLEncoder.encode(network.toString(), "UTF-8")+"/"+
                    URLEncoder.encode(address, "UTF-8"));
            addressValid = gson.fromJson(getJsonFromUrl(url), AddressValid.class);
        } catch (MalformedURLException e) { e.printStackTrace(); }
        return addressValid;
    }

    private static JsonParser jsonParser = new JsonParser();
    private static String getJsonFromUrl(URL url) throws IOException {
        JsonElement element = jsonParser.parse(new InputStreamReader(url.openStream()));
        if(element.isJsonObject()) {
            JsonObject jo = element.getAsJsonObject();
            if(jo.get("status").equals("fail"))
                ; // handle errors
            else
                return String.valueOf(jo.get("data"));
        } return null;
    }
}
