package com.willian.cursojava.aula19;

public class Ex11 {
    public static void main(String[] args) {
        int[] a = new int[10];
        int[] b = new int[10];
        int contador = 0;
        for (int i = 0; i < a.length; i++) {
            a[i] = i*2;
            if(a[i] % 2 == 0){
                System.out.println(a[i]);
                contador ++;
            }
        }
        System.out.println("Quantidade de números pares: " +contador);
    }
}
