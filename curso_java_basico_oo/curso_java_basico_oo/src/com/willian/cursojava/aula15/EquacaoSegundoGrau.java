package com.willian.cursojava.aula15;

import java.util.Scanner;

public class EquacaoSegundoGrau {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Equacao de Segundo Grau: ");
        System.out.println("Digite os valor de A: ");
        int a = scan.nextInt();

        if(a != 0){
            System.out.println("Digite os valor de B e C: ");
            int b = scan.nextInt();
            int c = scan.nextInt();
            int delta = (b*b)-(4*a*c);
            double x1 = (-b + Math.sqrt(delta)) / (2 * a);
            double x2 = (-b - Math.sqrt(delta)) / (2 * a);
            if(delta <0){
                System.out.println("O delta é menor que zero e portanto não possui raizes. \n O programa vai ser encerrado");
            } else if (delta == 0) {
                System.out.println("O delta é igual a zero. Assim temos somente uma raiz "+x1+" e "+x2+". ");
            }else {
                System.out.println("O delta é imaior que zero. Assim temos as seguintes raizes raiz: \nX1 "+x1+" \nX2 "+x2+".  ");
            }
        } else {
            System.out.println("A é igual a 0, nao sendo possível calcular uma equação de segundo grau. \n O programa vai ser finalizado.");

        }


    }
}
