package com.willian.cursojava.aula17;

import java.util.Scanner;

public class Ex17 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Digite 1 número que vou fazer o fatorial:");


            System.out.println("Digite um número de fatorial");
            int numero = scan.nextInt();

            int resultado = numero;

        /*for (int i = numero-1; i > 0 ; i--) {
            resultado *=i;

        }*/


        for (int i = numero-1; i > 0 ;resultado *=i, i--);
        System.out.println("Fatorial resultado " +resultado);
    }
}
