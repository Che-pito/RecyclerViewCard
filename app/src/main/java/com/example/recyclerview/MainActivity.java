package com.example.recyclerview;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    List<ListElement> elements;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }

    public void  init() {
        elements = new ArrayList<>();
        elements.add(new ListElement("#775447", "Pepe", "La Costa", "Activo"));
        elements.add(new ListElement("#607d8b", "Daniel", "Medellín", "Activo"));
        elements.add(new ListElement("#03a9f4", "Mateo", "Cali", "Activo"));
        elements.add(new ListElement("#f44336", "Luis", "Barranquilla", "Activo"));
        elements.add(new ListElement("#009688", "Carlos", "Guarne", "Activo"));

        ListAdapter listAdapter = new ListAdapter(elements, this);
        RecyclerView recyclerView = findViewById(R.id.listRecyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(listAdapter);
    }
}