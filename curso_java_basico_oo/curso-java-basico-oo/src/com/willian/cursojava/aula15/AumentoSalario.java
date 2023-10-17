package com.willian.cursojava.aula15;

import java.util.Scanner;

public class AumentoSalario {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        /* 11. Digitar o Salario e aplicar um reajuste conforme as regras abaixo:
        Salario até 280 - Aumento de 20%
        Salario entre 280 e 700 aumento de 15%
        salario entre 700 e 1500 aumento de 10%
        salario de 1500 para cima, aumento de 5%

        Salario antes do reajuste
        O percentual de aumento aplicado
        o valor do aumento
        O novo salario após o aumento
         */
        System.out.println("Digite o valor do salário, para aplicarmos o rejuste:");

        double salario = scan.nextDouble();
        double percentualAumento;
        double valorAumento;
        double novoSalario;

        if(salario <280){
            percentualAumento = 20.00;
            valorAumento = salario * (percentualAumento/100);
            novoSalario = salario + valorAumento;
        } else if (salario >=280 && salario < 700) {
            percentualAumento = 15.00;
            valorAumento = salario * (percentualAumento/100);
            novoSalario = salario + valorAumento;
        } else if (salario >= 700 && salario < 1500) {
            percentualAumento = 10.00;
            valorAumento = salario * (percentualAumento/100);
            novoSalario = salario + valorAumento;
        } else {
            percentualAumento = 5.00;
            valorAumento = salario * (percentualAumento/100);
            novoSalario = salario + valorAumento;
        }

        System.out.println("O salário atual é: " + salario);
        System.out.println("A porcentagem de aumento é: " + percentualAumento);
        System.out.println("O salário aumentou: " + valorAumento);
        System.out.println("O novo salário é: " + novoSalario);

    }
}
