package com.example.birthdayproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class finalcard extends AppCompatActivity {
    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_finalcard);
        tv =  findViewById(R.id.textView2);
        Bundle b = getIntent().getExtras();
        String s=   b.getString("k1");


       tv.setText("Happy Birthday "+s+" !! <3");

    }
}