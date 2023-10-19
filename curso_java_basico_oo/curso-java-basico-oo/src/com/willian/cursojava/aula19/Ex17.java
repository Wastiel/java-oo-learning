package com.willian.cursojava.aula19;

import java.util.Random;

public class Ex17 {
    public static void main(String[] args) {
        int[] a = new int[10];

        int maior = 0;
        int menor = 0;
        int posicaoMaior = 0;
        int posicaoMenor = 0;
        for (int i = 0; i < a.length; i++) {
            a[i] = i*5;

        }
        for (int i = 0; i < a.length; i++) {
            Random random = new Random();

            // Gere um número inteiro aleatório
            int numeroAleatorio = random.nextInt(50);
            a[i] = numeroAleatorio;
            System.out.println(a[i]);

        }
        maior = a[0];
        menor = a[0];
        posicaoMaior = 0;
        posicaoMenor = 0;
        for (int i = 1; i <a.length; i++) {
            if(a[i] > maior){
                maior = a[i];
                posicaoMaior = i;
            } else if (a[i]< menor) {
                menor = a[i];
                posicaoMenor = i;

            }

        }

        System.out.println("contador: " + maior);
        System.out.println("contador: " + posicaoMaior);
        System.out.println("contador: " + menor);
        System.out.println("contador: " + posicaoMenor);


    }
}

