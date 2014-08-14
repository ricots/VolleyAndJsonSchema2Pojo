package com.creativehothouse.volleytest;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

import com.creativehothouse.volleytest.entities.DataUser;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.json.JSONObject;

import java.io.IOException;
import java.util.HashMap;


public class MyActivity extends Activity {

    private static final String TOKEN = "CAACl5lV8pcIBAF3LxU7e73xgCLJXRvOr0jK7A5ZCjrlBQsvcc8gEDxMCXmWkZCLqI6E2VpSqO2dDXmH3ZCQkriDU5j5xEKj4ZCl89ZAZAZAHejMoZCIzoyn9rkfOY7ZCS2b9UiLRDZCd9PyaYC1zxy5t6hiIYeZCC0OLjMsd57JxC7RiIZBLsQgYwxPoZB826zHrWZBKdlGdniP8WmFvdGfNkE0HpBsXQZCtQoIwpQBlde2eFapJwZDZD";

    private HashMap<String,String> params;
    private static final String SERVER = "http://api.beta.clipsterapp.com";
    private RequestManager requestManager;

    private DataUser mUser;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my);

        params = new HashMap<String, String>();
        params.put("provider","facebook");
        params.put("token",TOKEN);

        requestManager = new RequestManager();
        requestManager.postRequest(SERVER + "/login",params,new OnRequestFinish() {
            @Override
            public void onComplete(JSONObject response) {
                Log.i("response",response.toString());
                try{


                    mUser = ConvertStringToJson.jsonToUser(response.toString(),MyActivity.this);


                }catch (JsonParseException e){
                    //mUser = null;
                    Log.i("MyActivity","JsonParseException " + e.getMessage());
                }catch (JsonMappingException e){
                    //mUser = null;
                    Log.i("MyActivity","JsonMappingException " + e.getMessage());
                }catch (IOException e){
                    //mUser = null;
                    Log.i("MyActivity","IOException" + e.getMessage());
//                }catch (JSONException e){

                }



                if (mUser != null)
                    Log.i("MyActivity","Nama : " + mUser.getUser().getName());


            }
        });


    }

}
