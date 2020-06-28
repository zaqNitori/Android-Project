package com.example.gojuon;

import android.os.Build;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Random;
import java.util.Set;

public class QuizCard extends AppCompatActivity {

    private Integer mode;
    private FiftyTone fiftyTone = new FiftyTone();
    private ImageView imgView;
    private TextView textQuestion;
    private Random rand=new Random();
    private Button btnAns1,btnAns2,btnAns3,btnAns4;
    private ArrayList<Integer> integerArrayList = new ArrayList<Integer>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_card);

        imgView = findViewById(R.id.quizCard_questionImg);
        textQuestion = findViewById(R.id.quizCard_question);
        btnAns1 = findViewById(R.id.quizCard_btnAns1);
        btnAns2 = findViewById(R.id.quizCard_btnAns2);
        btnAns3 = findViewById(R.id.quizCard_btnAns3);
        btnAns4 = findViewById(R.id.quizCard_btnAns4);

        mode = getIntent().getIntExtra("testMode",0);
        if(mode == 0)       //考試範圍五十音
        {
            imgView.setVisibility(View.GONE);
        }

    }

    public void quizCard_goBack(View v)
    {
        setQuesAns();
    }

    private void setQuesAns()
    {
        int quesType=0,ansType=0,which;
        if(mode == 0)
        {
            quesType=rand.nextInt(3);      //hiragana、katakana、sound選一個
            while(true)
            {
                ansType=rand.nextInt(3);
                if(ansType!=quesType) break;
            }
        }
        else if(mode == 1)
        {
            quesType=rand.nextInt(2);
            ansType=1-quesType;
        }
        while(true)
        {
            which=rand.nextInt(50);
            if(!(which == 36 || which == 38 || which == 46 || which == 48)) break;
        }
        textQuestion.setText(fiftyTone.getQuesAns(quesType,which));
        setAns(ansType,which);
    }

    private void setAns(int ansType,int which)
    {
        int place,answhich;
        integerArrayList.clear();
        integerArrayList.add(which);
        if(mode == 0)
        {
            place = rand.nextInt(4) + 1;
            for(int i=1;i<5;i++) {
                if (i == place) answhich = which;
                else {
                    while (true) {
                        answhich = rand.nextInt(50);
                        if(answhich == 36 || answhich == 38 || answhich == 46 || answhich == 48)
                            continue;
                        if (!integerArrayList.contains(answhich)) {
                            integerArrayList.add(answhich);
                            break;
                        }
                    }
                }
                switch (i)
                {
                    case 1:
                        btnAns1.setText(fiftyTone.getQuesAns(ansType, answhich));
                        break;
                    case 2:
                        btnAns2.setText(fiftyTone.getQuesAns(ansType, answhich));
                        break;
                    case 3:
                        btnAns3.setText(fiftyTone.getQuesAns(ansType, answhich));
                        break;
                    case 4:
                        btnAns4.setText(fiftyTone.getQuesAns(ansType, answhich));
                        break;
                    default:
                        break;
                }
            }
        }
    }
}
