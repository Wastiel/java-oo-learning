package com.willian.cursojava.aula24;

public class TesteCarro {
    public static void main(String[] args) {
        Carro van = new Carro();
        van.marca = "Fiat";
        van.modelo = "Ducato";
        van.numPassageiros = 10;
        van.capCombustivel = 100;
        van.consumoCombustivel = 0.2;

        System.out.println("Marca " +van.marca);
        System.out.println("Marca " +van.modelo);
        System.out.println("Marca " +van.numPassageiros);
    }
}
