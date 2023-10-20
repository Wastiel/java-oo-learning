package com.willian.cursojava.aula15;

import java.util.Scanner;

public class TresNumerosDecrescente {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // 06. Digiar 3 numeros e dizer qual é o maior.
        System.out.println("Digite 3 números, vou lhe te mostrar em ordem decrescente:");

        int numero1 = scan.nextInt();
        int numero2 = scan.nextInt();
        int numero3 = scan.nextInt();

        if (numero1>numero2 && numero1>numero3) {
            if (numero2 >= numero3) {
                System.out.println(numero1 + "\n" + numero2 + "\n" + numero3);
            }
            else{
                System.out.println(numero1 + "\n" + numero3 + "\n" + numero2);
                }
        }
        if (numero2>numero1 && numero2>numero3) {
            if (numero1 > numero3) {
                System.out.println(numero2 + "\n" + numero1+ "\n" + numero3);
            } else {
                System.out.println(numero2 + "\n" + numero3+ "\n" + numero2);
            }
        }
        if (numero3>numero2 && numero3>numero1) {
            if (numero1 > numero2) {
                System.out.println(numero3 + "\n" + numero1 + "\n" + numero2);
            } else {
                System.out.println(numero3 + "\n" + numero2 + "\n" + numero1);
            }
        }
    }
}
