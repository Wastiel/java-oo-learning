package com.willian.cursojava.aula34;

public class TestaContador {
    static void imprimirValor(){
        System.out.println(Contador.obterValor());
    }
    public static void main(String[] args) {

        imprimirValor();
        Contador.incrementar();
        Contador.incrementar();
        Contador.incrementar();

        imprimirValor();
        Contador.zerar();
        imprimirValor();

        Contador C1 = new Contador();
        Contador C2 = new Contador();
        Contador C3 = new Contador();
        Contador C4 = new Contador();
        Contador C5  = new Contador();
        imprimirValor();



    }
}
