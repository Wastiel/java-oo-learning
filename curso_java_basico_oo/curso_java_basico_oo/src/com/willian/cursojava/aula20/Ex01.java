package com.willian.cursojava.aula20;

import java.util.Random;

public class Ex01 {
    public static void main(String[] args) {
        /*gere e imprima uma matriz 4x4 com valores aleatórios entre 0 e 9.
        Determinar maior número da matriz e sua posição.
        */
        Random random = new Random();

        int [][] a = new int [4][4];
        int linha = 0;
        int coluna = 0;
        int maior = 0;
        int menor = 0;

        for (int i = 0; i <a.length ; i++) {

            System.out.println();
            for (int j = 0; j <a[i].length ; j++) {
                a[i][j] = random.nextInt(100);

                System.out.print(" " +a[i][j]);
                if(j == 0 && i == 0){
                    maior = a[i][j];
                    menor = a[i][j];

                }
                if (a[i][j] > maior) {
                    maior = a[i][j];
                    coluna = j;
                    linha = i;
                }
                if (a[i][j]<menor){
                    menor = a[i][j];
                }
            }
        }

        System.out.println();
        System.out.println("linha "+(linha+1)+ " ");
        System.out.println("coluna "+(coluna+1)+ " ");
        System.out.println("Valor: " + a[linha][coluna]);

    }
}
