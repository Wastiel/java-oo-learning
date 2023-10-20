package com.willian.cursojava.aula15;

import java.util.Scanner;

public class Operacao {
    public static void main(String[] args) {
        // 24.
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite dois numeros e na sequencia, qual operação deseja realizar:");
        System.out.println("Soma - 1");
        System.out.println("Subtração - 2");
        System.out.println("Multiplicação - 3");
        System.out.println("Divisao - 4");

        double numero1 = scan.nextDouble();
        double numero2 = scan.nextDouble();
        double resultado = 0;
        int operacao = scan.nextInt();


        if(operacao == 1){
            resultado = numero1 + numero2;

        }
        if(operacao == 2){
            resultado = numero1 - numero2;

        }
        if(operacao == 3){
            resultado = numero1 * numero2;

        }
        if(operacao == 4){
            resultado = numero1 / numero2;
        }
        if(operacao>4 && operacao<1)
        {
            System.out.println("Operação Inválida");
        }else{
            System.out.println((resultado % 2 ==  0)? "O número "+resultado+" é par" : "O número "+resultado+" é impra");
            System.out.println((resultado > 0)? "O número "+resultado+" é Positivo" : (resultado < 0) ? "O número "+resultado+" é impra" : "O número "+resultado+" é zero");
            System.out.println((resultado == Math.floor(resultado))? "O número "+resultado+" é Inteiro" : "O número "+resultado+" é Fracionado");

        }

    }
}
