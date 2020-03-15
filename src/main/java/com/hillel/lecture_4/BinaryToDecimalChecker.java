package com.hillel.lecture_4;

import io.qameta.allure.Step;

/**
 * Created by alpa on 10/25/19
 */
public class BinaryToDecimalChecker {

    @Step
    public int fromDecimalToBinary(int value) {

//        TODO implements result


        //StringBuilder binary = new StringBuilder();

//        while (value>0){
//            binary.insert(0, value % 2);
//            value/=2;
//        }

        //int result = Integer.parseInt(String.valueOf(binary));

        //return result;

        String bin = "";

        while (value>0){
            bin=value%2+bin;
            value/=2;
        }

        return Integer.parseInt(bin);

    }

    @Step
    public int fromBinaryToDecimal(int value) {

//        TODO implements result
        int result = 0;
        String t = Integer.toString(value);
        int size = t.length();

        for ( int i = 0; i < size; i++){
            String number = String.valueOf(t.charAt(i));
            int degree = size-i-1;
            result+=Integer.parseInt(number)*Math.pow(2,degree);
        }

        return result;
    }
}
