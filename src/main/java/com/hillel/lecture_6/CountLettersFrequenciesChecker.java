package com.hillel.lecture_6;

import io.qameta.allure.Step;

/**
 * Created by alpa on 11/2/19
 */
public class CountLettersFrequenciesChecker {


    @Step
    public String countLettersFrequencies(String text, char letter) {

//        TODO implements result
        String result = "";
        int count=0;
        for (int i = 0; i < text.length(); i++){
            if (String.valueOf(text.charAt(i)).equals(String.valueOf(letter))){
                count++;
            }
        }
        result = "Character '" + letter + "' repeated " + count + " times";
        return result;
    }
}
