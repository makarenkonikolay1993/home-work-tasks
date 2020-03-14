package com.hillel.lecture_4;

import java.text.DecimalFormat;

/**
 * Написать программу, которая печатает табличку значений sin(x), где x это каждые 10 градусов от 0 до 360
 */
public class SinTableTestTask {

    public static void sin() {
        DecimalFormat sinusUgol = new DecimalFormat("##.####");
        for (int i = 0; i <= 360; i += 10) {
            System.out.println("Синус угла " + i + " равен: " + sinusUgol.format(Math.sin(Math.toRadians(i))));
        }
    }

}
