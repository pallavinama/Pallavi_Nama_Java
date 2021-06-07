package com.company;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    private Calculator calc = new Calculator();

    @Test
    public void shouldReturnSumOfTwoIntegersWhenGivenTwoIntegers() {
        String failMessage = "Expected calculator to handle integer addition.";
        assertEquals(failMessage, 2, calc.addInt(1, 1));
    }

    @Test
    public void shouldReturnDifferenceOfTwoIntegersWhenGivenTwoIntegers() {
        String failMessage = "Expected calculator to handle integer addition.";
        assertEquals(failMessage, -29, calc.subractInt(23, 52));
    }

    @Test
    public void shouldReturnMultiplicationOfTwoIntegersWhenGivenTwoIntegers() {
        String failMessage = "Expected calculator to handle integer addition.";
        assertEquals(failMessage, 68, calc.multiplyInt(34, 2));
    }

    @Test
    public void shouldReturnDivisionOfTwoIntegersWhenGivenTwoIntegers() {
        String failMessage = "Expected calculator to handle integer addition.";
        assertEquals(failMessage, 4, calc.divisionInt(12, 3));
        assertEquals(failMessage, 1, calc.divisionInt(12, 7));
    }

    @Test
    public void shouldReturnSumOfTwoDoublesWhenGivenTwoDoubles() {
        String failMessage = "Expected calculator to handle double addition.";
        assertEquals(failMessage, 5.7, calc.addDouble(3.4, 2.3),.0001);
    }

    @Test
    public void shouldReturnDifferenceOfTwoDoublesWhenGivenTwoDoubles() {
        String failMessage = "Expected calculator to handle double addition.";
        assertEquals(failMessage, 5.0, calc.subtractDouble(5.5, 0.5),.0001);
    }

    @Test
    public void shouldReturnMultiplicationOfTwoDoublesWhenGivenTwoDoubles() {
        String failMessage = "Expected calculator to handle double addition.";
        assertEquals(failMessage, 29.48, calc.multiplyDouble(6.7, 4.4),.0001);
    }

    @Test
    public void shouldReturnDivisionOfTwoDoublesWhenGivenTwoDoubles() {
        String failMessage = "Expected calculator to handle double addition.";
        assertEquals(failMessage, 4.9090, calc.divisionDouble(10.8, 2.2),.0001);
    }
}


