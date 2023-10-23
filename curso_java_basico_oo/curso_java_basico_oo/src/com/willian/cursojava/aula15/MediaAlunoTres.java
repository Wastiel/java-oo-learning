package com.willian.cursojava.aula15;

import java.util.Scanner;

public class MediaAlunoTres {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // 20. Aluno Aprovado >=7, reprovado se for menor que 7 e se for 10, aprovado com distinção
        System.out.println("Digite as tres notas do aluno: ");

        double nota1 = scan.nextDouble();
        double nota2 = scan.nextDouble();
        double nota3 = scan.nextDouble();

        double media = (nota2 + nota1 + nota3)/3;

        System.out.println((media==10) ? "A provado com Distinção! Nota " +media : (media>=7) ? "Aprovado!! Com nota: " + media : "Reporovado! nota:" +media );
    }
}
