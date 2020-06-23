package com.example.gojuon;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<ArrayList<String>> hiragana;
    private ArrayList<ArrayList<String>> katakana;         //片假名
    private final String hiragana_a = "123456";
    private String s="";

    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.menu_textView);

        for(int i=0;i<hiragana_a.length();i++)
            s+=Integer.toString(hiragana_a.indexOf(i));
        textView.setText(s);
    }
}
