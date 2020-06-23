package com.example.gojuon;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.util.LinkedList;

public class StudyActivity extends AppCompatActivity {

    private final LinkedList<String> mWordList = new LinkedList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_study);

        for(int i=0;i<20;i++)
        {
            mWordList.addLast("word" + i);
        }

    }
}
