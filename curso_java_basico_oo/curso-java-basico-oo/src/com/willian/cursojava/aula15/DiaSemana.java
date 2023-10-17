package com.willian.cursojava.aula15;

import java.util.Scanner;

public class DiaSemana {
    public static void main(String[] args) {

        // 13. Programa que leia o numero e exiba o dia correspondente da semana
        Scanner scan = new Scanner(System.in);
        System.out.println("Entre com um dia da semana");


        int diaSemana = scan.nextInt();

        switch (diaSemana) {
            case 1:
                System.out.println(diaSemana+ "-Domingo");
                break;
            case 2:
                System.out.println(diaSemana+ "-Segunda");
                break;
            case 3:
                System.out.println(diaSemana+ "-Terca");
                break;
            case 4:
                System.out.println(diaSemana+ "-Quarta");
                break;
            case 5:
                System.out.println(diaSemana+ "-Quinta");
                break;
            case 6:
                System.out.println(diaSemana+ "-Sexta");
                break;
            case 7:
                System.out.println(diaSemana+ "-sabado");
                break;
            default:
                System.out.println("Não é um dia da semana válido, seu bobão!");
        }
    }
}
