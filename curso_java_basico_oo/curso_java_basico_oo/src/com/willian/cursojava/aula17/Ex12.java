package com.willian.cursojava.aula17;

import java.util.Scanner;

public class Ex12 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um número que lhe direi a tabuada");
        int taboada = scan.nextInt();

        System.out.println("Taboada do " +taboada);
        for (int i = 1; i < 10; i++) {
            System.out.println(taboada+ " x " +i+ " = " + (taboada*i));
        }
    }
}
