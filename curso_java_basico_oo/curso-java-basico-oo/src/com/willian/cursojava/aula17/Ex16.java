package com.willian.cursojava.aula17;

public class Ex16 {
    public static void main(String[] args) {
        int anterior1 = 1;
        int anterior2 = 1;
        int fibonnaci = 1;

        for (int i = 0; i < 500; i++) {
            fibonnaci = anterior1+anterior2;
            anterior2 = anterior1;
            anterior1 = fibonnaci;


            System.out.print(" Fibbonaci " + fibonnaci );

        }
    }
}
