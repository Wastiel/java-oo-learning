package com.willian.cursojava.aula17;

import java.util.Scanner;

public class Ex20 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
       int numero;

        int count=0;
        int resultado =0;
        boolean fezFatorial = true;
        while(count<2){

            System.out.println("Digite o 1 para validar o fatorial ou 2 para encerrar número que vou fazer o fatorial:");
            int continua = scan.nextInt();

            if(continua ==1 ){
                System.out.println("Digite um número de fatorial");
                numero = scan.nextInt();
                resultado = numero;
                for (int i = numero-1; i > 0 ; i--) {
                    if(numero>16){
                        i = 0;
                    }else {
                        resultado *=i;
                        fezFatorial = true;
                    }

                }
            } else if (continua == 2) {
            count = 2;
            }else {
                System.out.println("Oção inválida");
            }
            if(fezFatorial){
                System.out.println("O fatorial do número é " +resultado) ;
                fezFatorial = false;
            }

        }




    }
}
