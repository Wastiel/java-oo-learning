package com.willian.cursojava.aula17;

import java.util.Scanner;

public class Ex08 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("ler alguns numeros e trazer a m�dia e a soma");

        int soma = 0;
        double media = 0;
        int i = 1;

        while (i <=5){
            System.out.println("Digite um n�mero");
            int numero = scan.nextInt();


            soma = soma + numero;
            media = soma/i;
            i++;
        }
        System.out.println("O n�mero da soma �: " + soma);
        System.out.println("O n�mero da m�dia �: " + media);
    }
}
