package com.example.room;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import model.Document;

public class RecycleAdapter extends RecyclerView.Adapter<RecycleAdapter.MyHolder> {
Context context;
List<Document> mlist;

    public RecycleAdapter(Context context, List<Document> mlist) {
        this.context = context;
        this.mlist = mlist;
    }

    @NonNull
    @Override
    public RecycleAdapter.MyHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v= LayoutInflater.from(context).inflate(R.layout.custom,parent,false);
        return new MyHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull RecycleAdapter.MyHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return mlist.size();
    }

     class MyHolder  extends RecyclerView.ViewHolder{
        public MyHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
