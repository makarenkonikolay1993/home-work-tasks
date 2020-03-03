package com.hillel.lecture_2;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

/**
 * Created by alpa on 10/16/19
 */
public class FormulasTestTask {

    private Formulas formulas = new Formulas();

    @Test
    public void formula9Test() {
        double x = 25;
        double expectedResult = 0.47091985615225695;
        assertEquals(formulas.calculate9Formula(x), expectedResult);
    }

    @Test
    public void formula10Test() {
        double x = 26;
        double expectedResult = 0.8235340789142294;
        assertEquals(formulas.calculate10Formula(x), expectedResult);
    }

    @Test
    public void formula11Test() {
        double x = 27;
        double expectedResult = 169.547106790819;
        assertEquals(formulas.calculate11Formula(x), expectedResult);
    }

    @Test
    public void formula12Test() {
        double x = 28;
        double expectedResult = 1.3351102609440046;
        assertEquals(formulas.calculate12Formula(x), expectedResult);
    }

    @Test
    public void formula13Test() {
        double x = 29;
        double expectedResult = 0.2631086711629021;
        assertEquals(formulas.calculate13Formula(x), expectedResult);
    }

    @Test
    public void formula14Test() {
        double x = 2;
        double expectedResult = 0.9149985299860904;
        assertEquals(formulas.calculate14Formula(x), expectedResult);
    }

    @Test
    public void formula15Test() {
        double x = 2;
        double expectedResult = 0.911505719268237;
        assertEquals(formulas.calculate15Formula(x), expectedResult);
    }

    @Test
    public void formula16Test() {
        double x = 2;
        double expectedResult = 1.2017894389976274;
        assertEquals(formulas.calculate16Formula(x), expectedResult);
    }

    @Test
    public void formula17Test() {
        double x = 2;
        double expectedResult = -13.158079577239803;
        assertEquals(formulas.calculate17Formula(x), expectedResult);
    }

    @Test
    public void formula18Test() {
        double x = 2;
        double expectedResult = 4.8766269527674835;
        assertEquals(formulas.calculate18Formula(x), expectedResult);
    }

    @Test
    public void formula19Test() {
        double x = 2;
        double expectedResult = 1.1920783558887211;
        assertEquals(formulas.calculate19Formula(x), expectedResult);
    }

    @Test
    public void formula20Test() {
        double x = 2;
        double expectedResult = 3.4601508570321524;
        assertEquals(formulas.calculate20Formula(x), expectedResult);
    }

    @Test
    public void formula21Test() {
        double x = -2.9;
        double expectedResult = Double.NaN;
        assertEquals(formulas.calculate21Formula(x), expectedResult);
    }

    @Test
    public void formula22Test() {
        double x = 2;
        double expectedResult = -0.28197325647714583;
        assertEquals(formulas.calculate22Formula(x), expectedResult);
    }

    @Test
    public void formula23Test() {
        double x = 2;
        double expectedResult = 3.7894349007151296;
        assertEquals(formulas.calculate23Formula(x), expectedResult);
    }

    @Test
    public void formula24Test() {
        double x = 2;
        double expectedResult = 1.5526738651391696;
        assertEquals(formulas.calculate24Formula(x), expectedResult);
    }

    @Test
    public void formula25Test() {
        double x = 0.5;
        double expectedResult = 1.685315075028524;
        assertEquals(formulas.calculate25Formula(x), expectedResult);
    }

    @Test
    public void formula26Test() {
        double x = 2;
        double expectedResult = 15.850735488671853;
        assertEquals(formulas.calculate26Formula(x), expectedResult);

    }
}


