package com.willian.cursojava.aula15;

import java.util.Scanner;

public class MaiorNumero {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // 01. Digiar dois numeros e dizer qual � o maior.
        System.out.println("Digite dois n�meros, vou lhe dizer qual � o maior:");

        int numero1 = scan.nextInt();
        int numero2 = scan.nextInt();

        System.out.println((numero1>numero2) ? "O " +numero1+ " � maior" : "O " +numero2+ " � maior");
        System.out.println((numero1>numero2) ? "O numero 1 � maior" : "O numero2  � maior");

    }
}
