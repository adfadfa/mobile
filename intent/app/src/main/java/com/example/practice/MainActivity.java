package com.example.practice;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText textcon ;
    Button btn_trans ;
    String str ;
    ImageView test ;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        btn_trans = findViewById(R.id.btn_trans);
        btn_trans.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textcon = findViewById(R.id.txt_con);
                str = textcon.getText().toString();
                Intent intent = new Intent(MainActivity.this, sub.class);
                intent.putExtra("str",str);
                startActivity(intent);
            }
        });

        test = (ImageView)findViewById(R.id.test);
        test.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(), "팝업 경고", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
