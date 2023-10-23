package com.willian.cursojava.aula19;

public class Ex10 {
    public static void main(String[] args) {
        int[] a = new int[10];
        int[] b = new int[10];

        for (int i = 0; i < a.length; i++) {
            a[i] = i;
            b[i] = a[i] % 2;


            System.out.println("a "+a[i]);

            System.out.println("b "+b[i]);
        }
    }
}
