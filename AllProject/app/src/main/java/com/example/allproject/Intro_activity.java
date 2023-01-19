package com.example.allproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Intro_activity extends AppCompatActivity {
    Button clock_btn,calculator_btn,reg_btn,tut_1,tut_2,tut_3,tut_4,tut_5,tut_6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intro);
        clock_btn = findViewById(R.id.clock_btn);
        calculator_btn = findViewById(R.id.calculator_btn);
        reg_btn = findViewById(R.id.reg_btn);
        tut_1 = findViewById(R.id.tut_1);
        tut_2 = findViewById(R.id.tut_2);
        tut_3 = findViewById(R.id.tut_3);
        tut_4 = findViewById(R.id.tut_4);
        tut_5 = findViewById(R.id.tut_5);
        tut_6 = findViewById(R.id.tut_6);
        clock_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Intro_activity.this, Clock_Activity.class));
                Toast.makeText(Intro_activity.this, "Welcome to My Clock", Toast.LENGTH_SHORT).show();
            }
        });
        calculator_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Intro_activity.this, Calculator.class));
                Toast.makeText(Intro_activity.this, "Welcome to My Calculator", Toast.LENGTH_SHORT).show();
            }
        });
        reg_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Intro_activity.this, Registration_Form.class));
                Toast.makeText(Intro_activity.this, "Welcome to My Registration_Form", Toast.LENGTH_SHORT).show();
            }
        });
        tut_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Intro_activity.this, Tutorial_01.class));
                Toast.makeText(Intro_activity.this, "Welcome to My Tutorial_01", Toast.LENGTH_SHORT).show();
            }
        });
        tut_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Intro_activity.this, Tutorial_02.class));
                Toast.makeText(Intro_activity.this, "Welcome to My Tutorial_02", Toast.LENGTH_SHORT).show();
            }
        });
        tut_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Intro_activity.this, Tutorial_03.class));
                Toast.makeText(Intro_activity.this, "Welcome to My Tutorial_03", Toast.LENGTH_SHORT).show();
            }
        });
        tut_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Intro_activity.this, Tutorial_04.class));
                Toast.makeText(Intro_activity.this, "Welcome to My Tutorial_04", Toast.LENGTH_SHORT).show();
            }
        });
        reg_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Intro_activity.this, Registration_Form.class));
                Toast.makeText(Intro_activity.this, "Welcome to My Registration_Form", Toast.LENGTH_SHORT).show();
            }
        });
        tut_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Intro_activity.this, Tutorial_05.class));
                Toast.makeText(Intro_activity.this, "Welcome to My Tutorial_05", Toast.LENGTH_SHORT).show();
            }
        });
        tut_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Intro_activity.this, Tutorial_06.class));
                Toast.makeText(Intro_activity.this, "Welcome to My Tutorial_05", Toast.LENGTH_SHORT).show();
            }
        });


    }
}