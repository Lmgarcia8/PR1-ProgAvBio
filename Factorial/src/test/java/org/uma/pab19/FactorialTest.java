package org.uma.pab19;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class FactorialTest {
    private static final double EPSILON = 0.000000001;
    Factorial factorial;

    @Before
    public void setup() {
        factorial = new Factorial();
    }

    @After
    public void after() {
        factorial = null;
    }

    @Test
    public void shouldFactorialOfZeroReturnOne() {
        double expectedResult = 1;
        double obtainedResult = factorial.compute(0);

        assertEquals(expectedResult, obtainedResult, EPSILON);
    }

    @Test
    public void shouldFactorialOfOneReturnOne() {
        double expectedResult = 1;
        double obtainedResult = factorial.compute(1);

        assertEquals(expectedResult, obtainedResult, EPSILON);
    }

    @Test
    public void shouldFactorialOfTwoReturnOne() {
        double expectedResult = 2;
        double obtainedResult = factorial.compute(2);

        assertEquals(expectedResult, obtainedResult, EPSILON);
    }

    @Test
    public void shouldFactorialOfThreeReturnOne() {
        double expectedResult = 6;
        double obtainedResult = factorial.compute(3);

        assertEquals(expectedResult, obtainedResult, EPSILON);
    }

    @Test
    public void shouldFactorialOfFourReturnOne() {
        double expectedResult = 24;
        double obtainedResult = factorial.compute(4);

        assertEquals(expectedResult, obtainedResult, EPSILON);
    }

    @Test(expected = RuntimeException.class)
    public void shouldFactorialThrowsAnExceptionIfTheValueIsNegative() {
        factorial.compute(-2);
    }
}