import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

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
        assertEquals(String.format("%s+%s must be %s," + a,b,exp), exp, calc.add(a, b));
    }

    @Test
    public void testAddTwoNegativeValues() {
        int a = -10;
        int b = -5;
        int exp = -15;
        assertEquals(String.format("%s+%s must be %s," + a,b,exp), exp, calc.add(a, b)));
    }
    //TODO
    //add new tests for add() method

    @Test
    public void testAddOnePositiveAndOneNegativeValue() {
        int a = 10;
        int b = -5;
        int exp = 5;
        assertEquals(String.format("%s+%s must be %s," + a,b,exp), exp, calc.add(a, b));
    }

    //TODO
    //add tests for new methods

    @Test
    public void testDivisionTwoPositiveValues() {
        int a = 10;
        int b = 5;
        int exp = 5;
        assertEquals(String.format("%s+%s must be %s," + a,b,exp), exp, calc.add(a, b));
    }

    @After
    public void consolePrintAfter() {
        System.out.println("Tests finished!!!");

    }
}
