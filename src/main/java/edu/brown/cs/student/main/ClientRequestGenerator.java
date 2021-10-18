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
     * Similar to the introductory GET request, but restricted to api key holders only.
     * @param s - the specific url we're working with
     * @return an HttpRequest object for accessing the secured resource.
     */
    public static HttpRequest getSecuredGetRequest(String s) {
        ClientAuth clientAuth = new ClientAuth();
        //getting api key
        String key = ClientAuth.getApiKey();
        String reqUri = s + "?auth=aclark21&key=" + key;
        //build and return a new GET HttpRequest with an api key header.
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder(URI.create(reqUri))
                .header("x-api-key", key)
               .build();
        client.sendAsync(request, BodyHandlers.ofString())
                .thenApply(HttpResponse::body)
                .thenAccept(System.out::println);
        return request;
    }
}

