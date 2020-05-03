package fib;

import org.junit.Test;

import static org.junit.Assert.*;

public class FibonacciTest {

    @Test
    public void printFibonacci() {
        Fibonacci fibonacci = new Fibonacci();
        fibonacci.printFibonacci(6L);
        fibonacci.printFibonacci(11L);
        fibonacci.printFibonacci(23);
        fibonacci.printFibonacci(2000000000);
    }
}