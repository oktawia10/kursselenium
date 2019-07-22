package com.kurs.junit;

public class Calculator {

    public int add(String numbers){
        String[] parts = numbers.split("\\+");
        int a = Integer.parseInt(parts [0]);
        int b = Integer.parseInt(parts [1]);
        return a+b ;

    }
}
