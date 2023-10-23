package com.willian.cursojava.aula35;


import java.util.Scanner;

public class TestaCalculadora {

    public static void main(String[] args) {
        int fatorialNR = Calculadora.fatorialNaoRecursivo(5);
        System.out.println(fatorialNR);

        int fatorialR = com.willian.cursojava.aula34.Calculadora.fatorial(5);
        System.out.println(fatorialR);

    }
}
