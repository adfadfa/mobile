package com.example.database;

import androidx.appcompat.app.AppCompatActivity;
import androidx.room.Room;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText edittext ;
    private TextView textview ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edittext = findViewById(R.id.edit_text);
        textview = findViewById(R.id.result_text);

        final AppDatabase db = Room.databaseBuilder(this, AppDatabase.class, "todo-db") // db작성
                .allowMainThreadQueries()
                .build();



        findViewById(R.id.add_button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                db.todoDao().instert(new Todo(edittext.getText().toString())); // 데이터베이스에 eidtext  insert
                textview.setText(db.todoDao().getAll().toString()) ; // 데이터베이스에 저장된 값 출력
            }
        });


    }
}
