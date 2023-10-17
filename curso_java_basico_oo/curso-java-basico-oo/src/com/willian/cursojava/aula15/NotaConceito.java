package com.willian.cursojava.aula15;

import java.util.Scanner;

public class NotaConceito {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        /* 14. pege duas notas de alunos e mostre em tela o conceito do mesmo,
        90 e 10 - A
        7.5 e 9 - B
        6 e 7.5 C
        4 e 6 D
        enter 4 e zero E
        */
        System.out.println("Digite as duas notas do aluno: ");

        double nota1 = scan.nextDouble();
        double nota2 = scan.nextDouble();

        double media = (nota2 + nota1)/2;
        String conceito = "";
        String apto = "Aprovado";
        if(media < 6.0){apto = "Reporvado";}

        if(media>=9&&media<=10){
            conceito = "A";
        } else if (media>= 7.5&&media<9.0) {
            conceito = "B";
        } else if (media>= 6.0 && media< 7.5) {
            conceito = "C";
        } else if (media>= 4.0 && media < 6.0) {
            conceito = "D";
        } else if (media>=0 && media < 4) {
            conceito = "E";
        }
        System.out.println("Nota 1:  " +nota1);
        System.out.println("Nota 2:  " +nota2);
        System.out.println("Sua média foi:  " +media);
        System.out.println("Você foi:  " +apto+ " com o conceito " +conceito);




    }
}
