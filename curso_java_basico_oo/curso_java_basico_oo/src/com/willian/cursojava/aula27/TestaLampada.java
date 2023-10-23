package com.willian.cursojava.aula27;

public class TestaLampada {
    public static void main(String[] args) {
        Lampada lampada1 = new Lampada();

        lampada1.ligar();

        System.out.println("Lampada ligada? " +lampada1.ligada);

        lampada1.desligar();

        System.out.println("Lampada ligada? " +lampada1.ligada);

        lampada1.mostrarEstado();

        lampada1.mudarEstado();

        lampada1.mostrarEstado();
    }
}
