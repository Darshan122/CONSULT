package com.example.sharedpreferences;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Login extends AppCompatActivity {

    TextView l_email,l_password;
    Button btn_login,lbtn_signin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        l_email = findViewById(R.id.l_email);
        l_password = findViewById(R.id.l_password);
        btn_login = findViewById(R.id.btn_login);
        lbtn_signin = findViewById(R.id.lbtn_signin);

        btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String email = l_email.getText().toString();
                String password = l_password.getText().toString();

                SharedPreferences preferences = getSharedPreferences("register", MODE_PRIVATE);

                String l_email = preferences.getString("email","" );
                String l_password = preferences.getString("password","" );

                if (email.equals(l_email) && password.equals(l_password))
                {
                    Intent intent = new Intent(Login.this,Display.class);
                    startActivity(intent);
                }else {


              
            }
        });
        lbtn_signin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Login.this,Register.class);
                startActivity(intent);
            }
        });

    }
}