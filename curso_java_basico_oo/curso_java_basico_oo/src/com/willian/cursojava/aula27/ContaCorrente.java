package com.willian.cursojava.aula27;

public class ContaCorrente {

    String numero;
    String agencia;
    boolean especial;
    double valorEspecialUsado;
    double limiteEspecial;
    double saldo;


    boolean realizarSaque(double quantiaASacar){
        //tem saldo na conta
        if(saldo >= quantiaASacar){
            saldo -=quantiaASacar;
            return true;
        } else{
            if (especial){
                //verificar limite especial
                double limite = limiteEspecial + saldo;
                if (limite >= quantiaASacar){
                    saldo -=quantiaASacar;
                    return true;
                }
                return false;
            }else {
                return false;
            }
        }
    }

    void debositar(double valorDepositado){
        saldo +=valorDepositado;
    }

    void consultarSaldo(){
        System.out.println("Saldo atual  da conta = " +saldo);
    }

    boolean verificarUsoChequeEspecial(){
        return saldo<0;
    }
}
