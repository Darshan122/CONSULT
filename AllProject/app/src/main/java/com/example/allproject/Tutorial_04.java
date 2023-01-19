package com.example.allproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Tutorial_04 extends AppCompatActivity {
    EditText email,password;
    Button loginbtn;

    String Email = "abc";
    String Password = "123";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tutorial04);

        email = (EditText) findViewById(R.id.email);
        password = (EditText) findViewById(R.id.password);
        loginbtn = (Button) findViewById(R.id.loginbtn);

        loginbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

//                String inputEmail = email.getText().toString();
//                String inputPassword = password.getText().toString();

              if (TextUtils.isEmpty(email.getText().toString()) || TextUtils.isEmpty(password.getText().toString())){
                  Toast.makeText(Tutorial_04.this, "fhdgukhvnnv", Toast.LENGTH_SHORT).show();
              }else  if (email.getText().toString().equals(Email)){
                  if (password.getText().toString().equals(Password)){
                      Toast.makeText(Tutorial_04.this, "gkscgcsskgsku", Toast.LENGTH_SHORT).show();
                  }
              }else {
                  Toast.makeText(Tutorial_04.this, "cbkjdcbkjbcskb", Toast.LENGTH_SHORT).show();
              }
            }
        });


    }

}
