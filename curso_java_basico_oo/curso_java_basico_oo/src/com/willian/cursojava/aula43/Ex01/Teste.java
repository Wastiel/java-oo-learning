package com.willian.cursojava.aula43.Ex01;

public class Teste {
    public static void main(String[] args) {

        System.out.println("*** Teste ContaBancaria***");
        ContaBancaria contaSimples = new ContaBancaria();

        contaSimples.setNomeCliente("Cliente Conta Simples");
        contaSimples.setNumConta("1111");

        contaSimples.depositar(100);
        realizarSaque(contaSimples, 70);
        realizarSaque(contaSimples, 50);

        System.out.println(contaSimples);

        //-----------------------------------------------------
        System.out.println("*** Teste ContaPoupanca***");
        ContaPoupanca contaPoupanca = new ContaPoupanca();
        contaPoupanca.setDiaRendimento(27);

        contaPoupanca.setNomeCliente("Cliente Conta Poupanca");
        contaPoupanca.setNumConta("22222");

        contaPoupanca.depositar(100);
        realizarSaque(contaSimples, 70);
        realizarSaque(contaSimples, 50);

        if (contaPoupanca.calcularNovoSaldo(0.5)){
            System.out.println("Rendimento aplicado, novo saldo é de = " + contaPoupanca.getSaldo());
        }else {
            System.out.println("Hoje Não é dia de rendimento");
        }

        //-----------------------------------------------------
        System.out.println("*** Teste ContaEspecial ***");
        ContaEspecial contaEspecial = new ContaEspecial();


        contaEspecial.setNomeCliente("Cliente Conta Poupanca");
        contaEspecial.setNumConta("22222");
        contaEspecial.setLimite(50);

        contaEspecial.depositar(100);
        realizarSaque(contaEspecial, 70);
        realizarSaque(contaEspecial, 50);


        System.out.println(contaEspecial);
    }

    private static void realizarSaque(ContaBancaria conta, double valor){
        if(conta.sacar(50)){
            System.out.println("Saque efetuado com sucesso, novo saldo = " +conta.getSaldo());
        }else {
            System.out.println("Saldo Insuficiente para saque de " + 50 + "; Saldo de =  " + conta.getSaldo()) ;
        }

    }
}
