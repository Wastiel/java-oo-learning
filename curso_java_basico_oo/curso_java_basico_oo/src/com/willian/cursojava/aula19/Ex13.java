package com.willian.cursojava.aula19;

public class Ex13 {
    public static void main(String[] args) {
        int[] a = new int[10];
        int[] b = new int[10];
        int contador = 0;
        for (int i = 0; i < a.length; i++) {
            a[i] = i*5;
            System.out.println(a[i]);
            if(a[i] % 5 == 0){
                System.out.println(a[i]);
                contador += a[i];
            }
        }
        System.out.println("Soma dos multiplos de 5: " +contador);
    }
}
