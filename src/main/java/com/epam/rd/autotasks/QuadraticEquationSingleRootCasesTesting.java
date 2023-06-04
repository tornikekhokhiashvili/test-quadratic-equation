package com.epam.rd.autotasks;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static junit.framework.TestCase.assertEquals;

@RunWith(Parameterized.class)
public class QuadraticEquationSingleRootCasesTesting {
    protected QuadraticEquation quadraticEquation = new QuadraticEquation();
    private double a;
    private double b;
    private double c;
    private double expected;
    public QuadraticEquationSingleRootCasesTesting(double a, double b, double c, double expected) {
            this.a=a;
            this.b=b;
            this.c=c;
            this.expected=expected;

    }
    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {1, -2, 1, 1},
                // Add more test cases here
        });
    }

    @Test
    public void testSingleRootCase() {
        String expected = "1.0"; // Replace with the expected string value
        String actual = quadraticEquation.solve(a, b, c);
        assertEquals(expected, actual);
    }
}