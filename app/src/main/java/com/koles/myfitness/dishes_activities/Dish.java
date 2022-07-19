package com.koles.myfitness.dishes_activities;

public class Dish {

    private String name;
    private float protein;
    private float fats;
    private float carbohydrates;
    private float calories;

    public Dish (String name, float protein, float fats, float carbohydrates, float calories){
        this.name = name;
        this.protein = protein;
        this.fats = fats;
        this.carbohydrates = carbohydrates;
        this.calories = calories;
    }

    public String getName() {
        return name;
    }

    public float getProtein() {
        return protein;
    }

    public float getFats() {
        return fats;
    }

    public float getCarbohydrates() {
        return carbohydrates;
    }

    public float getCalories() {
        return calories;
    }
}
