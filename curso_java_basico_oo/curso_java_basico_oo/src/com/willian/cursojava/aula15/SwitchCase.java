package com.willian.cursojava.aula15;

import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Entre com um dia da semana");

        int diaSemana = scan.nextInt();

        switch (diaSemana) {
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("segunda");
                break;
            case 3:
                System.out.println("Terca");
                break;
            case 4:
                System.out.println("Quarta");
                break;
            case 5:
                System.out.println("Quinta");
                break;
            case 6:
                System.out.println("Sexta");
                break;
            case 7:
                System.out.println("sabado");
                break;
            default:
                System.out.println("N�o � um dia da semana v�lido");
        }
        switch (diaSemana) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("Dia Util");
                break;
            case 7:
                System.out.println("sabado");
                break;
            default:
                System.out.println("N�o � um dia da semana v�lido");
        }

    }
}