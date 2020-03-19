package com.hillel.lecture_6;

import io.qameta.allure.Step;

/**
 * Created by alpa on 11/2/19
 */
public class UpperLowerCaseChecker {


    @Step
    public String toUpperCase(String word) {

//        TODO implements result
        String result = "";
        result = word.toUpperCase();

        return result;
    }

    @Step
    public String toLowerCase(String word) {

//        TODO implements result
        String result = "";
        result = word.toLowerCase();

        return result;
    }

    @Step
    public String eachSentenceToUpperCase(String sentence) {

//        TODO implements result
        String result = "";

        String[] sentences = sentence.split("\\. ");
        int size = sentences.length;

        for (int i = 0; i < size; i++){
            if (sentences[i].startsWith(" ")){
                sentences[i] = sentences[i].substring(1, 2).toUpperCase() + sentences[i].substring(2);
            }
            else {
                sentences[i] = sentences[i].substring(0, 1).toUpperCase() + sentences[i].substring(1);
            }
        }

        for (int i = 0; i < size; i++){
            if (i == size-1){
                result+=sentences[i]+"";
            } else {
                result += sentences[i] + ". ";
            }
        }
        return result;
    }

    @Step
    public String eachLetterToUpperCase(String sentence) {

//        TODO implements result
        String result = "";

        String[] sentences = sentence.split(" ");
        int size = sentences.length;

        for (int i = 0; i < size; i++){
            sentences[i]=sentences[i].substring(0,1).toUpperCase()+sentences[i].substring(1);
        }

        for (int i = 0; i < size; i++){
            if (i == size-1){
                result+=sentences[i]+"";
            } else {
                result += sentences[i] + " ";
            }
        }
        return result;
    }
}
