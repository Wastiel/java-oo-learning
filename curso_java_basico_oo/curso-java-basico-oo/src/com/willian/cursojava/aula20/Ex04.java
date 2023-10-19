package com.willian.cursojava.aula20;

import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("Agenda para Registros dos compromissos");


        String[][][] compromissos = new String[30][24][1];

        int acao = 0;
        int dia = 0;
        int hora = 0;
        while(acao!=3){

            System.out.println("Ações: ");
            System.out.println("1 - Adicionar Compromisso");
            System.out.println("2 - Mostrar agenda");
            System.out.println("3 - Sair do programa");
            acao = scan.nextInt();

            if (acao == 1){
                System.out.println("Digite o dia:");
                dia = scan.nextInt();
                System.out.println("Digite a hora:");
                hora = scan.nextInt();

                if((dia >1 || dia <31)&& (hora>0 && hora<=24)){
                    System.out.println("Digite o seu compromisso");
                    compromissos[dia][hora][0] = scan.next();

                    System.out.println("Compromissos do dia " +dia);
                    System.out.println("Hora:  " +hora);
                    System.out.println("Compromisso: "+compromissos[dia][hora][0]);

                }else {
                    System.out.println("dia ou hora digitado inválido");
                }

            }
            if (acao == 2){
                for (int i = 0; i < compromissos.length; i++) {

                    for (int j = 0; j < compromissos[i].length; j++) {

                        for (int k = 0; k < compromissos[i][j].length; k++) {
                            if (compromissos[i][j][k] != null) {
                                System.out.println("Dia " +(i+1));
                                System.out.println("Hora: " +(j+1));
                                System.out.println("Compromisso " + compromissos[i][j][k]);
                            }


                        }
                    }
                }
            }




        }

       /* for (int i = 0; i < nomesFilhos.length; i++) {
            System.out.println("Entre com a quantidade de filhos");
            int qtdFilhos = scan.nextInt();
            nomesFilhos[i] = new String[qtdFilhos];
            for (int j = 0; j < nomesFilhos[i].length; j++) {
                System.out.println("Digite o nome do filho " +(j+1));
                nomesFilhos[i][j] = scan.next();

            }
        }
        for (int i = 0; i < nomesFilhos.length; i++) {
            System.out.println("Pessoa " +i+ " tem " +nomesFilhos[i].length+ " Filhos");
            for (int j = 0; j < nomesFilhos[i].length ; j++) {
                System.out.println(nomesFilhos[i][j]);
            }
        }*/
    }
}
