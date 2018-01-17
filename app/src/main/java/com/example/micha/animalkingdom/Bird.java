package com.example.micha.animalkingdom;

/**
 * Created by micha on 1/16/2018.
 */

public class Bird implements Animal {
    private String name,eat,hostile,weight;
    public static final int WEIGHT_THRESHOLD = 1;

    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getEat() {
        return eat;
    }

    public void setEat(String eat) {
        this.eat = eat;
    }

    @Override
    public String getHostile() {
        return hostile;
    }

    public void setHostile(String hostile) {
        this.hostile = hostile;
    }

    @Override
    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public Bird(String name, String eat, String hostile, String weight) {

        this.name = name;
        this.eat = eat;
        this.hostile = hostile;
        this.weight = weight;
    }
}
