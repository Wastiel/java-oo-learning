package com.willian.cursojava.aula17;

import java.util.Scanner;

public class Ex14 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite 10 n�meros que vou dizer quantos pares e quantos impares");

       int totalImpar = 0;
       int totalPar = 0;




        for (int i = 0; i < 5; i++){
            System.out.println("Digite um n�mero de Expoente");
            int numero = scan.nextInt();

            if(numero % 2 == 0){
                System.out.println("O " +numero+ "� par");
                totalPar++;
            } else {
                System.out.println("O " +numero+ "� impar");
                totalImpar++;
            }

        };
        System.out.println("total de Pares: " +totalPar);
        System.out.println("total de Pares: " +totalImpar);

    }
}
