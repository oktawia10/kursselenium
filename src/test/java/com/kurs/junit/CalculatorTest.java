package com.kurs.junit;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    @Test
    public void testOnePlusOne(){
        //"1+1"=2
        Calculator calculator = new Calculator();
        assertEquals(2, calculator.add("1+1"));
    }
    @Test
    public void testTwoPlusThree(){
        //"1+1"=2
        Calculator calculator = new Calculator();
        assertEquals(5, calculator.add("2+3"));
    }
}
