package com.willian.cursojava.aula15;

import java.util.Scanner;

public class PositivoNegativo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // 02. Digiar um n�mero e ver se o mesmo � positivo ou negativo
        System.out.println("Digite um n�mero, que vou dizer se o mesmo � positivo ou negativo:");

        int numero1 = scan.nextInt();

        System.out.println((numero1>0) ? "� positivo" : (numero1<0) ? "� negativo" : "� zero! Z� man�!");

    }
}
