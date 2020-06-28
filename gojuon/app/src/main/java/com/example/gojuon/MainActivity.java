package com.example.gojuon;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.Button;

import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    private Button btnLanguage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setLanguage();
        setContentView(R.layout.activity_main);

        btnLanguage = findViewById(R.id.menu_btnLanguage);

        btnLanguage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                builder.setSingleChoiceItems(new String[]{"中文", "English"},
                        getSharedPreferences("Language", Context.MODE_PRIVATE).getInt("Language", 0),
                        new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                SharedPreferences preferences = getSharedPreferences("Language",Context.MODE_PRIVATE);
                                SharedPreferences.Editor editor = preferences.edit();
                                editor.putInt("Language",which);
                                editor.apply();
                                dialog.dismiss();

                                Intent intent=new Intent(MainActivity.this,MainActivity.class);
                                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                                startActivity(intent);
                            }
                        });
                AlertDialog dialog = builder.create();
                dialog.show();
            }
        });

    }

    public void menu_gotoStudy(View view)
    {
        Intent intent = new Intent(this,StudyActivity.class);
        startActivity(intent);
    }

    public void menu_gotoExit(View view)
    {
        finish();
    }

    public void menu_gotoQuiz(View v)
    {
        Intent intent = new Intent(this,QuizActivity.class);
        startActivity(intent);
    }

    public void menu_AboutUs(View v)
    {
        AlertDialog.Builder alertDialog = new AlertDialog.Builder(MainActivity.this);
        alertDialog.setTitle(getText(R.string.menu_About));
        alertDialog.setMessage("賴璟霆\n黃一烜");
        alertDialog.setPositiveButton("OK",null);
        alertDialog.setCancelable(false);
        alertDialog.show();
    }

    private void setLanguage()
    {
        SharedPreferences preferences = getSharedPreferences("Language", Context.MODE_PRIVATE);
        int language = preferences.getInt("Language",0);

        Resources resources = getResources();
        DisplayMetrics displayMetrics = resources.getDisplayMetrics();
        Configuration configuration = resources.getConfiguration();

        switch (language)
        {
            case 0:
                configuration.setLocale(Locale.TAIWAN);
                break;
            case 1:
                configuration.setLocale(Locale.ENGLISH);
                break;
            default:
                break;
        }
        resources.updateConfiguration(configuration,displayMetrics);
    }

}
