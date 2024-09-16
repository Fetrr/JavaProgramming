package org.example;

import junit.framework.TestCase;
// import Mockito;

public class CalculatorTest extends TestCase {
    CalculatorApp calc = new CalculatorApp(new Calculator());

    private void testAssertEqualsAdd(Double a, Double b, Double expected) {
        assertEquals(expected, calc.add(a, b));
    }
    private void testAssertEqualsMulti(Double a, Double b, Double expected) {
        assertEquals(expected, calc.multi(a, b));
    }
    private void testAssertEqualsDiv(Double a, Double b, Double expected) {
        assertEquals(expected, calc.div(a, b));
    }

    public void testAdd() {
        testAssertEqualsAdd(4.0, 2.0, 6.0);
    }
    public void testMulti() {
        testAssertEqualsMulti(4.0, 2.0, 8.0);
    }
    public void testDiv() {
        testAssertEqualsDiv(4.0, 2.0, 2.0);
        testAssertEqualsDiv(4.0, 0.0, null);
    }
}