package com.example.gojuon;

import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class StudyCard extends AppCompatActivity {

    private TextView textView,txtHiragana,txtKatakana;
    private Integer position;
    private FiftyTone fiftyTone = new FiftyTone();

    @SuppressLint("DefaultLocale")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_study_card);

        txtHiragana = findViewById(R.id.studyCard_hiraganaTxt);
        txtKatakana = findViewById(R.id.studyCard_katakanaTxt);
        textView = findViewById(R.id.studyCard_textView);
        position = getIntent().getIntExtra("position",0) * 5;
        textView.setText(String.format("%d",position));
        txtKatakana.setText(Character.toString(
                fiftyTone.getKatakana(position%5,position/5)));
        txtHiragana.setText(Character.toString(
                fiftyTone.getHiragana(position%5,position/5)));
    }
}
