package com.willian.cursojava.aula17;

import java.util.Scanner;

public class Ex08 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("ler alguns numeros e trazer a média e a soma");

        int soma = 0;
        double media = 0;
        int i = 1;

        while (i <=5){
            System.out.println("Digite um número");
            int numero = scan.nextInt();


            soma = soma + numero;
            media = soma/i;
            i++;
        }
        System.out.println("O número da soma é: " + soma);
        System.out.println("O número da média é: " + media);
    }
}
