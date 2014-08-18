package com.creativehothouse.volleytest;

import android.content.Context;

import com.creativehothouse.volleytest.entities.Audio;
import com.creativehothouse.volleytest.entities.Clipsters;
import com.creativehothouse.volleytest.entities.DataUser;
import com.creativehothouse.volleytest.entities.Datum;
import com.creativehothouse.volleytest.entities.Feeds;
import com.creativehothouse.volleytest.entities.Video;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

import java.io.IOException;

/**
 * Created by miftahmubarak on 8/13/14.
 */

public class ConvertStringToJson {

        public static Clipsters jsonToClipsters (String json, Context context) throws JsonParseException, JsonMappingException, IOException{
            Clipsters clipsters = new ObjectMapper().readValue(json, Clipsters.class);

            return clipsters;
        }


        public static DataUser jsonToUser (String json, Context context) throws JsonParseException, JsonMappingException, IOException {
            DataUser user  = new ObjectMapper().readValue(json, DataUser.class);
            return user;
        }

        public static Datum jsonToDatum (String json, Context context) throws JsonParseException, JsonMappingException, IOException{
            Datum datum  = new ObjectMapper().readValue(json, Datum.class);
            return datum;
        }

        public static Audio jsonToAudio (String json, Context context) throws JsonParseException, JsonMappingException, IOException{
            Audio audio  = new ObjectMapper().readValue(json, Audio.class);
            return audio;
        }

        public static Video jsonToVideo (String json, Context context) throws  JsonParseException, JsonMappingException, IOException{
            Video video = new ObjectMapper().readValue(json, Video.class);
            return video;
        }

        public static Feeds getFeeds(String json, Context context) throws  JsonParseException, JsonMappingException, IOException{
            Feeds mFeeds = new ObjectMapper().readValue(json, Feeds.class);
            return mFeeds;
        }

}
