package com.hillel.lecture_4;

/**
 * Написать программу, которая печатает табличку значений sin(x), где x это каждые 10 градусов от 0 до 360
 */
public class SinTableTestTask {

    public static void sin() {
        for (int i = 0; i <= 360; i += 10) {
            System.out.printf("%.4f\n", (Math.sin(Math.toRadians(i))));
        }
    }

}
