package com.creativehothouse.volleytest;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;

import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.creativehothouse.volleytest.adapters.FeedAdapter;
import com.creativehothouse.volleytest.entities.Feed;
import com.creativehothouse.volleytest.entities.Feeds;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.json.JSONObject;

import java.io.IOException;
import java.util.List;


public class MyActivity extends Activity {

    private static final String SERVER = "http://api.androidhive.info/feed/feed.json";
    private JsonObjectRequest mJsonObjectRequest;
    private Feeds myFeeds;
    private FeedAdapter adapter;
    private ListView mListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my);

        adapter = new FeedAdapter(this);
        mListView   = (ListView)findViewById(R.id.listView);


        mJsonObjectRequest = new JsonObjectRequest(SERVER,null,mObjectListener,errorListener);
        ApplicationVolley.getInstance().addToRequestQueue(mJsonObjectRequest);

    }


    private Response.Listener<JSONObject> mObjectListener = new Response.Listener<JSONObject>() {
        @Override
        public void onResponse(JSONObject jsonObject) {
            //Log.i("response : ", jsonObject.toString());


            try{
                myFeeds = ConvertStringToJson.getFeeds(jsonObject.toString(),getApplicationContext());
            }catch (JsonParseException e){
                myFeeds = null;
            }catch (JsonMappingException e){
                myFeeds = null;
            }catch (IOException e){
                myFeeds = null;
            }

            if (myFeeds != null)
                setData(myFeeds);
        }
    };


    private Response.ErrorListener errorListener = new Response.ErrorListener() {
        @Override
        public void onErrorResponse(VolleyError volleyError) {

        }
    };


    private List<Feed> feeds;
    private void setData(Feeds myFeeds){
        feeds = myFeeds.getFeed();
        adapter.setData(feeds);

        mListView.setAdapter(adapter);
    }

}
