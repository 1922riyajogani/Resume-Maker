package com.example.resume_maker;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

import org.w3c.dom.Text;

public class SixthActivity extends AppCompatActivity {

    CheckBox creativity,clt,ls,sales,timemanagement,cp,ba;

    TextView next;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sixth);

        creativity = findViewById(R.id.creativity);
        clt = findViewById(R.id.clt);
        ls = findViewById(R.id.ls);
        sales = findViewById(R.id.sales);
        timemanagement = findViewById(R.id.timemanagement);
        cp = findViewById(R.id.cp);
        ba = findViewById(R.id.ba);
        next = findViewById(R.id.next);

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent=new Intent(SixthActivity.this,SeventhActivity.class);
                startActivity(intent);
            }
        });
    }
}