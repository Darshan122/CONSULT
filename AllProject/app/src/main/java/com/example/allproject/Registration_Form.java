package com.example.allproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.Switch;
import android.widget.TextView;

public class Registration_Form extends AppCompatActivity {
    String s="";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button submit = (Button) findViewById(R.id.submit);
        TextView showtext = (TextView) findViewById(R.id.show);
        EditText name = (EditText) findViewById(R.id.name);
        EditText enroll = (EditText) findViewById(R.id.enroll);
        EditText course = (EditText) findViewById(R.id.course);
        EditText branch = (EditText) findViewById(R.id.branch);
        Spinner sem = (Spinner) findViewById(R.id.sem);
        Switch rd = (Switch) findViewById(R.id.rd);
        RadioButton m = (RadioButton) findViewById(R.id.male);
        RadioButton f = (RadioButton) findViewById(R.id.female);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String rdstatus, gender;

                if(rd.isChecked())
                    rdstatus = "D2D";
                else
                    rdstatus = "Regular";

                if(m.isChecked())
                    gender = "Male";
                else
                    gender = "Female";

                s = s + " " + name.getText() + "\n" + enroll.getText() + "\n" + course.getText() + "\n" + branch.getText() + "\n" + sem.getSelectedItem() + "\n" + rdstatus + "\n" + gender;

                showtext.setText(s);

                submit.setEnabled(false);

            }
        });
    }


}