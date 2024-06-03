package com.epam.rd.autotasks;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class QuadraticEquationNoRootsCasesTesting {
    public QuadraticEquation quadraticEquation = new QuadraticEquation();
    private double a;
    private double b;
    private double c;
    public QuadraticEquationNoRootsCasesTesting(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][] {
                { 1.0, 2.0, 3.0 },
                { 2.0, 5.0, 7.0 },
                { 3.0, 6.0, 9.0 },
                { 2.0, 6.0, 3.0 }
        });
    }

    @Test
    public void testNoRootsCase() {
        if (a == 0.0) {
            try {
                quadraticEquation.solve(a, b, c);
                fail("Expected IllegalArgumentException, but no exception was thrown");
            } catch (IllegalArgumentException e) {
                assertNotNull(e.getMessage());
            }
        } else {
            assertEquals("no roots", quadraticEquation.solve(a, b, c));
        }
    }
}
