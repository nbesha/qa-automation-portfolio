
package com.qa.course;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FirstJUnitTest {

    Calculator calculator = new Calculator();

    @Test
    void additionTest() {
        assertEquals(30, calculator.add(10, 20));
    }

    @Test
    void subtractionTest() {
        assertEquals(10, calculator.subtract(20, 10));
    }

    @Test
    void multiplicationTest() {
        assertEquals(50, calculator.multiply(10, 5));
    }

    @Test
    void divisionTest() {
        assertEquals(5, calculator.divide(20, 4));
    }

    @Test
    void divisionByZeroTest() {
        assertThrows(
                IllegalArgumentException.class,
                () -> calculator.divide(10, 0)
        );
    }

    @Test
    void negativeAdditionTest() {
        assertEquals(-5, calculator.add(-10, 5));
    }

    @Test
    void negativeDivisionTest() {
        assertEquals(-5, calculator.divide(-10, 2));
    }
}
