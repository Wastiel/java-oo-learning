package com.willian.cursojava.aula17;

import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite dois n�meros que vou fazer uma m�gica");
        System.out.println("Digite um n�mero");
        int a = scan.nextInt();

        System.out.println("Digite um n�mero");
        int b = scan.nextInt();

        while (a <=b){
            System.out.println("N�mero: " +a );
            a++;
        }
    }
}
