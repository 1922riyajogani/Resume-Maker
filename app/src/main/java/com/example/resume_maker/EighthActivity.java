package com.example.resume_maker;

import static com.example.resume_maker.R.id.template1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class EighthActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eighth);

    LinearLayout template1 = findViewById(R.id.template1);
    LinearLayout template2 = findViewById(R.id.template2);


    template1.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {

        Intent intent = new Intent(EighthActivity.this, NinthActivity.class);
        startActivity(intent);
    }
});

        template2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(EighthActivity.this, tenthActivity.class);
                startActivity(intent);
            }
        });


    }
}