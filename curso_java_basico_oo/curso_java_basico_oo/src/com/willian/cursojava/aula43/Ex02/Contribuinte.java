package com.willian.cursojava.aula43.Ex02;

public abstract class Contribuinte {
    private String nome;
    private double rendaBruta;

    public String getNome() {
        return nome;
    }

    public double getRendaBruta() {
        return rendaBruta;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setRendaBruta(double rendaBruta) {
        this.rendaBruta = rendaBruta;
    }

    public abstract double calcularImposto();

    @Override
    public String toString() {
        String s = "Nome: " + nome;
        s+= "; Renda Bruta: " +rendaBruta;
        return s;
    }
}
