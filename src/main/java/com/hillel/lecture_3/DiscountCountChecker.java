package com.hillel.lecture_3;

import io.qameta.allure.Step;

/**
 * Created by alpa on 10/22/19
 */
public class DiscountCountChecker {

    @Step
    public double checkDiscountCount(double price) {

//        TODO implements result
        double result = 0.0;

        result = (price > 1000) ? price*0.85 : 0;

//        if(price > 1000){
//            result+=price*0.85;
//        }

        /*
        * Возможно здесь должен быть результат со скидкой и без скидки, а не ноль если меньше 1000.
        * В твоем expected result = 0.0 , если price <=1000 . Подстроился под экспектед резалт. Хотя цена должна быть
        * как заложено во входном числе.
        *
        * if (price <=1000){
        *   result = price;
        * } else {
        *   result+=price*0.85;
        * }
        *
        * return result;
         */

        return result;
    }
}
