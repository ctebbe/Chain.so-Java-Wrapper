package so.chain;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.apache.commons.io.IOUtils;
import so.chain.entity.AddressBalance;
import so.chain.entity.Network;

import javax.net.ssl.HttpsURLConnection;
import javax.xml.ws.Response;
import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;
import java.nio.charset.Charset;

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
                    URLEncoder.encode(network.toString()+"/", "UTF-8")+
                    URLEncoder.encode(address, "UTF-8"));
            System.out.println(url.toString());
            System.out.println("https://chain.so/api/v2/get_address_balance/DOGE/DQkoCN263PMgemwmHH2UR8kMDRqMexJ2sk");
            InputStream is = url.openStream();
            addressBalance = gson.fromJson(new InputStreamReader(is, "UTF-8"), AddressBalance.class);
            //addressBalance = gson.fromJson(readUrl(url), AddressBalance.class);
        } catch (MalformedURLException e) { e.printStackTrace(); }
        return addressBalance;
    }

    private String doHttps(URL url, String method, Object requestBody) throws IOException {
        URLConnection urlConnection = url.openConnection();
        if (!(urlConnection instanceof HttpsURLConnection)) {
            throw new RuntimeException("Custom Base URL must return HttpURLConnection on openConnection.");
        }
        HttpsURLConnection conn = (HttpsURLConnection) urlConnection;
        conn.setRequestMethod(method);

        String body = null;
        if (requestBody != null) {
            body = gson.toJson(requestBody);
            conn.setRequestProperty("Content-Type", "application/json");
        }

        if (body != null) {
            conn.setDoOutput(true);
            OutputStream outputStream = conn.getOutputStream();
            try {
                outputStream.write(body.getBytes(Charset.forName("UTF-8")));
            } finally {
                outputStream.close();
            }
        }

        System.out.println(conn.getResponseCode());

        InputStream inStream = null;
        InputStream errorStream = null;
        try {
            inStream = conn.getInputStream();
            return IOUtils.toString(inStream, "UTF-8");
        } catch (IOException e) {
            errorStream = conn.getErrorStream();
            String errorBody = null;
            if (errorStream != null) {
                errorBody = IOUtils.toString(errorStream, "UTF-8");
                if (errorBody != null && conn.getContentType().toLowerCase().contains("json")) {
                    Response shapeshiftResponse;
                    try {
                        //shapeshiftResponse = deserialize(errorBody, Response.class);
                    } catch (Exception ex) { ; }
                    // handle errors
                }
            }
            throw e;
        } finally {
            if (inStream != null)
                inStream.close();
            if (errorStream != null)
                errorStream.close();
        }
    }
    private static String readUrl(URL url) throws IOException {
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new InputStreamReader(url.openStream()));
            StringBuffer buffer = new StringBuffer();
            int read;
            char[] chars = new char[1024];
            while ((read = reader.read(chars)) != -1)
                buffer.append(chars, 0, read);

            return buffer.toString();
        } finally {
            if (reader != null)
                reader.close();
        }
    }
}
