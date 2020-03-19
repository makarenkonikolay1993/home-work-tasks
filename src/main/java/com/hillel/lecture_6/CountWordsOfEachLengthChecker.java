package com.hillel.lecture_6;

import io.qameta.allure.Step;

/**
 * Created by alpa on 11/2/19
 */
public class CountWordsOfEachLengthChecker {

    @Step
    public static int countNumberOfWorldWithLength(String sentence, int wordLength) {

//        TODO implements result
        int result = 0;

        String[] s = sentence.split(" ");

        for (int i = 0 ; i < s.length; i++){
            String temp = s[i];
            if (temp.replace(",", "").replace(".","").length()==wordLength){
                result++;
            }
        }

        return result;
    }


}
