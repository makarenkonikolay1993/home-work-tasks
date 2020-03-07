package com.hillel.lecture_3;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

/**
 * Определить, является ли треугольник со сторонами a, b, c равнобедренным
 */

public class TriangleTest {

    private TriangleChecker triangleChecker = new TriangleChecker();

    @Test(dataProvider = "triangleProvider")
    public void checkTriangle(int a, int b, int c, String message) {
        assertEquals(triangleChecker.isTriangleIsosceles(a, b, c), message); ;
    }

    @DataProvider(name = "triangleProvider")
    public static Object[][] triangleProvider() {
        return new Object[][] {
                { 5, 5, 10, "Isosceles triangle!"},
                { 5, 3, 10, "No isosceles triangle!"},
                { 5, 3, 5, "Isosceles triangle!"},
                { 5, 4, 4, "Isosceles triangle!"},
                { 9, 4, 5, "No isosceles triangle!"},
        };
    }
}
