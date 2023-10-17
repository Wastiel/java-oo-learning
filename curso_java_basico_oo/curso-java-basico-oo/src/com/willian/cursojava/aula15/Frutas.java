package com.willian.cursojava.aula15;

import java.util.Scanner;

public class Frutas {
    public static void main(String[] args) {
        // 28 quantidade de morangos e peiras
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite a quantidade de morganos adiquiridas (kg) ");
        double morango = scan.nextDouble();
        System.out.println("Digite a quantidade de morganos adiquiridas: (kg)");
        double maca = scan.nextDouble();

        double totalkg = morango + maca;
        double totalpreco = 0;

        if (totalkg > 0) {
            if (morango <= 5) {
                totalpreco = morango * 2.5;
            } else if (morango > 5) {
                totalpreco = morango * 2.2;
            }
            if (maca <= 5) {
                totalpreco = maca * 1.8;
            } else if (morango > 5) {
                totalpreco = maca * 1.50;
            }
            if(totalkg>8 &&totalpreco>25){
                totalpreco = totalpreco * 0.90;
            }
            System.out.println("O total a pagar é de: R$ " +totalpreco);
        }
        else {
            System.out.println("Peso digitado inválido");
        }
    }
}
