package com.epam.rd.autotasks;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import java.util.Arrays;
import java.util.Collection;
import static org.junit.Assert.assertTrue;

@RunWith(Parameterized.class)
public class QuadraticEquationTwoRootsCasesTesting {
    protected QuadraticEquation quadraticEquation = new QuadraticEquation();
        private double a;
        private double b;
        private double c;
        private String expected;
    public QuadraticEquationTwoRootsCasesTesting(double a, double b, double c, String expected) {
            this.a=a;
            this.b=b;
            this.c=c;
            this.expected=expected;
    }
    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {1, -3, 2, "1.0 2.0"},
                {1, -3, 2, "1.0 2.0"},
                {1, -3, 2, "1.0 2.0"},
                {1, -3, 2, "1.0 2.0"},
        });
    }

    @Test
    public void testTwoRootsCase() {
        String actual = quadraticEquation.solve(a, b, c);
        String expected1 = "1.0 2.0";
        String expected2 = "2.0 1.0";
        assertTrue(actual.equals(expected1) || actual.equals(expected2));
    }

}
