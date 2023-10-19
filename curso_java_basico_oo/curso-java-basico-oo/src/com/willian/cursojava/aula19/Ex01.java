package com.willian.cursojava.aula19;

public class Ex01 {
    public static void main(String[] args) {
        int[] a = new int[5];
        int[] b = new int[5];

        for (int i = 0; i < a.length; i++) {
            a[i] = i+5;
        }
        b = a;
        for (int temp: b) {
            System.out.println(temp);
        }
    }
}
