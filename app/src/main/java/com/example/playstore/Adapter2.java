package com.example.playstore;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Adapter2 extends RecyclerView.Adapter<Holder2> {
    ArrayList<Model2> list2 ;

    public Adapter2(ArrayList<Model2> list2) {
        this.list2 = list2;
    }

    @NonNull

    @Override
    public Holder2 onCreateViewHolder(@NonNull  ViewGroup parent, int viewType) {
        View view2 = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_layout1,parent,false);
        return new Holder2(view2);
    }

    @Override
    public void onBindViewHolder(@NonNull  Holder2 holder, int position) {
    Model2 model2 = list2.get(position);
    holder.setData2(model2);
    }

    @Override
    public int getItemCount() {
        return list2.size();
    }
}
