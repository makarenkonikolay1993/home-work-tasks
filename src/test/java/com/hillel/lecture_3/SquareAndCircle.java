package com.hillel.lecture_3;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

/**
 * Известны площади круга и квадрата. Определить:
 * уместится ли круг в квадрате
 *  уместится ли квадрат в круге
 */

public class SquareAndCircle {

    private SquareAndCircleChecker squareAndCircleChecker = new SquareAndCircleChecker();

    @Test
    public void checkCircleInSquare() {
        double circleArea = 12;
        double squareArea = 16;

        assertEquals(squareAndCircleChecker.checkCircleInSquare(circleArea, squareArea), "The circle is in the square") ;
    }

    @Test
    public void checkCircleNotInSquare() {
        double circleArea = 15;
        double squareArea = 19;

        assertEquals(squareAndCircleChecker.checkCircleInSquare(circleArea, squareArea), "The circle is not in the square") ;
    }

    @Test
    public void checkSquareInCircle() {
        double circleArea = 12;
        double squareArea = 6;

        assertEquals(squareAndCircleChecker.checkSquareInCircle(circleArea, squareArea), "The square is in the circle") ;
    }

    @Test
    public void checkSquareNotInCircle() {
        double circleArea = 9;
        double squareArea = 6;

        assertEquals(squareAndCircleChecker.checkSquareInCircle(circleArea, squareArea), "The square is not in the circle") ;
    }

    @Test
    public void checkEqualsValues() {
        double circleArea = 15;
        double squareArea = 19;

        assertEquals(squareAndCircleChecker.checkCircleInSquare(circleArea, squareArea), "The circle is not in the square") ;
        assertEquals(squareAndCircleChecker.checkSquareInCircle(circleArea, squareArea), "The square is not in the circle") ;
    }

}
