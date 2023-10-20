package com.willian.cursojava.aula17;

import java.util.Scanner;

public class Ex13 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um número de base");
        int base = scan.nextInt();

        System.out.println("Digite um número de Expoente");
        int expoente = scan.nextInt();

        int resultado = base;

        /*for (int i = 1; i < expoente; i++){
            resultado *=base;
            System.out.println("Sresultado: " +resultado);
        };
        System.out.println("Resultado: " +resultado);*/

        for (int i = 1; i < expoente;resultado *=base, i++);
        System.out.println("Resultado: " +resultado);
    }
}
