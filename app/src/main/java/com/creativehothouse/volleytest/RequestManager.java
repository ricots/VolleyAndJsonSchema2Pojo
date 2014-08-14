package com.creativehothouse.volleytest;

import com.android.volley.AuthFailureError;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;

import org.json.JSONObject;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by miftahmubarak on 8/13/14.
 */
public class RequestManager {

    private OnRequestFinish onRequestFinish;

    public void postRequest(String url,HashMap<String,String> param, final OnRequestFinish onRequestFinish){

        this.onRequestFinish = onRequestFinish;
        JsonObjectRequest req = new JsonObjectRequest(url, new JSONObject(param),mListener,errorListener)
        {


            @Override
            public Map<String, String> getHeaders() throws AuthFailureError {
                return super.getHeaders();
            }

        };

        ApplicationVolley.getInstance().addToRequestQueue(req);
    }


    private Response.Listener mListener = new Response.Listener() {
        @Override
        public void onResponse(Object o) {
            if (onRequestFinish != null){
                onRequestFinish.onComplete((JSONObject)o);
            }
        }
    };

    private Response.ErrorListener errorListener = new Response.ErrorListener() {
        @Override
        public void onErrorResponse(VolleyError volleyError) {

        }
    };
}
