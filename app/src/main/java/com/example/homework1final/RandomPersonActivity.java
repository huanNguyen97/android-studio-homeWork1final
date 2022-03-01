package com.example.homework1final;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.homework1final.api.Api_Functional;
import com.example.homework1final.sub_function.SwipeListener;

public class RandomPersonActivity extends AppCompatActivity {
    // Initialize data
    RelativeLayout randomPersonRelativeLy;
    TextView textView, textView1, textView2, textView3, textView4, textView5, textView6, textView7;
    SwipeListener swipeListener;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_random_person);

        randomPersonRelativeLy = findViewById(R.id.randomPersonLayout);
        textView = findViewById(R.id.textView);
        swipeListener = new SwipeListener(
            randomPersonRelativeLy,
            textView
        );

        // Test calling api
        textView1 = findViewById(R.id.textView1);
        textView2 = findViewById(R.id.textView2);
        textView3 = findViewById(R.id.textView3);
        textView4 = findViewById(R.id.textView4);
        textView5 = findViewById(R.id.textView5);
        textView6 = findViewById(R.id.textView6);
        textView7 = findViewById(R.id.textView7);
        btn = findViewById(R.id.btn1);

        Api_Functional api = new Api_Functional(RandomPersonActivity.this);

        api.getDataFromAPI(
            textView1,
            textView2,
            textView3,
            textView4,
            textView5,
            textView6,
            textView7
        );
        // End test

//        btn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                finish();
//                startActivity(getIntent());
//            }
//        });
    }
}