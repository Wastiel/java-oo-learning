package com.willian.cursojava.aula29;

public class Carro {

    String marca;
    String modelo;
    int numPassageiros;
    double capCombustivel;
    double consumoCombustivel;

    Carro(){
        System.out.println("Classe Carro foi instanciada");
        numPassageiros = 4;

    }
    Carro(String marca_, String modelo_, int numPassageiros_, double capCombustivel_){
        marca = marca_;
        modelo = modelo_;
        numPassageiros = numPassageiros_;
        capCombustivel = capCombustivel_;

    }

    public Carro(String marca, String modelo, int numPassageiros, double capCombustivel, double consumoCombustivel) {
        this.marca = marca;
        this.modelo = modelo;
        this.numPassageiros = numPassageiros;
        this.capCombustivel = capCombustivel;
        this.consumoCombustivel = consumoCombustivel;
    }

    void exibirAutonomia() {
        System.out.println("A autonnomia do carro é: " + capCombustivel * consumoCombustivel + "km");
    }

    double obterAutonomia() {
        System.out.println("Métodos obterAutonomia foi chamado");
        return capCombustivel * consumoCombustivel;
    }

    double calcularCombustivel(double km) {
        double qtdCombustivel = km / consumoCombustivel;
        return qtdCombustivel;
    }
}
