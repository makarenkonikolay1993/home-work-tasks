package com.hillel.lecture_4;

import java.text.DecimalFormat;

/**
 * Написать программу, которая печатает табличку значений sin(x), где x это каждые 10 градусов от 0 до 360
 */
public class SinTableTestTask {
    public static final String form = "|%-5s|%-8s|%-5s|%-8s|%-5s|%-8s|%-5s|%-8s|\n";
    public static final String formTwo = "|%-5s|%-8.5f|%-5s|%-8.5f|%-5s|%-8.5f|%-5s|%-8.5f|\n";

    /**
     * Вынес в отдельные константы в начале всего класса, т.к. слишком длинный код получался.
     * Нечитабельно.
     */

    public static void sin() {
        String angle = "Angle";
        String sinus = "Sinus";


        /**
         * Хедер таблицы
         */
        System.out.println("Значение sin(x) от 0 до 360 градусов:");
        System.out.println("+-----+--------+-----+--------+-----+--------+-----+--------+");
        System.out.printf(form, angle, sinus, angle, sinus, angle, sinus, angle, sinus);
        System.out.println("+-----+--------+-----+--------+-----+--------+-----+--------+");

        /**
         * Начался цикл по печати всех значений.
         */

        for (int i = 0; i <= 90; i += 10) {
            int angleInLoop = i; // Объявлена, чтоб было понятнее что вообще дальше происходит

            /**
             * Четверти вынесены в отдельные переменные, т.к. слишком громоздкий код получался.
             * Можно и "angleInLoop + n" вынести в отдельные переменные, но не увидел в этом смысла.
             */
            double sinFirstQuarter = Math.sin(Math.toRadians(angleInLoop)); // Первая четверть
            double sinSecondQuarter = Math.sin(Math.toRadians(angleInLoop+90)); // Вторая четверть
            double sinThirdQuarter = Math.sin(Math.toRadians(angleInLoop+180)); //Третья четверть
            double sinFourthQuarter = Math.sin(Math.toRadians(angleInLoop+270)); //Четвертая четверть
            System.out.printf(formTwo, angleInLoop, sinFirstQuarter,(angleInLoop+90), sinSecondQuarter,(angleInLoop+180), sinThirdQuarter,(angleInLoop+270), sinFourthQuarter);
        }
        /**
         * Печать "футера" таблицы
         */
        System.out.print("+-----+--------+-----+--------+-----+--------+-----+--------+");

        }
}


