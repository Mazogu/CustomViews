package com.example.micha.animalkingdom;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import android.widget.Toast;

import com.example.micha.animalkingdom.data.DatabaseContract;

import java.util.List;

/**
 * Created by micha on 1/17/2018.
 */

public class CustomAdapter extends ArrayAdapter<Animal> {
    private String category;

    public CustomAdapter(@NonNull Context context, int resource, @NonNull List<Animal> animals, String category) {
        super(context, resource, animals);
        this.category = category;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        Animal animal = getItem(position);
        double weight = 0.0;
        TextView name = null;
        TextView eat = null;
        TextView hostile = null;
        TextView weightV = null;

        if (animal != null) {
            weight = Double.parseDouble(animal.getWeight());
        }


        if (convertView == null) {
            switch (getItemViewType(position)) {
                case 0:
                    convertView = LayoutInflater.from(parent.getContext()).inflate(R.layout.custom_low_layout, null);
                    name = convertView.findViewById(R.id.name);
                    eat = convertView.findViewById(R.id.eat);
                    hostile = convertView.findViewById(R.id.hostile);
                    weightV = convertView.findViewById(R.id.weight);
                    break;
                case 1:
                    convertView = LayoutInflater.from(parent.getContext()).inflate(R.layout.custom_high_layout, null);
                    name = convertView.findViewById(R.id.overName);
                    eat = convertView.findViewById(R.id.overEat);
                    hostile = convertView.findViewById(R.id.overHostile);
                    weightV = convertView.findViewById(R.id.overWeight);
                    break;
            }
            if (animal != null) {
                name.setText(animal.getName());
                eat.setText(animal.getEat());
                hostile.setText(animal.getHostile());
                weightV.setText(animal.getWeight());

            }
        }


        return convertView;
    }

    @Override
    public int getViewTypeCount() {
        return 2;
    }

    @Override
    public int getItemViewType(int position) {
        Animal animal = getItem(position);
        double weight = Double.parseDouble(animal.getWeight());
        if (animal != null) {
            if (category.equals(DatabaseContract.Animals.CATS) && weight >= Cat.WEIGHT_THRESHOLD) {
                return 1;
            } else if (category.equals(DatabaseContract.Animals.SHARKS) && weight >= Shark.WEIGHT_THRESHOLD) {
                return 1;
            } else if (category.equals(DatabaseContract.Animals.BIRDS) && weight >= Bird.WEIGHT_THRESHOLD) {
                return 1;
            }
        }
        return 0;
    }
}
