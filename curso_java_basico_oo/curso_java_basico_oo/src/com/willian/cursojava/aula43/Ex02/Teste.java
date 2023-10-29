package com.willian.cursojava.aula43.Ex02;

public class Teste {
    public static void main(String[] args) {

        PessoaFisica p1 = new PessoaFisica();
        p1.setNome("Contribuinte 01");
        p1.setRendaBruta(1000);
        p1.setCpf("123.456.456-25");


        PessoaJuridica p2 = new PessoaJuridica();
        p2.setNome("Contribuinte 02");
        p2.setRendaBruta(5000);
        p2.setCnpj("12.456.456/45645-1");

        PessoaFisica p3 = new PessoaFisica();
        p3.setNome("Contribuinte 03");
        p3.setRendaBruta(3000);
        p3.setCpf("756.666.123-25");

        PessoaJuridica p4 = new PessoaJuridica();
        p4.setNome("Contribuinte 02");
        p4.setRendaBruta(4000);
        p4.setCnpj("12.456.456/45645-1");

        Contribuinte[] contribuinte= new Contribuinte [4];
        contribuinte[0] = p1;
        contribuinte[1] = p2;
        contribuinte[2] = p3;
        contribuinte[3] = p4;

        for(Contribuinte c :contribuinte){
            System.out.printf(c.toString());
        }

        //cpf generator cpf gerador

    }
}
