package com.example.resume_maker;

import static com.example.resume_maker.R.id.template1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class EighthActivity extends AppCompatActivity {

    SharedPreferences preferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eighth);

    LinearLayout template1 = findViewById(R.id.template1);
        preferences = getSharedPreferences("Data",0);


    template1.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {

        Intent intent = new Intent(EighthActivity.this, NinthActivity.class);
        startActivity(intent);
    }
});

        String fname = preferences.getString("fname","");
        String lname = preferences.getString("lname","");
        String email = preferences.getString("email","");
        String contact = preferences.getString("phone","");


    }
}