package com.koles.myfitness;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private LinearLayout profileLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        profileLayout = (LinearLayout) findViewById(R.id.profile);
        profileLayout.setOnClickListener(this);
    }

    @Override
    public void onClick(View view){
        Intent intent = null;
        switch (view.getId()){
            case R.id.profile:
                intent = new Intent(this, ProfileActivity.class);
                startActivity(intent);
                break;
        }
    }
}