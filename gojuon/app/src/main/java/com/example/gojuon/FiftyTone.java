package com.example.gojuon;

import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class FiftyTone extends AppCompatActivity
{
    private ArrayList<CharSequence> wordSound = new ArrayList<CharSequence>();
    private ArrayList<CharSequence> hiragana = new ArrayList<CharSequence>();
    private ArrayList<CharSequence> katakana = new ArrayList<CharSequence>();

    public FiftyTone()
    {
        wordSound.add("-kstnhmyrw");
        wordSound.add("aiueo");
        hiragana.add("あかさたなはまやらわ");
        hiragana.add("いきしちにひみ-り-");
        hiragana.add("うくすつぬふむゆるん");
        hiragana.add("えけせてねへめ-れ-");
        hiragana.add("おこそとのほもよろを");
        katakana.add("アカサタナハマヤラワ");
        katakana.add("イキシチニヒミ-リ-");
        katakana.add("ウクスツヌフムユルン");
        katakana.add("エケセテネヘメ-レ-");
        katakana.add("オコソトノホモヨロヲ");
    }

    public String getQuesAns(int type,int which)
    {
        if(type == 0)   //hiragana
        {
            return String.valueOf(getHiragana(which%5,which/5));
        }
        else if(type == 1)      //katakana
        {
            return String.valueOf(getKatakana(which%5,which/5));
        }
        else
        {
            return getWordSound(which);
        }
    }

    public String getWordSound(int pos)
    {
        switch (pos)
        {
            case 16:
                return "chi";
            case 17:
                return "tsu";
            case 27:
                return "fu";
            case 47:
                return "n";
            default:
                break;
        }
        String s="";
        int index = pos/5,vowel = pos%5;
        if(index != 0)
            s+=wordSound.get(0).charAt(index);
        s+=wordSound.get(1).charAt(vowel);
        return s;
    }

    public String getHiragana(int index)
    {
        String s="";
        for(int i=0;i<5;i++)
        {
            if(hiragana.get(i).charAt(index)!='-')
                s+=hiragana.get(i).charAt(index);
        }
        return s;
    }

    public String getKatagkana(int index)
    {
        String s="";
        for(int i=0;i<5;i++)
        {
            if(katakana.get(i).charAt(index)!='-')
                s+=katakana.get(i).charAt(index);
        }
        return s;
    }

    public char getKatakana(int vowel, int index) {
        return katakana.get(vowel).charAt(index);
    }

    public char getHiragana(int vowel,int index) {
        return hiragana.get(vowel).charAt(index);
    }

    public int getSize() {return hiragana.get(0).length();}

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