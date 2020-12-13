package com;

import com.example.android3lesson6.Math;

import junit.framework.TestCase;

import org.junit.After;
import org.junit.Before;

public class MathTest extends TestCase {

    Math math;

    @Before
    public void setUp() throws Exception {
        math = new Math();
    }

    @After
    public void tearDown() throws Exception {
    }

    public void testAdd() {
        assertEquals(5, 2, 3);
        assertEquals(20, 10, 10);
    }

    public void testSub() {
        assertEquals(7, 10, 3);
        assertEquals(32, 52, 20);
    }

    public void testDiv() {
        assertEquals(4, math.div(12, 3));
    }

    public void testMultiply() {
        assertEquals(16, math.multiply(4, 4));
        assertEquals(20, math.multiply(5, 4));
    }
}