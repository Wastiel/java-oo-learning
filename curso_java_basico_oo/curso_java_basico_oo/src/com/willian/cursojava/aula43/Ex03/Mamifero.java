package com.willian.cursojava.aula43.Ex03;

public class Mamifero extends Animal{
    private String alimento;
    public Mamifero(){
        this.setCor("castanho");
        this.alimento = "mel";
    }

    public String getAlimento() {
        return alimento;
    }

    public void setAlimento(String alimento) {
        this.alimento = alimento;
    }
    public String toString() {
        String s = super.toString();
        s += "\nAlimento: "  +alimento;
        return s;
    }
}
