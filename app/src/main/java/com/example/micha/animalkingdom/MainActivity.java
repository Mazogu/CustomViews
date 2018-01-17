package com.example.micha.animalkingdom;

import android.content.Intent;
import android.provider.ContactsContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.micha.animalkingdom.data.DatabaseContract;
import com.example.micha.animalkingdom.data.DatabaseHelper;

import java.lang.reflect.Array;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final String[] categories = new String[]{DatabaseContract.Animals.CATS,DatabaseContract.Animals.SHARKS,DatabaseContract.Animals.BIRDS};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_expandable_list_item_1,categories);
        ListView view = findViewById(R.id.categoryList);
        view.setAdapter(adapter);
        view.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String string = "";
                switch(categories[i]){
                    case DatabaseContract.Animals.CATS:
                        string = DatabaseContract.Animals.CATS;
                        break;
                    case DatabaseContract.Animals.SHARKS:
                        string = DatabaseContract.Animals.SHARKS;
                        break;
                    case DatabaseContract.Animals.BIRDS:
                        string = DatabaseContract.Animals.BIRDS;
                        break;
                }
                Intent intent = new Intent(getApplicationContext(),AnimalViewActivity.class);
                intent.putExtra("data",string);
                startActivity(intent);
            }
        });
    }
}
