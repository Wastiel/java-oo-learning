package com.willian.cursojava.aula19;

public class Ex02 {
    public static void main(String[] args) {
        int[] a = new int[8];
        int[] b = new int[8];

        for (int i = 0; i < a.length; i++) {
            a[i] = i+3;
            b[i] = a[i]*2;
        }
        //b = a;
        for (int temp: b) {
            System.out.println(temp);
        }
    }
}
