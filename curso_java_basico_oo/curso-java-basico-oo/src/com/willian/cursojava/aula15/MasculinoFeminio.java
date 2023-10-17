package com.willian.cursojava.aula15;

import java.util.Scanner;

public class MasculinoFeminio {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // 03. Digiar F ou M e dizer se é masculino ou feminino
        System.out.println("Digite M ou F que lhe direi seu sexo:");

        char sexo = scan.next().charAt(0);

        System.out.println((sexo == 'M') ? "Masculino!" : (sexo == 'F') ? "Feminino" : "Voce não digitou o que deveria! To ligado! ");
        //System.out.println(" " +sexo);
    }
}
