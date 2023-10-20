package com.willian.cursojava.aula19;

public class Ex07 {
    public static void main(String[] args) {
        int[] a = new int[10];
        int[] b = new int[10];
        int[] c = new int[10];

        for (int i = 0; i < a.length; i++) {
            a[i] = i;
            b[i] = i*2;

            c[i] = a[i]-b[i];
            System.out.println(c[i]);
        }
    }
}
