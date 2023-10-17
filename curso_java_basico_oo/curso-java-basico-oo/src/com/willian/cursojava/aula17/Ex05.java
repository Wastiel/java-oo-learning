package com.willian.cursojava.aula17;

import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i = 0;
        double populacaoA = 80000;
        double populacaoB = 200000;

        System.out.println("Digite a população A: ");
        populacaoA = scan.nextDouble();
        System.out.println("Taxa A: ");
        double taxaA = scan.nextDouble();
        System.out.println("Digite a população B: ");
        populacaoB = scan.nextDouble();

        System.out.println("Taxa B ");
        double taxaB = scan.nextDouble();

        int anos = 0;

        System.out.println(taxaA/100);
        System.out.println(taxaB/100);

        while (i <1){


            populacaoA = populacaoA + (populacaoA * (taxaA/100));
            populacaoB = populacaoB + (populacaoB * (taxaB/100));
            anos ++;


            if(populacaoA == populacaoB){
                i = 1;
            }

        }
        System.out.println("A população se equiparou em " +anos+ " anos");
    }
}
