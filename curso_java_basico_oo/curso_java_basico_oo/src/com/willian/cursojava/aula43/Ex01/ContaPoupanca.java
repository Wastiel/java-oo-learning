package com.willian.cursojava.aula43.Ex01;

import java.util.Calendar;

public class ContaPoupanca extends ContaBancaria{
    private static int diaRendimento;

    public int getDiaRendimento() {
        return diaRendimento;
    }

    public void setDiaRendimento(int diaRendimento) {
        this.diaRendimento = diaRendimento;
    }

    @Override
    public String toString() {
        String s = " Conta Poupanca[";
        s += "; Dia Rendimento: " + diaRendimento;
        s += super.toString();
        s += "; ]";

        return s;
    }
    public boolean calcularNovoSaldo(double taxaRendimento){
        Calendar hoje = Calendar.getInstance();
        if(diaRendimento == hoje.get(Calendar.DAY_OF_MONTH)){
            this.setSaldo(this.getSaldo() + (this.getSaldo()* taxaRendimento));
            return true;
        }
        return false;
    }

}
