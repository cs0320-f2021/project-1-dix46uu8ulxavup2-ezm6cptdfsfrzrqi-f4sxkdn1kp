package edu.brown.cs.student.main;


import com.google.common.reflect.TypeToken;
import com.google.gson.Gson;
import edu.brown.cs.student.main.ApiClient;
import edu.brown.cs.student.main.ClientRequestGenerator;
import java.net.HttpURLConnection;
import java.net.URL;


import java.lang.reflect.Type;
import java.util.List;

public class API {
    private final ApiClient client = new ApiClient();
    /**
     *
     * @param type - The type of data
     * @return - A Type variable set to the desired type
     * @throws Exception
     */
    public String getURL(String type){
        String key = ClientAuth.getApiKey();
        String url = "https://runwayapi.herokuapp.com/" + type + "-";
        String url0 = client.makeRequest(ClientRequestGenerator.getSecuredGetRequest(url + key));
        return url0;
    }

    public List<Object> getData (String type){
        Gson gson = new Gson();
        //String key = ClientAuth.getApiKey();
        //String url = "https://runwayapi.herokuapp.com/" + type + "-";
        String url1 = getURL(type);
        String url2 = getURL(type);
        String url3 = getURL(type);
        String url4 = getURL(type);
        String url5 = getURL(type);

        return null;

        }
        public float getTime(String type) throws Exception{
            float start = 0;
            float end = 0;
            String url0 = getURL(type);
            try{
                URL url = new URL(url0);
                HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
                httpURLConnection.setConnectTimeout(5000);
                start = System.currentTimeMillis();
                httpURLConnection.connect();
            }
            catch (Exception e){}
            return (end-start);
        }
}
