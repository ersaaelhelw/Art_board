package com.example.art_app;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class Art extends AppCompatActivity {

    RecyclerView recyclerView;
    Events events=new Events();
    ArrayList<Events> eventsArrayList= new ArrayList<>();
    Context context;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_art);
        events.setEnvent_name("Job Interview");
        events.setTime("Mon,16,Oct");
        events.setImage(R.drawable.interview);
        events.setLove(R.drawable.like);
        eventsArrayList.add(events);
        events=new Events();

        events.setEnvent_name("Andrea Birthday");
        events.setTime("Mon,10,Oct");
        events.setImage(R.drawable.birthday);
        events.setLove(R.drawable.like);
        eventsArrayList.add(events);



        recyclerView= findViewById(R.id.recycler);
        final Events_Adapter newsAdapter= new Events_Adapter(eventsArrayList,context);
        recyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, true));
        recyclerView.setAdapter(newsAdapter);

    }
}
