package com.example.test;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.test.model_cycle.Stadium;
import com.example.test.model_cycle.StadiumAdapter;

import java.util.ArrayList;
import java.util.List;

public class Main_Recycle extends AppCompatActivity {
    private RecyclerView recyclerView;
    private StadiumAdapter adapter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_stadium);

        recyclerView = findViewById(R.id.review);
        adapter = new StadiumAdapter(this);
        LinearLayoutManager manager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(manager);
        adapter.setData(creatData());
        recyclerView.setAdapter(adapter);

    }

    private List<Stadium> creatData() {
        List<Stadium> list = new ArrayList<>();
        list.add(new Stadium(R.drawable.stadium, "abc", "asd"));
        return list;
    }
}
