package com.example.resume_maker;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class FourthActivity extends AppCompatActivity {

    EditText sname,edegree,fos,location;

    TextView next;

    SharedPreferences preferences;
    SharedPreferences.Editor editor;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourth);

        preferences = getSharedPreferences("Data",0);
        editor = preferences.edit();

        sname = findViewById(R.id.sname);
        location = findViewById(R.id.location);
        edegree = findViewById(R.id.edegree);
        fos = findViewById(R.id.fos);
        next = findViewById(R.id.next);

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String SchoolName  = sname.getText().toString();
                String Location = location.getText().toString();
                String EnterDegree = edegree.getText().toString();
                String FieldofStudy = fos.getText().toString();

                if (SchoolName.isEmpty()){
                    sname.setError("Enter School Name!");
                } else if (Location.isEmpty()){
                    location.setError("Enter Location!");
                }else if (EnterDegree.isEmpty()){
                    edegree.setError("Enter Degree!");
                }else if (FieldofStudy.isEmpty()){
                    fos.setError("Enter Field of Study!");
                }else {

                    editor.putString("sname",SchoolName);
                    editor.putString("location",Location);
                    editor.putString("edegree",EnterDegree);
                    editor.putString("fos",FieldofStudy);
                    editor.commit();

                    Intent intent=new Intent(FourthActivity.this,FifthActivity.class);
                    startActivity(intent);
                }

            }
        });
    }
}