package com.willian.cursojava.aula33;


public class TestaContaCorrente {
    public static void main(String[] args) {
        ContaCorrente conta = new ContaCorrente();
        conta.setNumero("123456");
        conta.setAgencia("1234");
        conta.setEspecial(true);
        conta.setSaldo(500);
        conta.setLimiteEspecial(-10);

        System.out.println("");

        System.out.println("Saldo da Conta " + conta.getNumero()+ " = " + conta.getSaldo());

        boolean saqueEfetuado = conta.realizarSaque(10);
        if(saqueEfetuado){
            System.out.println("Saque Efetuado com sucesso");
            System.out.println("Saldo atual da conta = " + conta.getSaldo());
        }else{
            System.out.println("Não foi possível realizar saque. Saldo insuficiente");
        }

        conta.debositar(500);

        saqueEfetuado = conta.realizarSaque(500);
        if(saqueEfetuado){
            System.out.println("Saque Efetuado com sucesso");
            System.out.println("Saldo atual da conta = " + conta.getSaldo());
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
