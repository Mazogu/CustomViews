package com.example.micha.animalkingdom.data;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by micha on 1/16/2018.
 */

public class DatabaseHelper extends SQLiteOpenHelper{
    public static final String DATABASE_NAME = "Animal Database";
    public static final int DATABASE_VERSION = 1;

    public DatabaseHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase database) {
        database.execSQL(DatabaseContract.CREATE_CAT_TABLE);
        database.execSQL(DatabaseContract.CREATE_SHARK_TABLE);
        database.execSQL(DatabaseContract.CREATE_BIRD_TABLE);


        addCats(database);
        addSharks(database);
        addBirds(database);

    }

    private void addBirds(SQLiteDatabase database) {
        database.execSQL("INSERT INTO Bird (Name,Eat,Hostile,Weight) VALUES ('Hawk','Carnivore','Mild','2')");
        database.execSQL("INSERT INTO Bird (Name,Eat,Hostile,Weight) VALUES ('Owl','Carnivore','Mild','1')");
        database.execSQL("INSERT INTO Bird (Name,Eat,Hostile,Weight) VALUES ('Hummingbird','Herbivore','Docile','0')");
        database.execSQL("INSERT INTO Bird (Name,Eat,Hostile,Weight) VALUES ('Red Cardinal','Omnivore','Docile','.09')");
        database.execSQL("INSERT INTO Bird (Name,Eat,Hostile,Weight) VALUES ('Ostrich','Carnivore','Mild','250')");
    }

    private void addSharks(SQLiteDatabase database) {
        database.execSQL("INSERT INTO Shark (Name,Eat,Hostile,Weight) VALUES ('Great White Shark','Carnivore','Vicious','2000')");
        database.execSQL("INSERT INTO Shark (Name,Eat,Hostile,Weight) VALUES ('Tiger Shark','Carnivore','Vicious','850')");
        database.execSQL("INSERT INTO Shark (Name,Eat,Hostile,Weight) VALUES ('Whale Shark','Herbivore','Docile','41000')");
        database.execSQL("INSERT INTO Shark (Name,Eat,Hostile,Weight) VALUES ('Hammerhead Shark','Carnivore','Mild','1000')");
        database.execSQL("INSERT INTO Shark (Name,Eat,Hostile,Weight) VALUES ('Basking Shark','Herbivore','Docile','8000')");
    }

    private void addCats(SQLiteDatabase database) {
        database.execSQL("INSERT INTO Cat (Name,Eat,Hostile,Weight) VALUES ('Tabby','Carnivore','Mild','18')");
        database.execSQL("INSERT INTO Cat (Name,Eat,Hostile,Weight) VALUES ('Jaguar','Carnivore','Vicious','200')");
        database.execSQL("INSERT INTO Cat (Name,Eat,Hostile,Weight) VALUES ('Siamese','Carnivore','Mild','15')");
        database.execSQL("INSERT INTO Cat (Name,Eat,Hostile,Weight) VALUES ('Persian','Carnivore','Mild','13')");
        database.execSQL("INSERT INTO Cat (Name,Eat,Hostile,Weight) VALUES ('Tiger','Carnivore','Mild','400')");
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}
