package com.koles.myfitness;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.text.InputType;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

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
        setTitle("Калорийность продуктов");
        foodList = (ListView) findViewById(R.id.listView);
        addCategoryButton = (Button) findViewById(R.id.button_addCategory);
        addCategoryButton.setOnClickListener(v -> {
            //Intent intent = new Intent(this, AddFoodCategoryActivity.class);
            //startActivity(intent);
            AddCategoryDialog dialog = new AddCategoryDialog();
            dialog.show(getSupportFragmentManager(), "My Dialog");
            System.out.println(dialog.getMyDialog() == null);
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