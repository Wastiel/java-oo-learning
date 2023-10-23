package com.willian.cursojava.aula34;

import java.util.Scanner;

public class TestaCalculadora {
    static int resultSoma;
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        int num;
        do {
            System.out.println("Entre com um número positivo");
            num = scan.nextInt();
            if(num<0){
                System.out.println("Número inválido!");
            }
        } while (num<0);

        System.out.println(Calculadora.fatorial(num));


        resultSoma = MinhaCalculadora.soma(1,2);
        System.out.println("Soma: " +soma2val(1, 2));

    }
    static int soma2val(int num1, int num2){
        return MinhaCalculadora.soma(num1, num2);
    }
}
