package com.willian.cursojava.aula33;


import java.util.Scanner;

public class TestaAluno {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Aluno aluno = new Aluno();
        System.out.println("Entre com o nome do aluno");
        aluno.setNome(scan.next());

        System.out.println("Entre com o nome do curso");
        aluno.setNomeCurso(scan.next());

        System.out.println("Entre com a Matricula aluno");
        aluno.setMatricula(scan.next());

        //aluno.nomeDisciplinas = new String[3];
        for (int i = 0; i < aluno.getNomeDisciplinas().length; i++) {
            System.out.println("Entre com o nome da disciplina " +i);
            aluno.setNomeDisciplinaPos(i, scan.next());
        }
        for (int i = 0; i < aluno.getNotasDisciplinas().length; i++) {
            System.out.println("Obtendo nome da Disciplina " + aluno.getNomeDisciplinas()[i]);
            for (int j = 0; j < aluno.getNotasDisciplinas()[i].length; j++) {
                System.out.println("Entre com a nota da Disciplina" + (j+i));
                aluno.setNomePosjIJ(i, j, scan.nextDouble());
            }
        }
        aluno.mostrarInfo();

        for (int i = 0; i <aluno.getNomeDisciplinas().length ; i++) {
            if(aluno.verificarAprovado(i)){
                System.out.println("Disciplina: " +aluno.getNomeDisciplinas()[i] + " Foi Aprovado");
            }else {
                System.out.println("Disciplina: " +aluno.getNomeDisciplinas()[i] + " Foi Reprovado");
            }
        }

    }
}
