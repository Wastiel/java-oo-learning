package com.willian.cursojava.aula16;

public class LoopWhile {
    public static void main(String[] args) {
        int i = 0;
        int max = 10;
        System.out.println("Contando até " + max);

        while (i <max){
            System.out.println("Contando: " +i);
            i++;

        }

        do {
            i++;
            System.out.println("valor de I" + i);
        } while (i<15);
            System.out.println("" +i);
        }

    }

