package com.willian.cursojava.aula20;

import java.util.Random;

public class Ex03 {
    public static void main(String[] args) {
        /*gere e imprima uma matriz 4x4 com valores aleat�rios entre 0 e 9.
        Determinar maior n�mero da matriz e sua posi��o.
        */
        Random random = new Random();

        int [][] a = new int [3][3];
        int linha = 0;
        int coluna = 0;
        int par = 0;
        int impar = 0;

        for (int i = 0; i <a.length ; i++) {

            System.out.println();
            for (int j = 0; j <a[i].length ; j++) {
                a[i][j] = random.nextInt(9);

                System.out.print(" " +a[i][j]);

                if (a[i][j] % 2 == 0) {
                    par ++;
                }
                if (a[i][j] % 2 != 0 || a[i][j] == 1){
                    impar++;
                }
            }
        }



        System.out.println();
        System.out.println("Numeros Pares " +par);
        System.out.println("Numeros IMpares " +impar  );



    }
}
