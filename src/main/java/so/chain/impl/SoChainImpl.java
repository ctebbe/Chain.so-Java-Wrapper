package so.chain.impl;

import com.google.gson.*;

import so.chain.SoChain;
import so.chain.entity.*;

import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLEncoder;

/**
 * @author ct.
 */
public class SoChainImpl implements SoChain {

    private static final String baseApiURL = "https://chain.so/api/v2";
    private static final Gson gson = new GsonBuilder().create();

    private static SoChainImpl instance;
    public static synchronized SoChainImpl getInstance() {
        if(instance==null) instance = new SoChainImpl();
        return instance;
    }
    private SoChainImpl() { }

    @Override
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
    
    @Override
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
    
    @Override
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
    
    @Override
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
    
    @Override
    public Address getAddress(Network network, String address) throws IOException {
        URL url=null;
        Address addressObj=null;
        try {
            url = new URL(
                    baseApiURL+
                    "/address/"+
                    URLEncoder.encode(network.toString(), "UTF-8")+"/"+
                    URLEncoder.encode(address, "UTF-8"));
            addressObj = gson.fromJson(getJsonFromUrl(url), Address.class);
        } catch (MalformedURLException e) { e.printStackTrace(); }
        return addressObj;
    }
    
    @Override
    public PriceQuery getPrice(Network network, Currency currency) throws IOException {
        URL url=null;
        PriceQuery priceQuery=null;
        try {
            url = new URL(
                    baseApiURL+
                    "/get_price/"+
                    URLEncoder.encode(network.toString(), "UTF-8")+"/"+
                    URLEncoder.encode(currency.toString(), "UTF-8"));
            priceQuery = gson.fromJson(getJsonFromUrl(url), PriceQuery.class);
        } catch (MalformedURLException e) { e.printStackTrace(); }
        return priceQuery;
    }
    
    @Override
    public NetworkInfo getNetworkInfo(Network network) throws IOException {
        URL url=null;
        NetworkInfo networkInfo=null;
        try {
            url = new URL(
                    baseApiURL+
                    "/get_info/"+
                    URLEncoder.encode(network.toString(), "UTF-8"));
            networkInfo = gson.fromJson(getJsonFromUrl(url), NetworkInfo.class);
        } catch (MalformedURLException e) { e.printStackTrace(); }
        return networkInfo;
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
