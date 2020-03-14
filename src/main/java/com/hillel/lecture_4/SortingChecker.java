package com.hillel.lecture_4;

import io.qameta.allure.Step;

/**
 * Created by alpa on 10/26/19
 */
public class SortingChecker {

    @Step
    public int[] fromMinToMax(int[] values) {

//        TODO implements result
        boolean isSorted = false;
        int temp = 0;

        while (!isSorted){
            isSorted=true;
            for (int i = 0; i<values.length-1; i++){
                if (values[i]>values[i+1]){
                    temp = values[i];
                    values[i]=values[i+1];
                    values[i+1]=temp;
                    isSorted=false;
                }
            }
        }
        return values;
    }

    @Step
    public int[] fromMaxToMin(int[] values) {

//        TODO implements result
        boolean isSorted = false;
        int temp = 0;

        while (!isSorted){
            isSorted=true;
            for (int i = 0; i<values.length-1; i++){
                if (values[i]<values[i+1]){
                    temp = values[i];
                    values[i]=values[i+1];
                    values[i+1]=temp;
                    isSorted=false;
                }
            }
        }
        return values;
    }
}
