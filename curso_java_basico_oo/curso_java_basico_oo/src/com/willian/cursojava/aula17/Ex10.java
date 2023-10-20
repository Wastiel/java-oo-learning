package com.willian.cursojava.aula17;

import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite dois números que vou fazer uma mágica");
        System.out.println("Digite um número");
        int a = scan.nextInt();

        System.out.println("Digite um número");
        int b = scan.nextInt();

        while (a <=b){
            System.out.println("Número: " +a );
            a++;
        }
    }
}
