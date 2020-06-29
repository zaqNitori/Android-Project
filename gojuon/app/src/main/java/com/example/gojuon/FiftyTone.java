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
    private ArrayList<ArrayList<String>> vocabulary = new ArrayList<ArrayList<String>>();
    private ArrayList<ArrayList<String>> meaning = new ArrayList<ArrayList<String>>();

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
        addVocabulary();
        addMeaning();
    }

    private void addMeaning()
    {
        ArrayList<String> stringArrayList = new ArrayList<String>();
        ArrayList<String> stringArrayList2 = new ArrayList<String>();
        ArrayList<String> stringArrayList3 = new ArrayList<String>();
        ArrayList<String> stringArrayList4 = new ArrayList<String>();
        ArrayList<String> stringArrayList5 = new ArrayList<String>();
        stringArrayList.add("秋天");//0
        stringArrayList.add("--");
        stringArrayList.add("櫻花");
        stringArrayList.add("達人");
        stringArrayList.add("鳴人");
        stringArrayList.add("春天");
        stringArrayList.add("機關槍");
        stringArrayList.add("屋子");
        stringArrayList.add("指南針");
        stringArrayList.add("腋下");
        meaning.add(stringArrayList);

        stringArrayList2.add("烏賊");//1
        stringArrayList2.add("--");
        stringArrayList2.add("觸手");
        stringArrayList2.add("力量");
        stringArrayList2.add("紅蘿蔔");
        stringArrayList2.add("秘密");
        stringArrayList2.add("商店");
        stringArrayList2.add("--");
        stringArrayList2.add("蘋果");
        stringArrayList2.add("--");
        meaning.add(stringArrayList2);

        stringArrayList3.add("海膽");//2
        stringArrayList3.add("--");
        stringArrayList3.add("西瓜");
        stringArrayList3.add("花蕾");
        stringArrayList3.add("布偶");
        stringArrayList3.add("暴風雪");
        stringArrayList3.add("村莊");
        stringArrayList3.add("誘拐");
        stringArrayList3.add("魯邦三世");
        stringArrayList3.add("--");
        meaning.add(stringArrayList3);

        stringArrayList4.add("電影");//3
        stringArrayList4.add("--");
        stringArrayList4.add("世界");
        stringArrayList4.add("天氣");
        stringArrayList4.add("青蔥");
        stringArrayList4.add("肚臍");
        stringArrayList4.add("困擾");
        stringArrayList4.add("--");
        stringArrayList4.add("歷史");
        stringArrayList4.add("--");
        meaning.add(stringArrayList4);

        stringArrayList5.add("王子");//4
        stringArrayList5.add("--");
        stringArrayList5.add("蕎麥麵");
        stringArrayList5.add("豚骨");
        stringArrayList5.add("能力");
        stringArrayList5.add("火焰");
        stringArrayList5.add("桃子");
        stringArrayList5.add("妖怪");
        stringArrayList5.add("邏輯");
        stringArrayList5.add("--");
        meaning.add(stringArrayList5);
    }

    private void addVocabulary()
    {
        ArrayList<String> stringArrayList = new ArrayList<String>();
        ArrayList<String> stringArrayList2 = new ArrayList<String>();
        ArrayList<String> stringArrayList3 = new ArrayList<String>();
        ArrayList<String> stringArrayList4 = new ArrayList<String>();
        ArrayList<String> stringArrayList5 = new ArrayList<String>();
        stringArrayList.add("あき");//0
        stringArrayList.add("--");
        stringArrayList.add("さくら");
        stringArrayList.add("たつじん");
        stringArrayList.add("なると");
        stringArrayList.add("はる");
        stringArrayList.add("マシンガン");
        stringArrayList.add("やしき");
        stringArrayList.add("らしんばん");
        stringArrayList.add("わき");
        vocabulary.add(stringArrayList);

        stringArrayList2.add("イカ");//1
        stringArrayList2.add("--");
        stringArrayList2.add("しょくしゅ");
        stringArrayList2.add("ちから");
        stringArrayList2.add("にんじん");
        stringArrayList2.add("ひみつ");
        stringArrayList2.add("みせ");
        stringArrayList2.add("--");
        stringArrayList2.add("りんご");
        stringArrayList2.add("--");
        vocabulary.add(stringArrayList2);

        stringArrayList3.add("うに");//2
        stringArrayList3.add("--");
        stringArrayList3.add("スイカ");
        stringArrayList3.add("つぼみ");
        stringArrayList3.add("ぬいぐるみ");
        stringArrayList3.add("ふぶき");
        stringArrayList3.add("むら");
        stringArrayList3.add("ゆうかい");
        stringArrayList3.add("るぱんさんせい");
        stringArrayList3.add("--");
        vocabulary.add(stringArrayList3);

        stringArrayList4.add("えいが");//3
        stringArrayList4.add("--");
        stringArrayList4.add("せかい");
        stringArrayList4.add("てんき");
        stringArrayList4.add("ネギ");
        stringArrayList4.add("へそ");
        stringArrayList4.add("めいわく");
        stringArrayList4.add("--");
        stringArrayList4.add("れきし");
        stringArrayList4.add("--");
        vocabulary.add(stringArrayList4);

        stringArrayList5.add("おうじ");//4
        stringArrayList5.add("--");
        stringArrayList5.add("そば");
        stringArrayList5.add("とんこつ");
        stringArrayList5.add("のうりょく");
        stringArrayList5.add("ほのお");
        stringArrayList5.add("もも");
        stringArrayList5.add("ようかい");
        stringArrayList5.add("ろんり");
        stringArrayList5.add("--");
        vocabulary.add(stringArrayList5);
    }

    public String getQuesAns(int mode,int type,int which)
    {
        if(mode ==0)
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
        else
        {
            if(type == 0)   //vocabulary
            {
                return getVocabulary(which%5,which/5);
            }
            else
            {
                return getMeaning(which%5,which/5);
            }
        }
    }

    public String getMeaning(int vowel,int index)
    {
        return meaning.get(vowel).get(index);
    }

    public String getVocabulary(int vowel,int index)
    {
        return vocabulary.get(vowel).get(index);
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