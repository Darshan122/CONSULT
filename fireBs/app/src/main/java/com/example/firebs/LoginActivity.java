package com.example.firebs;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class LoginActivity extends AppCompatActivity {
    EditText signupemail;
    EditText signuppassword;
    Button loginbtn;
    Button signupbtn;
    FirebaseAuth firebaseAuth;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        signupemail = findViewById(R.id.signupemail);
        signuppassword = findViewById(R.id.signuppassword);
        loginbtn = findViewById(R.id.loginbtn);
        signupbtn = findViewById(R.id.signupbtn);

        signupbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(LoginActivity.this,MainActivity.class));
            }
        });

        loginbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String Email = signupemail.getText().toString();
                String Password = signuppassword.getText().toString();
                firebaseAuth = FirebaseAuth.getInstance();

                if (Email.isEmpty()){
                    signupemail.setError("Please Enter Your Email!!");
                    signupemail.requestFocus();
                }else if (Password.isEmpty()){
                    signuppassword.setError("Please Enter Password!!!");
                    signuppassword.requestFocus();
                }else if (!Email.isEmpty() && !Password.isEmpty()){
                    firebaseAuth.signInWithEmailAndPassword(Email,Password).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                        @Override
                        public void onComplete(@NonNull Task<AuthResult> task) {
                            if (!task.isSuccessful()){
                                Toast.makeText(LoginActivity.this, "login Is Successfully", Toast.LENGTH_SHORT).show();
                                startActivity(new Intent(LoginActivity.this,HomeActivity.class));
                            }else {
                                Toast.makeText(LoginActivity.this, "login is Failed!!", Toast.LENGTH_SHORT).show();
                            }
                        }
                    });
                }
            }
        });

    }
}