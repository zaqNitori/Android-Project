package com.example.gojuon;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class FiftyTone extends AppCompatActivity
{
        private ArrayList<String> hiragana;         //平假名 a-0、i-1、u-2、e-3、o-4
        private ArrayList<String> katakana;         //片假名

    public String getKatakana(int vowel, int index) {
        return Integer.toString(katakana.get(vowel).indexOf(index));
    }

    public String getHiragana(int vowel,int index) {
        return Integer.toString(hiragana.get(vowel).indexOf(index));
    }
}
