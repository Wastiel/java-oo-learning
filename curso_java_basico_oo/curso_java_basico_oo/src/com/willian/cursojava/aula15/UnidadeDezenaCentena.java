package com.willian.cursojava.aula15;

import java.util.Scanner;

public class UnidadeDezenaCentena {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // 19. digitar um numero menor que 1000 e dizer a quantidade de centenas, dezenas e unidades.
        System.out.println("Digite um número menor que 1000 que eu vou dizer a quantidade de centenas, dezenas e unidades:");

        int numero1 = scan.nextInt();

        if (numero1 > 0 && numero1 < 1000) {
            int dezena = numero1 % 100;
            int unidade = dezena % 10;

            dezena = (dezena - unidade) / 10;
            int centena = (numero1 - dezena - unidade) / 100;

            System.out.println(centena + " centenas!");
            System.out.println(dezena + " dezenas!");
            System.out.println(unidade + " unidades!");
        }else {
            System.out.println("Número digitado inválido");
        }
    }
}
