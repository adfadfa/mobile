package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ListView list ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        list =(ListView) findViewById(R.id.list); // 리스튜뷰에 출력할 id 불러오기

        List<String> data = new ArrayList<>(); //데이터 저장 배열 생성

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,data); // 데이터를 담을 어댑터 생성

        list.setAdapter(adapter); // 리스트에 어댑터 장착

        data.add("서준형");
        data.add("안드로이드");
        data.add("사과");
        adapter.notifyDataSetChanged(); // 현재 상태 저장

    }
}
