package com.nelkinda;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class FactorialTest {


	@Test
    public void testFactorialOfZero() {
        Factorial factorial = new Factorial();
        int result = factorial.calculateFactorial(0);
        assertEquals(1, result);
        System.out.println("Factorial of 0 is: " + result);
    }

    @Test
    public void testFactorialOfPositiveNumber() {
        Factorial factorial = new Factorial();
        int result = factorial.calculateFactorial(5);
        assertEquals(120, result);
        System.out.println("Factorial of 5 is: " + result);
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void testFactorialOfNegativeNumber() {
        Factorial factorial = new Factorial();
        factorial.calculateFactorial(-5);
    }


}
