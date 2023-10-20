package com.willian.cursojava.aula13;

public class OperadoresLogicos {
    public static void main(String[] args) {

    int valor1 = 1;
    int valor2 = 1;

    boolean resultado1 = (valor1 ==1 ) && (valor2 == 2);
    System.out.println("Valor1 é 1 and valor2 é 2 - Resultado:  " + resultado1);

    boolean resultado2 = (valor1 ==1 ) || (valor2 == 2);
    System.out.println("Valor1 é 1 and valor2 é 2 - Resultado:  " + resultado1);

    Boolean verdadeiro = true;
    boolean falso = false;

        System.out.println(verdadeiro && falso);
        System.out.println(verdadeiro || falso);
        System.out.println(verdadeiro ^ falso);
        System.out.println(!verdadeiro && falso);
    }
}
