package com.willian.cursojava.aula15;

import java.util.Scanner;

public class AnoBissexto {
    public static void main(String[] args) {
        //17 validar se o ano � bissexto

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o ano que eu direi se � bissexto: ");

        int ano = scan.nextInt();

        if ((ano % 4 == 0)&&(ano % 100 != 0 || ano % 400 ==0 )){
            System.out.println("O ano "+ano+ " � bissexto");
        }else {
            System.out.println("O ano " + ano + " n�o � bissexto");
        }
    }
}
