package com.willian.cursojava.aula42;

public class Professor  {

    private double salario;
    private String nomecurso;

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getNomecurso() {
        return nomecurso;
    }

    public void setNomecurso(String nomecurso) {
        this.nomecurso = nomecurso;
    }
    public double calcularsalarioLiquido(){
        return 0;
    }

    public String obterEtiquetaEndereco(){
        String s = "Professor do Aluno ";
       // s += super.getEndereco();
        return s;
    }



}
