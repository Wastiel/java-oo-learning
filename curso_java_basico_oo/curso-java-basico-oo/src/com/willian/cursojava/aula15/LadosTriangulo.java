package com.willian.cursojava.aula15;

import java.util.Scanner;

public class LadosTriangulo {
    public static void main(String[] args) {
        /* 15. Pegar 3 lados e avaliar se � triangulo
        tres lados formam m triangulo quando a soma de quaisquer dois lados, foi maior que o terceiro
        triangulo equilatoer todos iguais
        tranqulo issceles quaisquer dois lados iguais
        trianguloescaleno tres lados diferentes
         */
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite os 3 lados de um triangulo: ");

        double ladoA = scan.nextDouble();
        double ladoB = scan.nextDouble();
        double ladoC = scan.nextDouble();

        if ((ladoA+ladoB>ladoC)||(ladoA+ladoC>ladoB)||(ladoC+ladoB>ladoA)){
            if (ladoA==ladoB && ladoB==ladoC){
                System.out.println("� um tri�ngulo Equil�tero: Todos os lados s�o iguais");
            } else if ((ladoA!=ladoB && ladoB!=ladoC)&&(ladoC!=ladoA)) {
                System.out.println("� um tri�ngulo Escaleno: Todos os lados s�o diferentes");
            }else {
                System.out.println("� um tri�ngulo Is�sceles: pelo menos dois lados s�o iguais");
            }

        }
    }
}
