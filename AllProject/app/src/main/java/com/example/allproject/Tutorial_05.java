package com.example.allproject;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Switch;
import android.widget.TextView;

public class Tutorial_05 extends AppCompatActivity {
    String s="";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tutorial05);

        EditText name = findViewById(R.id.Name);
        TextView showtext = (TextView) findViewById(R.id.show);
        EditText last = findViewById(R.id.Last);
        EditText email = findViewById(R.id.Email);
        EditText pass = findViewById(R.id.Password);
        RadioButton male = findViewById(R.id.male);
        RadioButton female = findViewById(R.id.female);
        Switch rd = findViewById(R.id.Branch);
        CheckBox status = findViewById(R.id.Stauts);
        Button reg = findViewById(R.id.btnreg);

        reg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String branch, gender;

                if(rd.isChecked())
                    branch = "D2D";
                else
                    branch = "Regular";
                if(male.isChecked())
                    gender = "Male";
                else
                    gender = "Female";

                s = s + " " + name.getText() + "\n" + last.getText() + "\n" + email.getText() + "\n" + pass.getText()  +  "\n" + rd + "\n" + gender;

                showtext.setText(s);

                reg.setEnabled(false);
            }
        });






    }

}