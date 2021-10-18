package edu.brown.cs.student.main;

import edu.brown.cs.student.main.ClientAuth;
import edu.brown.cs.student.main.ClientAuth;

import java.net.URI;
import java.net.http.HttpRequest;
import java.net.http.HttpClient;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;

import java.time.Duration;

/**
 * This class generates the HttpRequests that are then used to make requests from the ApiClient.
 */
public class ClientRequestGenerator {


    /**
     * Similar to the introductory GET request, but restricted to api key holders only. Try calling it without the API
     * Key configured and see what happens!
     *
     * @return an HttpRequest object for accessing the secured resource.
     */
    public static HttpRequest getSecuredGetRequest() {
        String reqUri = "https://epb3u4xo11.execute-api.us-east-1.amazonaws.com/Prod/securedResource";
        // TODO get the secret API key by using the ClientAuth class.
        String key = ClientAuth.getApiKey();

        // TODO build and return a new GET HttpRequest with an api key header.
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder(URI.create(reqUri))
                .header("x-api-key", key)
                .build();
        client.sendAsync(request, BodyHandlers.ofString())
                .thenApply(HttpResponse::body)
                .thenAccept(System.out::println);
        return request;

        // Hint: .header("x-api-key", apiKey)
    }



    /**
     * This is another secured GET request that has an optional string parameter in the URL. Find out what the staff's
     * horoscopes are!
     *
     * @param param - the name of the staff member whose horoscope you want to find; an empty string here will indicate
     *              that the server should return a list of all staff members instead.
     * @return an HttpRequest object for accessing and posting to the secured resource.
     */
    public static HttpRequest getHoroscopeGetRequest(String param) {
        // Our taName parameter can either be empty, or some name, in which case it takes the format "?taName=name".
        // If you tried this in the web browser URL you might see something like
        // https://epb3u4xo11.execute-api.us-east-1.amazonaws.com/Prod/securedResource?taName=theInputName
        String taName = null;
        if (param.length() == 0){
            taName = "";
        }
        else {
            taName = param;
        }

        // TODO set the taName. It should either be empty "" if the param is empty, or else of the format "?taName=param"
        String reqUri =
                "https://epb3u4xo11.execute-api.us-east-1.amazonaws.com/Prod/horoscopeResource/" + taName;
        // TODO get the secret API key by using the ClientAuth class.
        String apiKey = null;
        System.out.println("Getting star sign for " + param);
        // TODO build and return a new GET request with the api key header.
        return null;
    }
}

