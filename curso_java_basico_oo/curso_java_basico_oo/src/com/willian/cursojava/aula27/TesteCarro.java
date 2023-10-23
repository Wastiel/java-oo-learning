package com.willian.cursojava.aula27;


public class TesteCarro {
    public static void main(String[] args) {
        Carro van = new Carro();
        van.marca = "Fiat";
        van.modelo = "Ducato";
        van.numPassageiros = 10;
        van.capCombustivel = 100;
        van.consumoCombustivel = 0.2;

        System.out.println("Marca " + van.marca);
        System.out.println("Marca " + van.modelo);
        System.out.println("Marca " + van.numPassageiros);

        van.exibirAutonomia();

        double autonomia = van.obterAutonomia();
        System.out.println("Autonomia: " + autonomia);
        System.out.println("Autonomia: " + van.obterAutonomia());

        double qtdCombustivel10 = van.calcularCombustivel(10);
        double qtdCombustivel15 = van.calcularCombustivel(10);

        System.out.println("qtde Combústivel de 10" + qtdCombustivel10);
        System.out.println("qtde Combústivel de 15" + qtdCombustivel15);
    }

}

