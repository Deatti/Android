package com.example.aji.registeration;

import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by AJI on 2017-12-10.
 */

public class ValidateRequest extends StringRequest{

    final static private String URL = "http://syj6003.dothome.co.kr/UserValidate.php";
    private Map<String, String> parameters;
    public ValidateRequest(String userID, Response.Listener<String> listener){
        super(Method.POST, URL, listener , null);
        parameters = new HashMap<>();
        parameters.put("userID",userID);


    }

    public Map<String, String> getParams(){
        return parameters;
    }
}
