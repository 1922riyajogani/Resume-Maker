package com.example.resume_maker;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

public class NinthActivity extends AppCompatActivity {

   TextView fname;
    SharedPreferences preferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ninth);



        preferences = getSharedPreferences("Data",0);

        fname = findViewById(R.id.fname);

        String fname = preferences.getString("fname","");



    }
}