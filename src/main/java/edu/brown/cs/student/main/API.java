package edu.brown.cs.student.main;

import com.google.gson.Gson;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

public class API {
    private final ApiClient client = new ApiClient();
    /**
     * @param type - which data to use: users, review, rent
     * @param number - the number of the endpoint I'm dealing with ("one" through "five")
     * @return - A String of the url that is usuable
     * @throws Exception
     */
    public String getURL(String type, String number){
        String key = ClientAuth.getApiKey();
        String url = "https://runwayapi.herokuapp.com/" + type + "-";
        String url0 = client.makeRequest(ClientRequestGenerator.getSecuredGetRequest(url + number + "?auth=aclark21&key=" + key));
        return url0;
    }
    /**
     * This method creates my Json
     * @param type - which data to use: users, review, rent
     * @return - list of the fastest endpoint but that doesn't work right now
     * @throws Exception
     */
    public List<Object> getData (String type) throws Exception {
        Gson gson = new Gson();
        // from my research, numbers 1 and 3 are the fastest
       float url1 = getTime(type, "one");
       float url2 = getTime(type, "three");
       String best_url = getURL(type, "one");
        if (url1 <= url2) {
            best_url = getURL(type, "one");
        }
        else{
            best_url = getURL(type, "three");
        }
        // bug that I really don't know how to fix
        //return gson.fromJson(best_url, type);
        return null;
    }
    /**
     * @param type - which data to use: users, review, rent
     * @param number - the number of the endpoint I'm dealing with ("one" through "five")
     * @return - A float of the speed of the given urls
     * @throws Exception
     */
        public float getTime(String type, String number) throws Exception{
            float start = 0;
            float end = 0;
            String url0 = getURL(type, number);
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
}//com
