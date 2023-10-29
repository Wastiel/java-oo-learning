package com.willian.cursojava.aula43.Ex02;

public class PessoaJuridica extends Contribuinte{

    private String cnpj;

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    @Override
    public double calcularImposto() {
        return this.getRendaBruta() * 0.1;

    }

    @Override
    public String toString() {
        String s ="--Pessoa juridica--";
        s+= super.toString();
        s+= "; CNPJ: " +cnpj;
        s+= "; imposto a ser pago: " +calcularImposto();
        s+= "\n";

        return s;
    }
}
