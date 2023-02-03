package com.example;

public class Factorial {
    public final static int getFactorialRec(int n) {
        if (n == 0 || n == 1)
            return 1;
        else {
            return n * getFactorialRec(n - 1);
        }
    }
}
