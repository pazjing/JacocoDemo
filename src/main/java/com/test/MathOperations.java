package com.test;

public class MathOperations {

    public Integer add(Integer a, Integer b)
    {

        if (a < 10) {

            return a+b;

        } else {

            return 2*a+b;
        }
    }

    public Integer subtract(Integer a, Integer b)
    {
        return a-b;
    }

}
