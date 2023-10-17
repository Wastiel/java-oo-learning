package com.willian.cursojava.aula17;

import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite dois números que vou fazer uma mágica");
        System.out.println("Digite um número");
        int a = scan.nextInt();

        System.out.println("Digite um número");
        int b = scan.nextInt();

        int soma = 0;
        while (a <= b){

            soma = soma + a;
            a++;
        }
        System.out.println("Número: " +soma );
    }
}
