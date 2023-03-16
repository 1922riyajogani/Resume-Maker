package com.example.resume_maker;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

public class FifthActivity extends AppCompatActivity {

    CheckBox dance,singing,movie,drawing,reading;

    TextView next,hobby;

    SharedPreferences preferences;
    SharedPreferences.Editor editor;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fifth);

        preferences = getSharedPreferences("Data",0);
        editor = preferences.edit();

        dance = findViewById(R.id.dance);
        singing = findViewById(R.id.singing);
        movie = findViewById(R.id.movie);
        drawing = findViewById(R.id.drawing);
        reading = findViewById(R.id.reading);
        hobby = findViewById(R.id.hobby);
        next = findViewById(R.id.next);

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String Hobby = hobby.getText().toString();

                if (Hobby.isEmpty()) {
                    hobby.setError("Select any one!");
                } else {

                    editor.putString("hobby", Hobby);
                    editor.commit();

                    Intent intent = new Intent(FifthActivity.this, SixthActivity.class);
                    startActivity(intent);
                }

            }

        });

    }
}
