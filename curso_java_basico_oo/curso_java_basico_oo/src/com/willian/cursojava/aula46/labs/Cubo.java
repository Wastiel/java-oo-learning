package com.willian.cursojava.aula46.labs;

public class Cubo extends Figura3D{

    public int lado;

    public int getLado() {
        return lado;
    }

    public void setLado(int lado) {
        this.lado = lado;
    }

    @Override
    public double calcularArea() {

        return lado * lado * lado;
    }

    @Override
    public double calcularVolume() {
        return 6*(lado*lado);
    }
}
