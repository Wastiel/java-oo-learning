package com.willian.cursojava.aula19;

public class Ex12 {
    public static void main(String[] args) {
        int[] a = new int[10];

        int contador = 0;
        for (int i = 0; i < a.length; i++) {
            a[i] = i;
            contador +=a[i];
        }
        System.out.println("Quantidade de números pares: " +contador);
    }
}
