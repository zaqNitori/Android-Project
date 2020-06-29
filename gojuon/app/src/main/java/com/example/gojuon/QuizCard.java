package com.example.gojuon;

import android.content.DialogInterface;
import android.os.Build;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.app.AlertDialog;
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

    private Integer mode,totalQuest,correctQuest;
    private Integer remainType,remainWhich,state;
    private FiftyTone fiftyTone = new FiftyTone();
    private ImageView imgView,imgResult;
    private TextView textQuestion,textResult,textResultRate,textshowCorrectAns;
    private Random rand=new Random();
    private Button btnAns1,btnAns2,btnAns3,btnAns4;
    private ArrayList<Integer> integerArrayList = new ArrayList<Integer>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_card);

        imgView = findViewById(R.id.quizCard_questionImg);
        imgResult = findViewById(R.id.quizCard_showResult);
        textQuestion = findViewById(R.id.quizCard_question);
        textResult = findViewById(R.id.quizCard_showResultNumber);
        textResultRate = findViewById(R.id.quizCard_showResultRate);
        textshowCorrectAns = findViewById(R.id.quizCard_txtshowCorrectAns);
        btnAns1 = findViewById(R.id.quizCard_btnAns1);
        btnAns2 = findViewById(R.id.quizCard_btnAns2);
        btnAns3 = findViewById(R.id.quizCard_btnAns3);
        btnAns4 = findViewById(R.id.quizCard_btnAns4);

        mode = getIntent().getIntExtra("testMode",0);

        totalQuest = correctQuest = state = 0;
        imgResult.setVisibility(View.INVISIBLE);
        if(mode == 0)       //考試範圍五十音
        {
            imgView.setVisibility(View.GONE);
            setQuesAns();
        }
        else if(mode == 1)
        {
            setQuesAns();
        }
    }

    public void quizCard_goBack(View v)
    {
        finish();
    }

    public void quizCard_refreshQuest(View v)
    {
        state = 0;
        imgResult.setVisibility(View.INVISIBLE);
        textshowCorrectAns.setText("");
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
        else if(mode == 1)          //字義測驗
        {
            quesType=rand.nextInt(2);
            ansType=1-quesType;
        }
        while(true)
        {
            which=rand.nextInt(50);
            if(!(which == 36 || which == 38 || which == 46 || which == 48) && mode == 0)
                break;
            if(!(which == 36 || which == 38 || which == 46 || which == 48 || which == 5 || which == 6
             || which == 7 || which == 8 || which == 9 || which == 47 || which == 49) && mode == 1)
                break;
        }
        textQuestion.setText(fiftyTone.getQuesAns(mode,quesType,which));
        remainType = ansType;       //保留答案所使用的種類
        remainWhich = which;
        setAns(ansType,which);
    }

    private void setAns(int ansType,int which)
    {
        int place,answhich;
        integerArrayList.clear();
        integerArrayList.add(which);
        place = rand.nextInt(4) + 1;
        for(int i=1;i<5;i++) {
            if (i == place) answhich = which;
            else {
                while (true) {
                    answhich = rand.nextInt(50);
                    if((answhich == 36 || answhich == 38 || answhich == 46 || answhich == 48) && mode == 0)
                        continue;
                    if((answhich == 36 || answhich == 38 || answhich == 46 || answhich == 48 || answhich == 5 || answhich == 6
                            || answhich == 7 || answhich == 8 || answhich == 9 || answhich == 47 || answhich == 49) && mode == 1)
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
                    btnAns1.setText(fiftyTone.getQuesAns(mode,ansType, answhich));
                    break;
                case 2:
                    btnAns2.setText(fiftyTone.getQuesAns(mode,ansType, answhich));
                    break;
                case 3:
                    btnAns3.setText(fiftyTone.getQuesAns(mode,ansType, answhich));
                    break;
                case 4:
                    btnAns4.setText(fiftyTone.getQuesAns(mode,ansType, answhich));
                    break;
                default:
                    break;
            }
        }
        state = 1;      //完成題目答案設置
    }

    public void quizCard_checkAns(View v)
    {
        if(state == 0) return;
        String select="";
        totalQuest+=1;
        switch (v.getId())
        {
            case R.id.quizCard_btnAns1:
                select = String.valueOf(btnAns1.getText());
                break;
            case R.id.quizCard_btnAns2:
                select = String.valueOf(btnAns2.getText());
                break;
            case R.id.quizCard_btnAns3:
                select = String.valueOf(btnAns3.getText());
                break;
            case R.id.quizCard_btnAns4:
                select = String.valueOf(btnAns4.getText());
                break;
            default:
                break;
        }
        showResult(select.equals(fiftyTone.getQuesAns(mode,remainType,remainWhich)));

    }

    private void showResult(boolean isEqual)
    {
        if(isEqual)
        {
            correctQuest+=1;
            imgResult.setImageResource(R.mipmap.ans_correct);
        }
        else
        {
            imgResult.setImageResource(R.mipmap.ans_wrong);
        }
        textshowCorrectAns.setText(getText(R.string.quizCard_correctAns)
                + fiftyTone.getQuesAns(mode,remainType,remainWhich));
        int d =(int)(correctQuest * 1.0 /totalQuest * 100);
        imgResult.setVisibility(View.VISIBLE);
        textResult.setText(String.format("%d / %d",correctQuest,totalQuest));
        textResultRate.setText(String.format("%s : %d %%"
                ,getText(R.string.quizCard_correctRate),d));
        state = 0;      //寫題結束
    }

    public void quizCard_tapImgResult(View v)
    {
        imgResult.setVisibility(View.INVISIBLE);
    }

}
