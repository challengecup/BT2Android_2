package com.example.lab2android_2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button redbutton, greenbutton, bluebutton, graybutton;
    ConstraintLayout layout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        redbutton = findViewById(R.id.redBTN);
        greenbutton = findViewById(R.id.greenBTN);
        bluebutton = findViewById(R.id.blueBTN);
        graybutton = findViewById(R.id.grayBTN);
        layout = findViewById(R.id.constraint);

        redbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                layout.setBackgroundColor(Color.RED);
            }
        });

        greenbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                layout.setBackgroundColor(Color.GREEN);
            }
        });

        bluebutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                layout.setBackgroundColor(Color.BLUE);
            }
        });

        graybutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                layout.setBackgroundColor(Color.GRAY);
            }
        });

    }
}