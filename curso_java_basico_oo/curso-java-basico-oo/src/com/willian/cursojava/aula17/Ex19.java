package com.willian.cursojava.aula17;

import java.util.Scanner;

public class Ex19 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Diga quantos números você vai digitar:");
        int quantidade = scan.nextInt();
        int maior;
        int menor;
        int total = 0;


        System.out.println("Digite o número " +1);
        int numero = scan.nextInt();

        maior = numero;
        menor = numero;

        total += numero;
        for (int i = 2; i <=quantidade; i++) {
            System.out.println("Digite o número "+i+":");
            numero = scan.nextInt();

            if (numero > maior){
                maior = numero;
            } else if (menor <numero) {
                menor = numero;
            }
            total +=numero;


        }
        System.out.println("Menor " +menor);
        System.out.println("Maior " +maior);
        System.out.println("Total " +total);



    }
}
