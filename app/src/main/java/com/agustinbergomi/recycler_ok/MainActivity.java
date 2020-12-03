package com.agustinbergomi.recycler_ok;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements MyRecyclerViewAdapter.ItemClickListener {

    MyRecyclerViewAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // data to populate the RecyclerView with
        ArrayList<String> animalNames = new ArrayList<>();
        animalNames.add("Tornillo");
        animalNames.add("Bulon");
        animalNames.add("Tuerca");
        animalNames.add("Arandela");
        animalNames.add("Varilla roscada");
        animalNames.add("Arandela Grower");
        animalNames.add("Tuerca autofrenante");
        animalNames.add("Tuerca hexagonal");
        animalNames.add("Tuerca castillo");
        animalNames.add("Zincado amarillo");
        animalNames.add("Zincado azul");
        animalNames.add("Tornillo");
        animalNames.add("Bulon");
        animalNames.add("Tuerca");
        animalNames.add("Arandela");
        animalNames.add("Varilla roscada");
        animalNames.add("Arandela Grower");
        animalNames.add("Tuerca autofrenante");
        animalNames.add("Tuerca hexagonal");
        animalNames.add("Tuerca castillo");
        animalNames.add("Zincado amarillo");
        animalNames.add("Zincado azul");
        // set up the RecyclerView
        RecyclerView recyclerView = findViewById(R.id.rvAnimals);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        adapter = new MyRecyclerViewAdapter(this, animalNames);
        adapter.setClickListener(this);
        recyclerView.setAdapter(adapter);
    }

    @Override
    public void onItemClick(View view, int position) {
        Toast.makeText(this, "You clicked " + adapter.getItem(position) + " on row number " + position, Toast.LENGTH_SHORT).show();
    }
}