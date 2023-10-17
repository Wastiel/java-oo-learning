package com.willian.cursojava.aula15;

import java.util.Scanner;

public class PositivoNegativo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // 02. Digiar um número e ver se o mesmo é positivo ou negativo
        System.out.println("Digite um número, que vou dizer se o mesmo é positivo ou negativo:");

        int numero1 = scan.nextInt();

        System.out.println((numero1>0) ? "É positivo" : (numero1<0) ? "É negativo" : "É zero! Zé mané!");

    }
}
