package com.elizabeth.study;

public class Fibonacci {
    public static int fibonacci(int input) {
        if (input == 1 || input == 0) {
            return 1;
        }
        return (fibonacci(input - 1) + fibonacci(input - 2));
    }
}
