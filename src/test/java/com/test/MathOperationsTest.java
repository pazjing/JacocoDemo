package com.test;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MathOperationsTest {

    @Test
    public void testAdd()
    {

        MathOperations operations = new MathOperations();
        Integer actual = operations.add(5, 8);
        Integer expected = 13;
        assertEquals(expected, actual);

    }


}
