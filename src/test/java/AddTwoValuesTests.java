import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertTrue;

/**
 * Created by kate on 1/12/16.
 */


public class AddTwoValuesTests {

    Calculator calc = new Calculator();

    @Before
    public void consolePrint() {
        System.out.println("Tests started!!! ");
    }

    @Test
    public void testAddTwoPositiveValues() {
        int a = 10;
        int b = 5;
        int exp = 15;
        assertEquals(String.format("%s+%s must be %s", a, b, exp), exp, calc.add(a, b));
    }

    @Test
    public void testAddTwoNegativeValues() {
        int a = -10;
        int b = -5;
        int exp = -15;
        assertEquals(String.format("%s+%s must be %s", a, b, exp), exp, calc.add(a, b));
    }

    //add new tests for add() method

    @Test
    public void testAddOnePositiveAndOneNegativeValue() {
        int a = 10;
        int b = -5;
        int exp = 5;
        assertEquals(String.format("%s+%s must be %s", a, b, exp), exp, calc.add(a, b));
    }

    //add tests for new methods

    @Test
    public void testMultiplyTwoPositiveValues() {
        int a = 10;
        int b = 5;
        int exp = 50;
        assertEquals(String.format("%s*%s must be %s", a, b, exp), exp, calc.multiply(a, b));
    }

    @Test
    public void testMultiplyTwoNegativeValues() {
        int a = -10;
        int b = -5;
        int exp = 50;
        assertEquals(String.format("%s*%s must be %s", a, b, exp), exp, calc.multiply(a, b));
    }

    @Test
    public void testMultiplyOnePositiveAndOneNegativeValue() {
        int a = -10;
        int b = 5;
        int exp = -50;
        assertEquals(String.format("%s*%s must be %s", a, b, exp), exp, calc.multiply(a, b));
    }

    @Test
    public void testDivisionTwoPositiveValues() {
        int a = 5;
        int b = 2;
        double exp = 2.5;
        assertEquals(String.format("%s/%s must be %s", a, b, exp), exp, calc.division(a, b));
    }

    @Test
    public void testDivisionTwoNegativeValues() {
        int a = -5;
        int b = -2;
        double exp = 2.5;
        assertEquals(String.format("%s/%s must be %s", a, b, exp), exp, calc.division(a, b));
    }

    @Test
    public void testDivisionOnePositiveAndOneNegativeValue() {
        int a = 5;
        int b = -2;
        double exp = -2.5;
        assertEquals(String.format("%s/%s must be %s", a, b, exp), exp, calc.division(a, b));
    }

       @Test
    public void testSubtractionTwoPositiveValues() {
        int a = 10;
        int b = 5;
        int exp = 5;
        assertEquals(String.format("%s-%s must be %s", a, b, exp), exp, calc.subtraction(a, b));
    }

    @Test
    public void testSubtractionTwoNegativeValues() {
        int a = -10;
        int b = -5;
        int exp = -5;
        assertEquals(String.format("%s-%s must be %s", a, b, exp), exp, calc.subtraction(a, b));
    }

    @Test
    public void testSubtractionOnePositiveAndOneNegativeValue() {
        int a = 10;
        int b = -5;
        int exp = 15;
        assertEquals(String.format("%s-%s must be %s", a, b, exp), exp, calc.subtraction(a, b));
    }

    @Test
    public void squareOfPositiveValue() {
        int a = 10;
        int exp = 100;
        assertEquals(String.format("square of %s must be %s", a, exp), exp, calc.square(a));
    }

    @Test
    public void squareRootOfPositiveValue() {
        int a = 10;
        double exp = 3.1622776601683795;
        assertEquals(String.format("square root of %s must be %s", a, exp), exp, calc.squareRoot(a));
    }

    @Test
    public void squareRootOfNegativeValue() {
        int a = -5;
        assertTrue(String.format("%s square root", a), Double.isNaN(calc.squareRoot(a)));
    }

    @Test
    public void testDivisionByZero() {
        int a = 5;
        int b = 0;
        assertTrue(String.format("%s/%s", a, b), Double.isInfinite(calc.division(a, b)));
    }

    @After
    public void consolePrintAfter() {
        System.out.println("Tests finished!!!");
    }
}
