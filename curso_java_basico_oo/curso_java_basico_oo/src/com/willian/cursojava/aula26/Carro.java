package com.willian.cursojava.aula26;

public class Carro {
    String marca;
    String modelo;
    int numPassageiros;
    double capCombustivel;
    double consumoCombustivel;

    void exibirAutonomia(){
        System.out.println("A autonnomia do carro �: " +capCombustivel * consumoCombustivel + "km");
    }
    double obterAutonomia(){
        System.out.println("M�todos obterAutonomia foi chamado");
        return capCombustivel*consumoCombustivel;
    }


}
