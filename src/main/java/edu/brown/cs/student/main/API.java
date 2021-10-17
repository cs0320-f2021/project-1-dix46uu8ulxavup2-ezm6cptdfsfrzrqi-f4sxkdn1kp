package edu.brown.cs.student.main;


import com.google.common.reflect.TypeToken;
import com.google.gson.Gson;
import edu.brown.cs.student.client.ApiClient;
import edu.brown.cs.student.main.ClientRequestGenerator;

import java.lang.reflect.Type;
import java.util.List;

public class API {
    private final ApiClient client = new ApiClient();

        public List<Object> getData (String type){
            Gson gson = new Gson();


        }
}
