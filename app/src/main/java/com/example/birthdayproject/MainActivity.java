package com.example.birthdayproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button b1;
    EditText et;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b1=  findViewById(R.id.button);
        et =  findViewById(R.id.editTextTextPersonName);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name;
                name = et.getText().toString();
                
                if(name.isEmpty()){
                    Toast.makeText(MainActivity.this, "Please enter a name", Toast.LENGTH_LONG).show();
                }else {
                    Intent i = new Intent(MainActivity.this, finalcard.class);

                    i.putExtra("k1", name);
                    startActivity(i);
                }
            }
        });

    }
}