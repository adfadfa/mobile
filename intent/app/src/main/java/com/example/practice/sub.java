package com.example.practice;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class sub extends AppCompatActivity {

    private TextView sub_txt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub);


        sub_txt = findViewById(R.id.sub_str);
        Intent intent = getIntent();
        String str = intent.getStringExtra("str");

        sub_txt.setText(str); //hihi




    }
}
