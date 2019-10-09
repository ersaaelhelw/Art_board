package com.example.art_app;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class Events_Adapter extends RecyclerView.Adapter <RecyclerView.ViewHolder>    {

    public ArrayList<Events> eventsArrayList=new ArrayList<>();
    public Context context;

    public Events_Adapter(ArrayList<Events> eventsArrayList, Context context) {
        this.context=context;
        this.eventsArrayList=eventsArrayList;

    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        int layoutIdForListItem = R.layout.items;
        LayoutInflater inflater = LayoutInflater.from(context);
        boolean shouldAttachToParentImmediately = false;

        View view = inflater.inflate(layoutIdForListItem, parent, shouldAttachToParentImmediately);

        return new Events_Adapter.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {

        TextView envent_name =holder.itemView.findViewById(R.id.evenr_name);
        envent_name.setText(eventsArrayList.get(position).getEnvent_name());
        TextView time =holder.itemView.findViewById(R.id.time);
        time.setText(eventsArrayList.get(position).getTime());
        ImageView imageView= holder.itemView.findViewById(R.id.event_img);
        imageView.setImageResource(eventsArrayList.get(position).getImage());

        ImageView love= holder.itemView.findViewById(R.id.love);
        love.setImageResource(eventsArrayList.get(position).getLove());
    }

    @Override
    public int getItemCount() {
        return eventsArrayList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public ViewHolder(View view) {
            super(view);
        }
    }
}
