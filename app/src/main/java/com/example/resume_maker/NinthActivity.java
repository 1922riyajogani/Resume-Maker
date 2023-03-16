package com.example.resume_maker;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

public class NinthActivity extends AppCompatActivity {

   TextView txtname,txtname1,txtjobtitle,txtcontact,txtemail,txtpt,txtrole,txtic,txtsname;
   TextView txtedegree,txtfos,txtejf,txtyoe,txtlocation,txtsk1,txtsk2,txtsk3,txthobby1,txthobby2;
    SharedPreferences preferences;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ninth);

        preferences = getSharedPreferences("Data",0);

        txtname = findViewById(R.id.txtname);
        txtname1 = findViewById(R.id.txtname1);
        txtjobtitle = findViewById(R.id.txtjobtitle);
        txtcontact = findViewById(R.id.txtcontact);
        txtemail = findViewById(R.id.txtemail);
        txtpt = findViewById(R.id.txtpt);
        txtrole = findViewById(R.id.txtrole);
        txtic = findViewById(R.id.txtic);
        txtsname = findViewById(R.id.txtsname);
        txtedegree = findViewById(R.id.txtedegree);
        txtfos = findViewById(R.id.txtfos);
        txtejf = findViewById(R.id.txtejf);
        txtlocation = findViewById(R.id.txtlocation);
        txtsk1 = findViewById(R.id.txtsk1);
        txtsk2 = findViewById(R.id.txtsk2);
        txtsk3 = findViewById(R.id.txtsk3);
        txthobby1 = findViewById(R.id.txthobby1);
        txthobby2 = findViewById(R.id.txthobby2);


        String fname = preferences.getString("fname","");
        String lname = preferences.getString("lname","");
        String jt = preferences.getString("jt","");
        String email = preferences.getString("email","");
        String phone = preferences.getString("phone","");
        String pt = preferences.getString("pt","");
        String role = preferences.getString("role","");
        String ic = preferences.getString("ic","");
        String sname = preferences.getString("sname","");
        String edegree = preferences.getString("edegree","");
        String fos = preferences.getString("fos","");
        String ejf = preferences.getString("ejf","");
        String location = preferences.getString("location","");
        String skill = preferences.getString("skill","");
        String hobby = preferences.getString("hobby","");

        txtname.setText(""+fname);
        txtname1.setText(""+lname);
        txtjobtitle.setText(""+jt);
        txtemail.setText("E-mail="+email);
        txtcontact.setText("Contact no.="+phone);
        txtpt.setText("Project Title"+pt);
        txtrole.setText("Role"+role);
        txtic.setText("Compony="+ic);
        txtsname.setText("School name="+sname);
        txtedegree.setText("Degree="+edegree);
        txtfos.setText("Field of study="+fos);
        txtejf.setText("Project Title"+ejf);
        txtlocation.setText("Role"+location);
        txtsk1.setText("Compony="+skill);
        txtsk2.setText("Job title="+skill);
        txtsk3.setText("School name="+skill);
        txthobby1.setText("Degree=="+hobby);
        txthobby2.setText("Field of study="+hobby);



    }
}