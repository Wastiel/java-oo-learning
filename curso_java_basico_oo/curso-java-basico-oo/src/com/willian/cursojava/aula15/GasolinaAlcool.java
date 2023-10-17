package com.willian.cursojava.aula15;

import java.util.Scanner;

public class GasolinaAlcool {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o tipo de combustivel: " +
                "\n G-Gasolina" +
                "\n A-Alcool");
        char tipoCombustivel = scan.nextLine().toUpperCase().charAt(0);
        System.out.println("Digite a quantidade de Gasolina");
        int litros = scan.nextInt();

        System.out.println("" + tipoCombustivel + litros);

        double total = 0.0;

        double alcool = 1.9;
        double gasolina = 2.5;


        if(tipoCombustivel == 'A' && tipoCombustivel>0){
            if(litros<=20){
                total = alcool * litros *(1-0.03);
            } else if (litros>20) {
                total = alcool * litros *(1-0.05);
            }
            System.out.println("O valor de Alcool a pagar e de R$: " + total);
        } else if (tipoCombustivel == 'G' && tipoCombustivel>0) {
            if(litros<=20){
                total = gasolina * litros *(1-0.04);
            } else if (litros>20) {
                total = gasolina * litros *(1-0.06);
            }
            System.out.println("O valor de Gasolina a pagar e de R$: " + total);
        }else{
            System.out.println("Tipo Combustivel Inválido");
        }

    }
}
