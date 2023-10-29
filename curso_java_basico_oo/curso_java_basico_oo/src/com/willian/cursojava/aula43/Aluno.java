package com.willian.cursojava.aula43;

import java.util.Arrays;

public class Aluno {

    private String curso;
    private double[] notas;

    public Aluno(){
        super();
    }

    public Aluno(String curso) {
        this.curso = curso;
    }

    public Aluno(String nome, String endereco, String telefone, String curso) {
        //super(nome, endereco, telefone);
        this.curso = curso;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public double[] getNotas() {
        return notas;
    }

    public void setNotas(double[] notas) {
        this.notas = notas;
    }

    public double calcularMedia(){
        return 0;
    }
    public boolean verificarAprovado(){
        return true;
    }
    public void metodoQualquer(){
        //super.setCpf("asdads");
        //this.setCpf("asdasda");

    }
    public String obterEtiquetaEndereco(){
        String s = "Endereco do Aluno ";
        //s += super.getEndereco();
        return s;
    }
    /*public String toString(){
     String s = curso + "\n";
     for (double nota : notas){
         s +=notas+ " ";
     }
     return s;
    }*/

    @Override
    public String toString() {
        return "Aluno{" +
                "curso='" + curso + '\'' +
                ", notas=" + Arrays.toString(notas) +
                '}';
    }
}
