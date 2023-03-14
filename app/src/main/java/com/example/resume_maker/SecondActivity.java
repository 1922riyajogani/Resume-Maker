package com.example.resume_maker;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.renderscript.ScriptGroup;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    EditText fname,lname,email,pnumber;
    TextView next;
    SharedPreferences preferences;
    SharedPreferences.Editor editor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        preferences = getSharedPreferences("Data",0);
        editor = preferences.edit();

        fname = findViewById(R.id.fname);
        lname = findViewById(R.id.lname);
        email = findViewById(R.id.email);
        pnumber = findViewById(R.id.pnumber);
        next = findViewById(R.id.next);

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {



                String FirstName = fname.getText().toString();
                String Lastname = lname.getText().toString();
                String Email = email.getText().toString();
                String PhoneNumber = pnumber.getText().toString();

                if (FirstName.isEmpty()){
                    fname.setError("Enter First Name!");
                } else if (Lastname.isEmpty()){
                    lname.setError("Enter Last Name!");
                }else if (Email.isEmpty()){
                    email.setError("Enter email!");
                }else if (!Email.contains("@gmail.com")){
                    email.setError("Enter Valid email!");
                }else if (PhoneNumber.isEmpty()){
                    pnumber.setError("Enter Phone Number!");
                }else if (PhoneNumber.length() !=10){
                    pnumber.setError("Enter  Valid Phone Number!");
                }else {

                    editor.putString("fname",FirstName);
                    editor.putString("lname",Lastname);
                    editor.putString("email",Email);
                    editor.putString("phone",PhoneNumber);
                    editor.commit();

                    Intent intent=new Intent(SecondActivity.this,ThirdActivity.class);
                    startActivity(intent);


                }

            }
        });

    }
}