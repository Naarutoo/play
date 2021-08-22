package com.example.playstore;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.LinearLayout;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
 RecyclerView mrecyclerView1;
 RecyclerView mrecyclerView2;

 ArrayList<Model1> applist1 =  new ArrayList<>();
 ArrayList<Model2>applist2 = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initview();
        buildData1();
        setRecycleView1();
        buildData2();
        setRecycleView2();
    }

    private void setRecycleView2() {
        Adapter2 adapter2 = new Adapter2(applist2);
        mrecyclerView2.setAdapter(adapter2);
        LinearLayoutManager manager2 = new LinearLayoutManager(this,RecyclerView.HORIZONTAL,false);
        mrecyclerView2.setLayoutManager(manager2);

    }

    private void buildData2() {
        for (int i=0;i<20;i++){
            Model2 model2 = new Model2(R.drawable.app2,"Horoscope",3);
            applist2.add(model2);
        }

    }

    private void setRecycleView1() {
        Adapter1 adapter1 = new Adapter1(applist1);
        mrecyclerView1.setAdapter(adapter1);
        LinearLayoutManager manager = new LinearLayoutManager(this,RecyclerView.HORIZONTAL,false);
        mrecyclerView1.setLayoutManager(manager);
    }

    private void buildData1() {
        for(int i=0;i<20;i++){
            Model1 model1 = new Model1(R.drawable.app1);
            applist1.add(model1);
        }
    }


    private void initview() {
    mrecyclerView1 = findViewById(R.id.recyclerView1);
    mrecyclerView2 = findViewById(R.id.recyclerView2);
    }


}