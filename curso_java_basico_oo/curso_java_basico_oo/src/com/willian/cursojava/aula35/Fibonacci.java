package com.willian.cursojava.aula35;

public class Fibonacci {
    static int n;

    public static int fibonaci(int num){

        if(num < 2){
            return 1;
        }
        return fibonaci(num-1) + fibonaci(num-2);
    }
}
