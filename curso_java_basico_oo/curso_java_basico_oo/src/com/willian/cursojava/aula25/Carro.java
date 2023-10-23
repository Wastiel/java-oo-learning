package com.willian.cursojava.aula25;

public class Carro {
    String marca;
    String modelo;
    int numPassageiros;
    double capCombustivel;
    double consumoCombustivel;

    void exibirAutonomia(){
        System.out.println("A autonnomia do carro é: " +capCombustivel * consumoCombustivel + "km");
    }


}
