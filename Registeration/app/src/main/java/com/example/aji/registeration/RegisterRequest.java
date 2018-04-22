package com.example.aji.registeration;

import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by AJI on 2017-12-10.
 */

public class RegisterRequest extends StringRequest{

    final static private String URL = "http://syj6003.dothome.co.kr/UserRegister.php";
    private Map<String, String> parameters;
    public RegisterRequest(String userID, String userPassword, String userGender, String userMajor, String userEmail, Response.Listener<String> listener){
        super(Method.POST, URL, listener , null);
        parameters = new HashMap<>();
        parameters.put("userID",userID);
        parameters.put("userPassword",userPassword);
        parameters.put("userGender",userGender);
        parameters.put("userMajor",userMajor);
        parameters.put("userEmail",userEmail);


    }

    public Map<String, String> getParams(){
        return parameters;
    }
}
