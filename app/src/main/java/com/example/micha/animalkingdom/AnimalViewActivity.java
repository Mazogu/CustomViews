package com.example.micha.animalkingdom;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;

import com.example.micha.animalkingdom.data.DatabaseHelper;

import java.util.List;

public class AnimalViewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animal_view);
        ListView listView = findViewById(R.id.animalList);
        String category = getIntent().getStringExtra("data");
        DatabaseHelper data = new DatabaseHelper(this);
        List<Animal> list = data.getList(category);
        CustomAdapter adapter = new CustomAdapter(this, R.layout.custom_low_layout, list,category);
        listView.setAdapter(adapter);

    }


    public void makeSound(View view) {
        // TODO: 1/17/2018 Make button produce sound based on animal chosen.
    }
}
