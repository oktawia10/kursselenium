package com.kurs.junit;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class JunitFirstTest {
    @Test
    public void test() {
        assertEquals(4, 2*2);
    }

    @Test
    public void testDoubleNumber () {
        assertEquals(3.33, 10.0/3.0, 0.1);
    }
}
