package com.example.gojuon;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class QuizActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);
    }

    public void quiz_goBack(View v)
    {
        finish();
    }

    public void quiz_setInfo1(View v)   //gojuon
    {
        AlertDialog.Builder alertDialog = new AlertDialog.Builder(QuizActivity.this);
        alertDialog.setTitle(getText(R.string.quiz_infoTitle));
        alertDialog.setMessage(getText(R.string.quiz_infoGojuonMsg1) + "\n"
                + getText(R.string.quiz_infoGojuonMsg2) + "\n"
                + getText(R.string.quiz_infoGojuonMsg3));
        alertDialog.setPositiveButton("OK",null);
        alertDialog.setCancelable(false);
        alertDialog.show();
    }

    public void quiz_setInfo2(View v)   //word
    {
        AlertDialog.Builder alertDialog = new AlertDialog.Builder(QuizActivity.this);
        alertDialog.setTitle(getText(R.string.quiz_infoTitle));
        alertDialog.setMessage(getText(R.string.quiz_infoWordMsg1) + "\n"
                + getText(R.string.quiz_infoWordMsg2));
        alertDialog.setPositiveButton("OK",null);
        alertDialog.setCancelable(false);
        alertDialog.show();
    }

}
