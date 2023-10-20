package com.willian.cursojava.aula19;

public class Ex05 {
    public static void main(String[] args) {
        int[] a = new int[10];
        int[] b = new int[10];

        for (int i = 0; i < a.length; i++) {
            a[i] = i;
            b[i] = a[i]*a[i];
            System.out.println(b[i]);

        }
    }

}
