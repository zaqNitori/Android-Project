package com.example.gojuon;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;

import java.util.ArrayList;
import java.util.LinkedList;

public class StudyActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private WordListAdapter mAdapter;
    private LinkedList<String> mData = new LinkedList<>();
    private FiftyTone fiftyTone = new FiftyTone();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_study);

        //準備資料
        for(int i=0;i<fiftyTone.getSize();i++)
        {
            mData.add(fiftyTone.getHiragana(i));
        }

        //連結元件
        recyclerView = findViewById(R.id.recycler_view);

        mAdapter = new WordListAdapter(this,mData);

        recyclerView.setAdapter(mAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        //設置格線
        recyclerView.addItemDecoration(new DividerItemDecoration(
                this,DividerItemDecoration.VERTICAL));
    }

    public void study_goBack(View v)
    {
        finish();
    }


}
