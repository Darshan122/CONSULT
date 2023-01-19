package com.example.registration_form;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class MainActivity extends AppCompatActivity {
    private EditText emailTextView, passwordTextView;
    private Button btn;
    private ProgressBar progressBar;
    private FirebaseAuth mAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mAuth = FirebaseAuth.getInstance();

        emailTextView = findViewById(R.id.etEmail);
        passwordTextView = findViewById(R.id.etPassword);
        btn = findViewById(R.id.btnSignup);
        progressBar = findViewById(R.id.);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {registerNewUser();}
        });
    }

    private void registerNewUser() {
        progressBar.setVisibility(View.VISIBLE);
        String email,password;
        email = emailTextView.getText().toString();
        password = passwordTextView.getText().toString();

        if (TextUtils.isEmpty(email)){
            Toast.makeText(this, "Please enter email!!!!", Toast.LENGTH_SHORT).show();
            return;
        }if (TextUtils.isEmpty(password)){
            Toast.makeText(this, "Please enter password!!!", Toast.LENGTH_SHORT).show();
            return;
        }

        mAuth
                .createUserWithEmailAndPassword(email,password)
                .addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if (task.isSuccessful()){
                            Toast.makeText(MainActivity.this, "Registration Is Successful!!", Toast.LENGTH_SHORT).show();
                            progressBar.setVisibility(View.GONE);

                            Intent intent = new Intent(MainActivity.this, SignIn.class);
                            startActivity(intent);

                        }else {
                            Toast.makeText(getApplicationContext(), "Registration failed!!" + "Please try again later", Toast.LENGTH_SHORT).show();
                        }
                        progressBar.setVisibility(View.GONE);
                    }
                });
    }
}