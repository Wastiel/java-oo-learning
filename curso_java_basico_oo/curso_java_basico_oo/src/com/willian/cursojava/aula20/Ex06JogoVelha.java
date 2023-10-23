package com.willian.cursojava.aula20;

import java.util.Scanner;

public class Ex06JogoVelha {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Olá!! Bem vindo ao jogo da vélha! ");

        int[][] a = new int[3][3];
        int contador = 1;
        for (int i = 0; i < a.length; i++) {
            System.out.println();
            for (int j = 0; j < a[i].length; j++) {
                a[i][j] = contador;
                contador++;
                System.out.print(" " + a[i][j]);
            }

        }
        System.out.println();
        System.out.println("O primeiro player vai jogar com O e o segundo player com o X");
        int jogo = 1;
        int acao = 0;
        int jogada = 1;

        int jogador = 1;
        while (jogo != 0) {
            System.out.println("");
            System.out.println("Jogador " + jogador + ", digite sua opção: ");
            acao = scan.nextInt();

            if (acao < 1 || acao > 9) {
                System.out.println("Opção inválida, favor digite novamente.");
            }


            for (int i = 0; i < a.length; i++) {
                System.out.println();
                System.out.println("____________");
                for (int j = 0; j < a[i].length; j++) {
                    if (acao == a[i][j]) {
                        if (jogador == 1) {
                            a[i][j] = 0;
                            jogador = 2;
                            jogada ++;
                        } else if (jogador == 2) {
                            a[i][j] = 10;
                            jogador = 1;
                            jogada ++;
                        }
                    }

                    System.out.print(a[i][j] == 0 ? "| X " : a[i][j] == 10 ? "| O " : "| " + a[i][j] + " ");
                    System.out.print("");

                }
                System.out.print("|");

            }
            System.out.println();
            System.out.println("____________");
            if ((a[0][0] == 0 && a[0][1] == 0 && a[0][2] == 0) ||
                    (a[1][0] == 0 && a[1][1] == 0 && a[1][2] == 0) ||
                    (a[2][0] == 0 && a[2][1] == 0 && a[2][2] == 0) ||
                    (a[0][0] == 0 && a[1][1] == 0 && a[2][2] == 0) ||
                    (a[2][0] == 0 && a[1][1] == 0 && a[0][2] == 0) ||
                    (a[0][1] == 0 && a[1][1] == 0 && a[2][1] == 0) ||
                    (a[0][2] == 0 && a[1][2] == 0 && a[2][2] == 0)
            ) {

                System.out.println("");
                System.out.println("__________________________________________");
                System.out.println("O Jogador 1 foi o vencedor" );
                System.out.println("O programa vai ser encerrado");
                jogo = 0;

            }
            if ((a[0][0] == 10 && a[0][1] == 10 && a[0][2] == 10) ||
                    (a[1][0] == 10 && a[1][1] == 10 && a[1][2] == 10) ||
                    (a[2][0] == 10 && a[2][1] == 10 && a[2][2] == 10) ||
                    (a[0][0] == 10 && a[1][1] == 10 && a[2][2] == 10) ||
                    (a[2][0] == 10 && a[1][1] == 10 && a[0][2] == 10) ||
                    (a[0][1] == 10 && a[1][1] == 10 && a[2][1] == 10) ||
                    (a[0][2] == 10 && a[1][2] == 10 && a[2][2] == 10)
            ) {

                System.out.println("");
                System.out.println("__________________________________________");
                System.out.println("O Jogador 2 foi o vencedor" );
                System.out.println("O programa vai ser encerrado");
                jogo = 0;

            }if (jogada>9){
                System.out.println("");
                System.out.println("__________________________________________");
                System.out.println("Empataou!!!!" );
                System.out.println("O programa vai ser encerrado");
                jogo = 0;

            }

        }
    }
}