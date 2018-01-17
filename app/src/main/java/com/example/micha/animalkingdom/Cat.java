package com.example.micha.animalkingdom;

/**
 * Created by micha on 1/16/2018.
 */

public class Cat implements Animal {

    private String name, eat, hostile, weight;
    public static final int WEIGHT_THRESHOLD = 100;

    public Cat(String name, String eat, String hostile, String weight) {
        this.name = name;
        this.eat = eat;
        this.hostile = hostile;
        this.weight = weight;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getEat() {
        return eat;
    }

    @Override
    public String getHostile() {
        return hostile;
    }

    @Override
    public String getWeight() {
        return weight;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEat(String eat) {
        this.eat = eat;
    }

    public void setHostile(String hostile) {
        this.hostile = hostile;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }
}
