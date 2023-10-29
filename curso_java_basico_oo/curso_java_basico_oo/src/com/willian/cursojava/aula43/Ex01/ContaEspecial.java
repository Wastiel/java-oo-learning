package com.willian.cursojava.aula43.Ex01;

public class ContaEspecial extends ContaBancaria{
    private double limite;

    public void setLimite(double limite) {
        this.limite = limite;
    }

    public double getLimite() {
        return limite;
    }

    @Override
    public String toString() {
        String s = " Conta Especial[";
        s += "; Dia Rendimento: " + limite;
        s += "; " + super.toString();
        s += "; ]";

        return s;
    }

    public boolean sacar(double valor){
        double saldoComLimite = this.getSaldo() + limite;

        if((saldoComLimite-valor)>=0) {
            this.setSaldo(this.getSaldo() - valor);
            return true;
        }
        return false;
    }
}
