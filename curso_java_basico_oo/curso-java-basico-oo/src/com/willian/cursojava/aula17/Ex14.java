package com.willian.cursojava.aula17;

import java.util.Scanner;

public class Ex14 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite 10 números que vou dizer quantos pares e quantos impares");

       int totalImpar = 0;
       int totalPar = 0;




        for (int i = 0; i < 5; i++){
            System.out.println("Digite um número de Expoente");
            int numero = scan.nextInt();

            if(numero % 2 == 0){
                System.out.println("O " +numero+ "é par");
                totalPar++;
            } else {
                System.out.println("O " +numero+ "é impar");
                totalImpar++;
            }

        };
        System.out.println("total de Pares: " +totalPar);
        System.out.println("total de Pares: " +totalImpar);

    }
}
