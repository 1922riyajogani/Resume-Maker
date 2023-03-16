package com.example.resume_maker;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class ThirdActivity extends AppCompatActivity {

    EditText ejf,location,yoe,jt;

    TextView next;

    SharedPreferences preferences;
    SharedPreferences.Editor editor;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        preferences = getSharedPreferences("Data",0);
        editor = preferences.edit();

        ejf = findViewById(R.id.ejf);
        location = findViewById(R.id.location);
        yoe = findViewById(R.id.yoe);
        jt = findViewById(R.id.jt);
        next = findViewById(R.id.next);

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String EnterJobFunction  = ejf.getText().toString();
                String Location = location.getText().toString();
                String YearofExpirience = yoe.getText().toString();
                String JobTitle = jt.getText().toString();

                if (EnterJobFunction.isEmpty()){
                    ejf.setError("Enter Job Function!");
                } else if (Location.isEmpty()){
                    location.setError("Enter Location!");
                }else if (YearofExpirience.isEmpty()){
                    yoe.setError("Enter Year of Expirience!");
                }else if (JobTitle.isEmpty()){
                    jt.setError("Enter Job Title!");
                }else {

                    editor.putString("ejf",EnterJobFunction);
                    editor.putString("location",Location);
                    editor.putString("yoe",YearofExpirience);
                    editor.putString("jt",JobTitle);
                    editor.commit();

                    Intent intent=new Intent(ThirdActivity.this,FourthActivity.class);
                    startActivity(intent);
                }

            }
        });

    }
}