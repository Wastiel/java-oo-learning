package com.willian.cursojava.aula15;

import java.util.Scanner;

public class ParImpar {
    public static void main(String[] args) {
        // 22. Determinar se o numero � par ou impar
        Scanner scan = new Scanner(System.in);
        System.out.println("Entre com o n�mero que direi se ele � par ou impar:");

        int numero = scan.nextInt();

        if(numero % 2 == 0){
            System.out.println("Par");
        }else {
            System.out.println("Impar");
        }
    }
}
