package com.willian.cursojava.aula17;

public class Ex15 {
    public static void main(String[] args) {
        int n = 30;
        int anterior1 = 1;
        int anterior2 = 1;
        int fibonnaci = 1;

        for (int i = 0; i < n; i++) {
            fibonnaci = anterior1+anterior2;
            anterior2 = anterior1;
            anterior1 = fibonnaci;


            System.out.print(" Fibbonaci " + fibonnaci );

        }
    }
}
