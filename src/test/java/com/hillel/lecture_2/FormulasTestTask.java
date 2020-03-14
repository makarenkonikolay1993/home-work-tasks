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
        double expectedResult = 0.7417705889656853;
        assertEquals(formulas.calculate14Formula(x), expectedResult);
    }

    @Test
    public void formula15Test() {
        double x = 2;
        double expectedResult = 0.9115057192682371;
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
        double expectedResult = 6.570702183428481;
        assertEquals(formulas.calculate18Formula(x), expectedResult);
    }

    @Test
    public void formula19Test() {
        double x = 2;
        double expectedResult = 0.3697295898357656;
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
        double x = 2;
        double expectedResult = 0.21956296129636155;
        assertEquals(formulas.calculate21Formula(x), expectedResult);
    }

    @Test
    public void formula22Test() {
        double x = 2;
        double expectedResult = -0.28198971796182315;
        assertEquals(formulas.calculate22Formula(x), expectedResult);
    }

    @Test
    public void formula23Test() {
        double x = 2;
        double expectedResult = 2.3017106410017902;
        assertEquals(formulas.calculate23Formula(x), expectedResult);
    }

    @Test
    public void formula24Test() {
        double x = 2;
        double expectedResult = -1.3745671341873682;
        assertEquals(formulas.calculate24Formula(x), expectedResult);
    }

    @Test
    public void formula25Test() {
        double x = 2;
        double expectedResult = 2.0195623785124965;
        assertEquals(formulas.calculate25Formula(x), expectedResult);
    }

    @Test
    public void formula26Test() {
        double x = 2;
        double expectedResult = 15.850735488671853;
        assertEquals(formulas.calculate26Formula(x), expectedResult);

    }
}


