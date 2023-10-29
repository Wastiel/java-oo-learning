package com.willian.cursojava.aula43;

public class Teste {
    public static void main(String[] args) {
        Aluno aluno = new Aluno();

        aluno.setCurso("Ciencia da Computação");
        double [] notas = {10,5,12,13};
        aluno.setNotas(notas);

        System.out.println(aluno);

        String s1 = "Teste";
        String s2 = "Teste";

        System.out.println(s1.equals(s2));
    }
}
