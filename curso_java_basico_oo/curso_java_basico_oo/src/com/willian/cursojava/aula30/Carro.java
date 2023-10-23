package com.willian.cursojava.aula30;

public class Carro {

    String marca;
    String modelo;
    int numPassageiros;
    double capCombustivel;
    double consumoCombustivel;



    public Carro(String marca, String modelo, int numPassageiros, double capCombustivel, double consumoCombustivel) {
        this.marca = marca;
        this.modelo = modelo;
        this.numPassageiros = numPassageiros;
        this.capCombustivel = capCombustivel;
        this.consumoCombustivel = consumoCombustivel;
    }
    public Carro(){

    }

    public Carro(String marca, String modelo, int numPassageiros) {
        this.marca = marca;
        this.modelo = modelo;
        this.numPassageiros = numPassageiros;
    }

    public Carro(String marca, String modelo){
        this("fiat", "ducato", 10);
        System.out.println("Chamando o construtor com 2 parametros");
    }

    void exibirAutonomia() {
        System.out.println("A autonnomia do carro é: " + this.capCombustivel * this.consumoCombustivel + "km");
    }

    double obterAutonomia() {
        System.out.println("Métodos obterAutonomia foi chamado");
        return this.capCombustivel * this.consumoCombustivel;
    }

    double calcularCombustivel(double km) {
        double qtdCombustivel = km / this.consumoCombustivel;
        return qtdCombustivel;
    }
}
