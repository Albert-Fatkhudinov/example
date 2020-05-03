package fib;

import java.math.BigInteger;
import java.util.ArrayList;

public class Fibonacci {

    public void printFibonacci(long n){
        BigInteger num0 = new BigInteger("1");
        BigInteger num1 = new BigInteger("1");
        BigInteger num2 = new BigInteger("1");

        for (int i = 2; i < n; i++) {
            num2 = num0.add(num1);
            num0 = num1;
            num1 = num2;
        }

        System.out.println(num2);
    }
}
