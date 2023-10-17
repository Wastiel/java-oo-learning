package com.willian.cursojava.aula17;

import java.util.Scanner;

public class Ex07 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite sua idade ");
        int numero = scan.nextInt();
        int maior = numero;
        int i = 0;

        while (i < 5){
            System.out.println("Digite sua idade ");
            numero = scan.nextInt();

            if(maior < numero){
                maior = numero;
            }else {

            }
            i++;
        }
        System.out.println("O número maior é: " + maior);
    }
}
