package com.example.homework1final;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    // Initialize data
    Button favoriteListBtn, randomPersonBtn;
    // End initializing

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialize view's
        favoriteListBtn = findViewById(R.id.favoriteListBtn);
        randomPersonBtn = findViewById(R.id.randomPersonBtn);
        // End initializing

        // Events for button clicking
        // FavoriteList clicking
        favoriteListBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, FavoriteListActivity.class);
                startActivity(intent);
            }
        });
        // End clicking

        // RandomPerson clicking
        randomPersonBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, RandomPersonActivity.class);
                startActivity(intent);
            }
        });
        // End clicking
        // End event
    }
}