package com.demo;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class FactorialTest {
    
    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][] { { 0, 1 }, { 1, 1 }, { 2, 2 }, { 3, 6 }, { 4, 24 }, {5, 120} });
    }
    
    private int fInput;
    private int fExpected;
    
    public FactorialTest(int input, int expected) {
        fInput = input;
        fExpected = expected;
    }
    
    @Test
    public void testRunIterative() {
        Assert.assertEquals(fExpected, Factorial.runIterative(fInput));
    }

    @Test
    public void testRunRecursive() {
        Assert.assertEquals(fExpected, Factorial.runRecursive(fInput));
    }

}
