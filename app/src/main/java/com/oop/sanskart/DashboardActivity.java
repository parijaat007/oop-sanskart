package com.oop.sanskart;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.LinearLayout;

import java.util.ArrayList;

public class DashboardActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private StaticRecyclerViewAdapter staticRecyclerViewAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
        ArrayList<StaticRecyclerViewModel> item=new ArrayList<>();
        item.add(new StaticRecyclerViewModel(R.drawable.vegetable_icon, "vegetable"));
        item.add(new StaticRecyclerViewModel(R.drawable.frozen_icon, "frozen"));
        item.add(new StaticRecyclerViewModel(R.drawable.fruit_icon, "fruit"));
        item.add(new StaticRecyclerViewModel(R.drawable.raw_material_icon, "raw material"));

        recyclerView=findViewById(R.id.recycler_view1);
        staticRecyclerViewAdapter=new StaticRecyclerViewAdapter(item);
        recyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL,false));
        recyclerView.setAdapter(staticRecyclerViewAdapter);
    }
}