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
        double expectedResult = 0.8895587656507004;
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
        double expectedResult = 4.2205705543620855;
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
        double expectedResult = 1.1768750447717151;
        assertEquals(formulas.calculate19Formula(x), expectedResult);
    }

    @Test
    public void formula20Test() {
        double x = 2;
        double expectedResult = 3.4469685727835495;
        assertEquals(formulas.calculate20Formula(x), expectedResult);
    }

    @Test
    public void formula21Test() {
        double x = 1;
        double expectedResult = 0.5003087739399442;
        assertEquals(formulas.calculate21Formula(x), expectedResult);
    }

    @Test
    public void formula22Test() {
        double x = 2;
        double expectedResult = -0.3273930165449391;
        assertEquals(formulas.calculate22Formula(x), expectedResult);
    }

    @Test
    public void formula23Test() {
        double x = 2;
        double expectedResult = 3.7753354194976856;
        assertEquals(formulas.calculate23Formula(x), expectedResult);
    }

    @Test
    public void formula24Test() {
        double x = 2;
        double expectedResult = 0.7665359822012203;
        assertEquals(formulas.calculate24Formula(x), expectedResult);
    }

    @Test
    public void formula25Test() {
        double x = 2;
        double expectedResult = 0.8042061664425223;
        assertEquals(formulas.calculate25Formula(x), expectedResult);
    }

    @Test
    public void formula26Test() {
        double x = 2;
        double expectedResult = 15.421610980889971;
        assertEquals(formulas.calculate26Formula(x), expectedResult);

    }
}


