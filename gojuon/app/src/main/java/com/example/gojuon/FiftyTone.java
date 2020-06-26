package com.example.gojuon;

import android.support.v7.app.AppCompatActivity;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class FiftyTone extends AppCompatActivity
{
    private ArrayList<CharSequence> hiragana = new ArrayList<CharSequence>();         //平假名 a-0、i-1、u-2、e-3、o-4
    private ArrayList<CharSequence> katakana = new ArrayList<CharSequence>();         //片假名

    public FiftyTone()
    {
        hiragana.add("あかさたなはまやらわ");
        hiragana.add("いきしちにひみ　り　");
        hiragana.add("うくすつぬふむゆるん");
        hiragana.add("えけせてねへめ　れ　");
        hiragana.add("おこそとのほもよろを");
        katakana.add("アカサタナハマヤラワ");
        katakana.add("イキシチニヒミ　リ　");
        katakana.add("ウクスツヌフムユルン");
        katakana.add("エケセテネヘメ　レ　");
        katakana.add("オコソトノホモヨロヲ");
    }

    public char getKatakana(int vowel, int index) {
        return katakana.get(vowel).charAt(index);
    }

    public char getHiragana(int vowel,int index) {
        return hiragana.get(vowel).charAt(index);
    }

    /*<string name="hiragana_a">あかさたなはまやらわ</string>
    <string name="hiragana_i">いきしちにひみーりー</string>
    <string name="hiragana_u">うくすつぬふむゆるん</string>
    <string name="hiragana_e">えけせてねへめーれー</string>
    <string name="hiragana_o">おこそとのほもよろを</string>
    <string name="katakana_a">アカサタナハマヤラワ</string>
    <string name="katakana_i">イキシチニヒミーリー</string>
    <string name="katakana_u">ウクスツヌフムユルン</string>
    <string name="katakana_e">エケセテネヘメーレー</string>
    <string name="katakana_o">オコソトノホモヨロヲ</string>*/



}