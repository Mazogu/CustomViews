package com.example.micha.animalkingdom.data;

/**
 * Created by micha on 1/16/2018.
 */

public class DatabaseContract {

    public static final String CREATE_STRING = "(" + Attributes.NAME + " TEXT PRIMARY KEY," +
            Attributes.EAT + " TEXT," + Attributes.HOSTILE + " TEXT," + Attributes.WEIGHT + " TEXT)";

    public static final String CREATE_CAT_TABLE = "CREATE TABLE " + Animals.CATS + CREATE_STRING;
    public static final String CREATE_SHARK_TABLE = "CREATE TABLE " + Animals.SHARKS + CREATE_STRING;
    public static final String CREATE_BIRD_TABLE = "CREATE TABLE " + Animals.BIRDS + CREATE_STRING;

    public static class Animals{
        public static final String CATS = "Cats";
        public static final String SHARKS = "Sharks";
        public static final String BIRDS = "Birds";
    }

    public static class Attributes{
        public static final String NAME = "Name";
        public static final String EAT = "Eat";
        public static final String HOSTILE = "Hostile";
        public static final String WEIGHT = "Weight";
    }
}
