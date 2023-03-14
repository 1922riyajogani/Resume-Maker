package com.example.resume_maker;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

public class FifthActivity extends AppCompatActivity {

    CheckBox dance,singing,movie,drawing,reading;

    TextView next;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fifth);

        dance = findViewById(R.id.dance);
        singing = findViewById(R.id.singing);
        movie = findViewById(R.id.movie);
        drawing = findViewById(R.id.drawing);
        reading = findViewById(R.id.reading);
        next = findViewById(R.id.next);

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent=new Intent(FifthActivity.this,SixthActivity.class);
                startActivity(intent);
            }
        });
    }
}