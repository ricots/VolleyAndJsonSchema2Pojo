package com.creativehothouse.volleytest.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.android.volley.toolbox.ImageLoader;
import com.creativehothouse.volleytest.R;
import com.creativehothouse.volleytest.entities.Feed;
import com.creativehothouse.volleytest.server.RequestManager;

import java.util.List;

/**
 * Created by miftahmubarak on 8/18/14.
 */
public class FeedAdapter extends BaseAdapter {


    private List<Feed> data;
    private Context context;

    public FeedAdapter(Context context){
        this.context = context;
    }


    public void setData(List<Feed> data){
        this.data = data;
        notifyDataSetChanged();
    }

    @Override
    public int getCount() {
        return data.size();
    }

    @Override
    public Object getItem(int position) {
        return data.get(position).getName();
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        final ViewHolder holder;

        if (convertView == null){
            holder = new ViewHolder();

            LayoutInflater inflater = LayoutInflater.from(context);
            convertView = inflater.inflate(R.layout.item_list,parent,false);

            holder.avatar   = (ImageView)convertView.findViewById(R.id.imageView);
            holder.name     = (TextView)convertView.findViewById(R.id.textView);
            holder.status   = (TextView)convertView.findViewById(R.id.textView2);

            convertView.setTag(holder);

        }else {
            holder = (ViewHolder) convertView.getTag();
        }


        holder.name.setText(data.get(position).getName());
        holder.status.setText(data.get(position).getStatus());
       
        RequestManager.getInstance(context).getImageLoader().get(data.get(position).getProfilePic(), ImageLoader.getImageListener(holder.avatar,R.drawable.ic_launcher,R.drawable.ic_launcher));

        return convertView;
    }


    static class ViewHolder{
        public ImageView avatar;
        public TextView name,status;
    }



}
