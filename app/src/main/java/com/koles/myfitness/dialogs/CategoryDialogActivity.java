package com.koles.myfitness.dialogs;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.koles.myfitness.R;

public class CategoryDialogActivity extends AppCompatActivity implements View.OnClickListener {

    private Button ok, cancel;
    private final String TAG = "CategoryDialog";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category_dialog);
        setTitle("");
        ok = findViewById(R.id.addDialog_Ok);
        cancel = findViewById(R.id.addDialog_Cancel);
        ok.setOnClickListener(this);
        cancel.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.addDialog_Ok:
                addCategory();
                break;
            case R.id.addDialog_Cancel:
                cancel();
                break;
        }
    }

    private void addCategory(){
        EditText foodCategory = findViewById(R.id.editText_addCategoryDialog);
        String category = foodCategory.getText().toString();
        Toast.makeText(this, "Категория добавлена", Toast.LENGTH_LONG).show();


        finish();

    }

    private void cancel(){
        finish();
    }

}