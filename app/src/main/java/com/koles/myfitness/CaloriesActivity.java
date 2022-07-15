package com.koles.myfitness;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CaloriesActivity extends AppCompatActivity {

    private ListView foodList;
    private List<String> list;
    private Button addCategoryButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calories);
        foodList = (ListView) findViewById(R.id.listView);
        addCategoryButton = (Button) findViewById(R.id.button_addCategory);
        addCategoryButton.setOnClickListener(v -> {
            Intent intent = new Intent(this, AddFoodCategoryActivity.class);
            startActivity(intent);
        });
        list = new ArrayList<>(Arrays.asList(getFoodCategoryArray()));
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,
                android.R.layout.simple_list_item_1, list);

        foodList.setAdapter(adapter);
    }

    private String[] getFoodCategoryArray(){
        return getResources().getStringArray(R.array.food);
    }
}