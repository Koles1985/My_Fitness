package com.koles.myfitness;

import androidx.appcompat.app.AppCompatActivity;


import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import com.koles.myfitness.dialogs.CategoryDialogActivity;
import com.koles.myfitness.dishes_activities.DishesActivity;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CaloriesActivity extends AppCompatActivity {

    private ListView foodList;
    private List<String> list;
    private Button addCategoryButton;
    private final String TAG = "Calories";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calories);
        setTitle("Калорийность продуктов");


        addCategoryButton = findViewById(R.id.button_addCategory);
        addCategoryButton.setOnClickListener(v -> {
            Intent intent = new Intent(this, CategoryDialogActivity.class);
            startActivity(intent);

        });

        list = new ArrayList<>(Arrays.asList(getFoodCategoryArray()));
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,
                android.R.layout.simple_list_item_1, list);

        foodList = findViewById(R.id.listView);
        foodList.setAdapter(adapter);
    }

    @Override
    protected void onStart() {
        super.onStart();
        openSubCategoryList();
    }

    /**
     * получаем массив строк из каталога values файла strings.xml
     * @return массив строк
     */
    private String[] getFoodCategoryArray(){
        return getResources().getStringArray(R.array.food);
    }

    /**
     * при нажатиии на категорию
     * открывает новый активити со списком подкатегорий
     * выбраной категории
     */
    private void openSubCategoryList(){
        foodList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String title = list.get(position);
                Intent intent = new Intent(getApplicationContext(), DishesActivity.class);
                intent.putExtra("title", title);
                startActivity(intent);
            }
        });
    }
}