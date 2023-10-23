package com.willian.cursojava.aula34;

public class TestaCalculadoraEx02 {
    public static void main(String[] args) {

        imprimirTela(Calculadora.soma(1,2));
        imprimirTela(Calculadora.subtratir(1,2));
        imprimirTela(Calculadora.dividir(1,2));
        imprimirTela(Calculadora.multiplicar(1,2));
        imprimirTela((int)Calculadora.potencia(1,2));

    }
    static void imprimirTela(int num){
        System.out.println(num);
    }
}
