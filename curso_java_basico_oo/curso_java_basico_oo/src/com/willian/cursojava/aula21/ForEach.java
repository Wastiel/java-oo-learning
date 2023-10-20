package com.willian.cursojava.aula21;

import java.util.Random;

public class ForEach {
    public static void main(String[] args) {
        int [] notas = new int[10];
        Random random = new Random();
        for (int i = 0; i < notas.length; i++) {
            notas[i] = random.nextInt(10);
        }
        for (int i = 0; i < notas.length; i++) {
            System.out.println("Notas: " +notas[i]);
        }

        System.out.println("Usando o For each");
        for (int nota: notas){
            System.out.println(" Notas com For EACH: " +nota);
        }
        double [][] a = new double[2][2];

        a[0][0] = random.nextDouble(10);
        a[0][1] = random.nextDouble(10);
        a[1][0] = random.nextDouble(10);
        a[1][1] = random.nextDouble(10);

        for(double[] b: a){
            for(double c: b){
                System.out.println(c + " ");
            }
        }

    }
}
