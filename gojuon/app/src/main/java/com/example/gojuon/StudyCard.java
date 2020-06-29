package com.example.gojuon;

import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class StudyCard extends AppCompatActivity {

    private TextView textSound,textHiragana,textKatakana,textWord,textMeaning;
    private TextView infoSound,infoHiragana,infoKatakana,infoWord,infoMeaning,infoImg;
    private Integer position,info = 0;
    private FiftyTone fiftyTone = new FiftyTone();
    private ImageButton lArrow,rArrow;

    @SuppressLint("DefaultLocale")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_study_card);

        infoSound = findViewById(R.id.studyCard_infoSound);
        infoHiragana = findViewById(R.id.studyCard_infoHiragana);
        infoKatakana = findViewById(R.id.studyCard_infoKatakana);
        infoWord = findViewById(R.id.studyCard_infoWord);
        infoMeaning = findViewById(R.id.studyCard_infoMeaning);
        infoImg = findViewById(R.id.studyCard_infoimage);
        textHiragana = findViewById(R.id.studyCard_hiraganaTxt);
        textKatakana = findViewById(R.id.studyCard_katakanaTxt);
        textSound = findViewById(R.id.studyCard_sound);
        textWord = findViewById(R.id.studyCard_words);
        textMeaning = findViewById(R.id.studyCard_meaning);
        lArrow = findViewById(R.id.studyCard_leftArrow);
        rArrow = findViewById(R.id.studyCard_rightArrow);

        position = getIntent().getIntExtra("position",0) * 5;
        textSound.setText(fiftyTone.getWordSound(position));
        textKatakana.setText(Character.toString(
                fiftyTone.getKatakana(position%5,position/5)));
        textHiragana.setText(Character.toString(
                fiftyTone.getHiragana(position%5,position/5)));
        textWord.setText(fiftyTone.getVocabulary(position%5,position/5));
        textMeaning.setText(fiftyTone.getMeaning(position%5,position/5));
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
        textWord.setText(fiftyTone.getVocabulary(position%5,position/5));
        textMeaning.setText(fiftyTone.getMeaning(position%5,position/5));
    }

    public void studyCard_goBack(View view)
    {
        finish();
    }

    public void studyCard_setInfo(View v)
    {
        info+=1;
        if(info%2==1)
        {
            infoSound.setVisibility(View.VISIBLE);
            infoKatakana.setVisibility(View.VISIBLE);
            infoHiragana.setVisibility(View.VISIBLE);
            infoImg.setVisibility(View.VISIBLE);
            infoWord.setVisibility(View.VISIBLE);
            infoMeaning.setVisibility(View.VISIBLE);
        }
        else
        {
            infoSound.setVisibility(View.INVISIBLE);
            infoKatakana.setVisibility(View.INVISIBLE);
            infoHiragana.setVisibility(View.INVISIBLE);
            infoImg.setVisibility(View.INVISIBLE);
            infoWord.setVisibility(View.INVISIBLE);
            infoMeaning.setVisibility(View.INVISIBLE);
        }
    }

}
