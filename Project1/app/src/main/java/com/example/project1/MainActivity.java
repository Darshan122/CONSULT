package com.example.project1;

import  androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("Life Cycle","onCreate invoked");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("Life Cycle","onStart invoked");

    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("Life Cycle","onResume invoked");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("Life Cycle","onPause invoked");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("Life Cycle","onStop invoked");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("Life Cycle","onRestart invoked");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("Life Cycle","onDestroy invoked");
    }
}