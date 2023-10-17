package com.willian.cursojava.aula15;

import java.util.Scanner;

public class MaiorNumeroTres {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // 09. Digiar 3 numeros e dizer qual é o maior.
        System.out.println("Digite 3 números, vou lhe dizer qual é o maior:");

        int numero1 = scan.nextInt();
        int numero2 = scan.nextInt();
        int numero3 = scan.nextInt();

        System.out.println((numero1>numero2 && numero1>numero3) ? "O " +numero1+ " é maior de todos!!" :  (numero2>numero1 && numero2>numero3) ? "O " +numero2+ " é maior" : "O " +numero3+ " é maior");
    }
}
