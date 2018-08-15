package com.elizabeth.study;


import org.junit.Assert;
import org.junit.Test;

public class FibonacciTest {
    private void verifyFibonacci(int input, int expectedOutput) {
        Assert.assertEquals(expectedOutput, Fibonacci.fibonacci(input));
    }

    @Test
    public void shouldReturnOneWhenInputIsOne(){
        verifyFibonacci(0, 1);
    }

    @Test
    public void shouldReturnOneWhenInputIsTwo(){
        verifyFibonacci(1, 1);
    }

    @Test
    public void shouldReturnTwoWhenInputIsThree(){
        verifyFibonacci(2, 2);
    }

    @Test
    public void shouldReturnThreeWhenInputIsThree(){
        verifyFibonacci(3, 3);
    }

    @Test
    public void shouldReturnFiveWhenInputIsFour(){
        verifyFibonacci(4, 5);
    }
    @Test
    public void shouldReturnEightWhenInputIsFive() {
        verifyFibonacci(5,8);
    }

}
