package com.willian.cursojava.aula19;

public class Ex03 {
    public static void main(String[] args) {
        int[] a = new int[15];
        int[] b = new int[15];

        for (int i = 0; i < a.length; i++) {
            a[i] = i*i;
            b[i] = a[i];
        }
        //b = a;
        for (double temp: b) {
            System.out.println(temp);
        }
    }
}
