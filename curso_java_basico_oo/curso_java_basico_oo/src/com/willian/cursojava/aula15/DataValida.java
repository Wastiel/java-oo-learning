package com.willian.cursojava.aula15;

import java.util.Scanner;

public class DataValida {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // 18. Programa recebe uma data dd/mm/aaaa
        System.out.println("Digite uma uma data no formato dd/mm/aaaa, que vou dizer se ela é verdadeira.");
        String dataDigitada = scan.next();

        String[] partesData = dataDigitada.split("/");
        if (partesData.length == 3) {
            int dia = Integer.parseInt(partesData[0]);
            int mes = Integer.parseInt(partesData[1]);
            int ano = Integer.parseInt(partesData[2]);

            if(mes >= 1 && mes <=12){
                if((mes == 4 || mes == 6 || mes == 9|| mes == 11)&&(dia >= 1 && dia<31)){
                    System.out.println("A data "+dataDigitada+" é valida" );
                } else if (((mes == 2)&&((ano % 4 == 0)&&(ano % 100 != 0 || ano % 400 ==0 ))&&(dia>=1&&dia<=29))||(mes == 2 && (dia>=1 && dia <=28))) {
                    System.out.println("A data "+dataDigitada+" é valida" );
                } else if (dia > 1 && dia< 31) {
                    System.out.println("A data "+dataDigitada+" é valida" );
                } else{System.out.println("Formato de data inválido. O programa será encerrado.");}
            }
            //System.out.println("Dia: " + dia);
            //System.out.println("Mês: " + mes);
            //System.out.println("Ano: " + ano);
        } else {
            System.out.println("Formato de data inválido. O programa será encerrado.");
        }
    }
}
