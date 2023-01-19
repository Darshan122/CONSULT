package com.example.databaseconnection;

import androidx.appcompat.app.AppCompatActivity;

import android.database.Cursor;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public ceitdbc obj1 = new ceitdbc(this);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void func1(View view) {

        EditText e1 = (EditText) findViewById(R.id.edn);
        EditText e2 = (EditText) findViewById(R.id.edb);
        EditText e3 = (EditText) findViewById(R.id.edm);

        String s1, s2, s3;

        s1 = e1.getText().toString();
        s2 = e2.getText().toString();
        Integer i1 = Integer.parseInt((e3.getText().toString()));

        if (!s1.equals("") && (!s2.equals(""))) {
            if (obj1.savedata(s1, s2, i1)) {
                Toast.makeText(this, "DATA ADDED ", Toast.LENGTH_LONG).show();
                func2(view);
            } else {
                Toast.makeText(this, "DATA insertion error ", Toast.LENGTH_LONG).show();
            }
        } else {
            Toast.makeText(this, "Fields can't be empty", Toast.LENGTH_LONG).show();
        }
    }

    public void func2(View view) {
        Cursor c1 = obj1.getdata();
        String show = "";
        TextView t1 = (TextView) findViewById(R.id.tvview1);
        if (c1 != null && c1.getCount() > 0) {
            c1.moveToFirst();
            do {
                String s1 = c1.getString(0);
                String s2 = c1.getString(1);
                String s3 = c1.getString(2);
                String s4 = c1.getString(3);

                show += s1 + " " + s2 + " " + s3 + " " + s4 + "\n";
            } while (c1.moveToNext());
            t1.setText(show);
        } else {
            Toast.makeText(this, "Data fetch error", Toast.LENGTH_LONG).show();

        }

    }
}
