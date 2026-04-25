package ec.edu.epn;

import static org.junit.Assert.*;

public class calculatorTest {

    @org.junit.Test
    public void addition() {
        calculator calc = new calculator();
        int result = calc.addition(2, 3);
        assertEquals(5, result);
    }

    @org.junit.Test
    public void subtraction() {
        calculator calc = new calculator();
        int result = calc.subtraction(5, 2);
        assertEquals(3, result);
    }

    @org.junit.Test
    public void multiplication() {
        calculator calc = new calculator();
        int result = calc.multiplication(4, 3);
        assertEquals(12, result);
    }

    @org.junit.Test
    public void division() {
        calculator calc = new calculator();
        double result = calc.division(10, 2);
        assertEquals(5.0, result, 0.001);
    }
}