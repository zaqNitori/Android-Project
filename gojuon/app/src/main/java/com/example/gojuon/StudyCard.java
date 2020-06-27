package com.example.gojuon;

import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class StudyCard extends AppCompatActivity {

    private TextView textSound,textHiragana,textKatakana;
    private Integer position;
    private FiftyTone fiftyTone = new FiftyTone();
    private ImageButton lArrow,rArrow;

    @SuppressLint("DefaultLocale")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_study_card);

        textHiragana = findViewById(R.id.studyCard_hiraganaTxt);
        textKatakana = findViewById(R.id.studyCard_katakanaTxt);
        textSound = findViewById(R.id.studyCard_textView);
        lArrow = findViewById(R.id.studyCard_leftArrow);
        rArrow = findViewById(R.id.studyCard_rightArrow);

        position = getIntent().getIntExtra("position",0) * 5;
        textSound.setText(fiftyTone.getWordSound(position));
        textKatakana.setText(Character.toString(
                fiftyTone.getKatakana(position%5,position/5)));
        textHiragana.setText(Character.toString(
                fiftyTone.getHiragana(position%5,position/5)));
    }

    public void studyCard_goPreStudyCard(View view)
    {
        position-=1;
        if(position == 36 || position == 38 || position == 46 || position == 48) position-=1;
        updateStudyCard(position);
    }

    public void studyCard_goNextStudyCard(View view)
    {
        position+=1;
        if(position == 36 || position == 38 || position == 46 || position == 48) position+=1;
        updateStudyCard(position);
    }

    @SuppressLint("DefaultLocale")
    private void updateStudyCard(int pos)
    {
        if(position == 0) lArrow.setVisibility(View.INVISIBLE);
        else lArrow.setVisibility(View.VISIBLE);
        if(position == 49) rArrow.setVisibility(View.INVISIBLE);
        else rArrow.setVisibility(View.VISIBLE);
        textSound.setText(fiftyTone.getWordSound(pos));
        textHiragana.setText(Character.toString(fiftyTone.getHiragana(pos%5,pos/5)));
        textKatakana.setText(Character.toString(fiftyTone.getKatakana(pos%5,pos/5)));
    }

    public void studyCard_goBack(View view)
    {
        finish();
    }

}
