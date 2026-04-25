package ec.edu.epn;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Collection;

import static org.junit.Assert.*;

@RunWith(value = Parameterized.class)
public class calculatorParametersTest {
    private int a, b, expected;

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return java.util.Arrays.asList(new Object[][]{
                {2, 3, 5},
                {1, 2, 3},
                {4, 3, 7},
                {10, 2, 12}
        });
    }
    public calculatorParametersTest(int a, int b, int expected) {
            this.a = a;
            this.b = b;
            this.expected = expected;
    }

    @Test
    public void given_parameters_when_adition_then_sumation() {
        calculator calc = new calculator();
        int result = calc.addition(a, b);
        assertEquals(expected, result);
    }
}