package com.willian.cursojava.aula15;

import java.util.Scanner;

public class CaixaEletronico {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // 19. digitar um numero menor que 1000 e dizer a quantidade de centenas, dezenas e unidades.
        System.out.println("Digite um número menor que 1000 que eu vou dizer a quantidade de centenas, dezenas e unidades:");

        int numero1 = scan.nextInt();

        if (numero1 >= 10 && numero1 < 600) {
            int dezena = numero1 % 100;
            int unidade = dezena % 10;

            dezena = (dezena - unidade) / 10;
            int centena = (numero1 - dezena - unidade) / 100;

            System.out.println(centena != 0 ? centena+ " notas de 100!":"");
            System.out.println(dezena != 0 ? dezena + " notas de 10! ": "");
            System.out.println(unidade != 0 ? unidade + " notas de 1!": "");
        }else {
            System.out.println("Dinheiro invalido");
        }
    }
}
