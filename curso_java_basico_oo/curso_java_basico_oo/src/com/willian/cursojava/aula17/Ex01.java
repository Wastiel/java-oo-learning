package com.willian.cursojava.aula17;

import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int x = 0;
        while (x<1){
            System.out.println("Digite a nota do aluno de 0 a 10: ");
            double nota = scan.nextDouble();
            if (nota>10 && nota <0){
                System.out.println("Você digitou uma nova inválida!");
            }else {
                System.out.println("Você digitou as notas corretas, o programa vai ser finalizado. ");
                x=1;
            }

        }


    }
}
