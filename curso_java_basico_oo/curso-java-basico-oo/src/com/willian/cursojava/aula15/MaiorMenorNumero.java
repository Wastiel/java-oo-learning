package com.willian.cursojava.aula15;

import java.util.Scanner;

public class MaiorMenorNumero {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // 07. Digiar 3 numeros e dizer qual é o maior e o menor.
        System.out.println("Digite 3 números, vou lhe dizer qual é o maior e qual o menor:");

        int numero1 = scan.nextInt();
        int numero2 = scan.nextInt();
        int numero3 = scan.nextInt();

        System.out.println((numero1>numero2 && numero1>numero3) ? "O " +numero1+ " é maior de todos!!" :  (numero2>numero1 && numero2>numero3) ? "O " +numero2+ " é maior de todos!" : "O " +numero3+ " é maior de todos!");
        System.out.println((numero1<numero2 && numero1<numero3) ? "O " +numero1+ " é menor de todos!!" :  (numero2<numero1 && numero2<numero3) ? "O " +numero2+ " é menor de todos!" : "O " +numero3+ " é menor de todos!");

    }
}
