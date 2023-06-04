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
                { 1.0, 2.0, 2.0 },  // Test case 2: Two roots
                { 2.0, 2.0, 3.0 },  // Test case 3: No roots
//                { 0.0, 2.0, 1.0 }
                { 2.0, 2.0, 3.0 }

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
