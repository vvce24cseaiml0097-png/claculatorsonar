
package com.example.Calculator;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class AppTest {

    @Test
    public void testAddition() {

        Calculator calc = new Calculator();

        int result = calc.addition(20, 10);

        assertEquals(30, result);
    }

    @Test
    public void testSubtraction() {

        Calculator calc = new Calculator();

        int result = calc.subtraction(20, 10);

        assertEquals(10, result);
    }
}
