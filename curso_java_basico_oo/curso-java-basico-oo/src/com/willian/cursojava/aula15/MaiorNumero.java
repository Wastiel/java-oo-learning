package com.willian.cursojava.aula15;

import java.util.Scanner;

public class MaiorNumero {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // 01. Digiar dois numeros e dizer qual é o maior.
        System.out.println("Digite dois números, vou lhe dizer qual é o maior:");

        int numero1 = scan.nextInt();
        int numero2 = scan.nextInt();

        System.out.println((numero1>numero2) ? "O " +numero1+ " é maior" : "O " +numero2+ " é maior");
        System.out.println((numero1>numero2) ? "O numero 1 é maior" : "O numero2  é maior");

    }
}
