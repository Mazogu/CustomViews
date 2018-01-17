package com.example.micha.animalkingdom;

import android.media.MediaPlayer;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import android.widget.Switch;

import com.example.micha.animalkingdom.data.DatabaseContract;
import com.example.micha.animalkingdom.data.DatabaseHelper;

import java.util.List;

public class AnimalViewActivity extends AppCompatActivity {

    private String category;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animal_view);
        ListView listView = findViewById(R.id.animalList);
        category = getIntent().getStringExtra("data");
        DatabaseHelper data = new DatabaseHelper(this);
        List<Animal> list = data.getList(category);
        CustomAdapter adapter = new CustomAdapter(this, R.layout.custom_low_layout, list, category);
        listView.setAdapter(adapter);

    }


    public void makeSound(View view) {
        MediaPlayer cat = MediaPlayer.create(this,R.raw.cat_purring_and_meow);
        MediaPlayer shark = MediaPlayer.create(this, R.raw.water_swirl_small_21);
        MediaPlayer bird = MediaPlayer.create(this, R.raw.birds_chirping);
        switch(category){
            case DatabaseContract.Animals.CATS:
                cat.start();
                break;
            case DatabaseContract.Animals.SHARKS:
                shark.start();
                break;
            case DatabaseContract.Animals.BIRDS:
                bird.start();
                break;
        }


    }
}
