package com.example.saran.recyclerview_customlist;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    RecyclerView.Adapter adapter;
    RecyclerView.LayoutManager layoutManager;

    String[] companies;
    String[] ceo;

    ArrayList<ListModel> arrayList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = (RecyclerView) findViewById(R.id.recyclerview);

        companies = getResources().getStringArray(R.array.company);
        ceo = getResources().getStringArray(R.array.ceos);
        int[] images = {R.drawable.microsoft, R.drawable.google, R.drawable.yahoo, R.drawable.intel, R.drawable.apple, R.drawable.hp, R.drawable.sony};

        for (int i = 0; i < images.length; i++) {
            ListModel listModel = new ListModel(images[i], companies[i], ceo[i]);
            arrayList.add(listModel);

        }

        adapter = new CustomAdapter(this, arrayList);
        recyclerView.setHasFixedSize(true);
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);

    }
}
