package com.example.resume_maker;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class SeventhActivity extends AppCompatActivity {

    EditText pt,role,ic,location;

    TextView next;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seventh);

        pt = findViewById(R.id.pt);
        role = findViewById(R.id.role);
        ic = findViewById(R.id.ic);
        location = findViewById(R.id.location);
        next = findViewById(R.id.next);

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String Projecttitle  = pt.getText().toString();
                String Location = location.getText().toString();
                String Role = role.getText().toString();
                String InstituteCompany = ic.getText().toString();

                if (Projecttitle.isEmpty()){
                    pt.setError("Enter Project title!");
                } else if (Location.isEmpty()){
                    location.setError("Enter Location!");
                }else if (Role.isEmpty()){
                    role.setError("Enter  Your Role!");
                }else if (InstituteCompany.isEmpty()){
                    ic.setError("Enter Institute or Company!");
                }else {

                    Intent intent = new Intent(SeventhActivity.this, EighthActivity.class);
                    startActivity(intent);
                }
            }
        });
    }
}