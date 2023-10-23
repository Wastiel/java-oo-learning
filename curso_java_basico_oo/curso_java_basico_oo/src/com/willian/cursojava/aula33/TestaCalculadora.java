package com.willian.cursojava.aula33;

public class TestaCalculadora {
    public static void main(String[] args) {
        MinhaCalculadora calc = new MinhaCalculadora();

        System.out.println("Soma: " +calc.soma(1, 2));
        System.out.println("Soma: " +calc.soma(1.0, 2.0));
    }
}
