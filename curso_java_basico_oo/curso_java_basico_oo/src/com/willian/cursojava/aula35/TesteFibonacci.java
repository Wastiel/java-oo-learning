package com.willian.cursojava.aula35;

public class TesteFibonacci {
    public static void main(String[] args) {
        System.out.println(Fibonacci.fibonaci(3));

        for (int i = 0; i < 10; i++) {
            System.out.println(Fibonacci.fibonaci(i) + " " );

        }
    }
}
