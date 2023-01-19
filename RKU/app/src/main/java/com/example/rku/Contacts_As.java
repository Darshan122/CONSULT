package com.example.rku;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Contacts_As extends AppCompatActivity {

    ImageButton btn_call;
    ImageButton btn_web;
    ImageButton btn_email;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contacts_as);

        getSupportActionBar().setTitle("Contact us");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(Color.parseColor("#800000")));

        ImageButton btn_call = (ImageButton) findViewById(R.id.btn_call);
        ImageButton btn_web = (ImageButton) findViewById(R.id.btn_web);
        ImageButton btn_email = (ImageButton) findViewById(R.id.btn_email);

        btn_call.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:0123456789"));
                startActivity(intent);
            }
        });

        btn_web.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Contacts_As.this,RkuWebView.class);
                startActivity(i);
            }
        });

        String subject = "Hello";
        String body = "Hello World!";
        btn_email.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                Uri data = Uri.parse("mailto:dzalavadiya376@rku.ac.in?subject=" + Uri.encode(subject) + "&body=" + Uri.encode(body));
                intent.setData(data);
                startActivity(intent);
            }
        });

    }

    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }

}