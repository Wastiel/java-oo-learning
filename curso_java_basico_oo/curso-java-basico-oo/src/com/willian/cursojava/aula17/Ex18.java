package com.willian.cursojava.aula17;

import java.util.Scanner;

public class Ex18 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite 1 número para verificar se é primo:");
        int numero = scan.nextInt();

        boolean primo =true;
        for (int i = 2; i < numero; i++) {
            if(numero % i == 0){
                System.out.println("Não é primo");
                primo = false;
            }

        }
        if (primo){
            System.out.println("è número primo");
        }


    }
}
