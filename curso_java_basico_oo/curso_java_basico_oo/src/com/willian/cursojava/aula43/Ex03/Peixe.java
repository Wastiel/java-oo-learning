package com.willian.cursojava.aula43.Ex03;

public class Peixe extends Animal{
    private String caracteristicas;
    public Peixe() {
        this.setPatas(0);
        this.setAmbiente("Mar");
        this.setCor("Cinzenta");
        this.caracteristicas = "barbatanas$e$cauda";
    }

    public String getCaracteristicas() {
        return caracteristicas;
    }

    public void setCaracteristicas(String caracteristicas) {
        this.caracteristicas = caracteristicas;
    }

    @Override
    public String toString() {
        String s = super.toString();
        s += "\nCaracteris: "  +caracteristicas;
        return s;
    }
}
