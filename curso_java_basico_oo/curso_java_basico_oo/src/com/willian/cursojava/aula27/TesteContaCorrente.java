package com.willian.cursojava.aula27;

public class TesteContaCorrente {

    public static void main(String[] args) {
        ContaCorrente conta = new ContaCorrente();

        conta.numero = "123456";
        conta.agencia = "1234";
        conta.especial = true;
        conta.limiteEspecial = 500;
        conta.saldo = -10;
        conta.valorEspecialUsado = 0;

        System.out.println("Saldo da Conta " + conta.numero+ " = " + conta.saldo);

        boolean saqueEfetuado = conta.realizarSaque(10);
        if(saqueEfetuado){
            System.out.println("Saque Efetuado com sucesso");
            System.out.println("Saldo atual da conta = " + conta.saldo);
        }else{
            System.out.println("Não foi possível realizar saque. Saldo insuficiente");
        }

        conta.debositar(500);

        saqueEfetuado = conta.realizarSaque(500);
        if(saqueEfetuado){
            System.out.println("Saque Efetuado com sucesso");
            System.out.println("Saldo atual da conta = " + conta.saldo);
        }else{
            System.out.println("Não foi possível realizar saque. Saldo insuficiente");
        }
        conta.debositar(500);
        conta.consultarSaldo();

      saqueEfetuado = conta.realizarSaque(500);
        if(conta.verificarUsoChequeEspecial()){
            System.out.println("Está usando o cheque especial");
        }else {
            System.out.println("Não está usando Cheque especial.");
        }


    }
}
