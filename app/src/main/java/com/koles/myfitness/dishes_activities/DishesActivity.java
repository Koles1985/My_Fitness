package com.koles.myfitness.dishes_activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.koles.myfitness.R;

public class DishesActivity extends AppCompatActivity {

    private String title;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dishes);
        title = getIntent().getStringExtra("title");
        setTitle(title);
        new ListsDishes(this).getMeat();
    }

    /**
     * Открывает список блюд
     * в зависимости от переданой категории
     * @param productCategory название категории продуктов
     */
    private void openDishesList(String productCategory){

    }
}