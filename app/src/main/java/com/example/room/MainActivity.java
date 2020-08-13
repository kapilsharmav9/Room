package com.example.room;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

import model.Document;

public class MainActivity extends AppCompatActivity {
RecyclerView recyclerView;
RecycleAdapter adapter;
List<Document>mlist=new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView=findViewById(R.id.recycle);
        recyclerView.setLayoutManager(new LinearLayoutManager(MainActivity.this));
        adapter=new RecycleAdapter(MainActivity.this,mlist);
        recyclerView.hasFixedSize();
        recyclerView.setAdapter(adapter);
    }
}
