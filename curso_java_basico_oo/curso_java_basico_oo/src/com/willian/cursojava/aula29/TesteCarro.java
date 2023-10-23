package com.willian.cursojava.aula29;

public class TesteCarro {
    public static void main(String[] args) {

        Carro van = new Carro();
        van.marca = "fiat";
        van.modelo = "Ducato";
        van.numPassageiros = 10;
        van.capCombustivel = 100;
        van.consumoCombustivel = 0.2;

        Carro van2 = new Carro("Fiat", "Ducato", 10, 100);

    }
}
