package com.example.playstore;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Adapter1 extends RecyclerView.Adapter<Holder1> {
    ArrayList<Model1> list1;

    public Adapter1(ArrayList<Model1> list1) {
        this.list1 = list1;
    }

    @NonNull
    @Override
    public Holder1 onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_layout1,parent,false);
        return new Holder1(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Holder1 holder, int position) {
        Model1 model = list1.get(position);
        holder.setData1(model);
    }

    @Override
    public int getItemCount() {
        return list1.size();
    }
}
