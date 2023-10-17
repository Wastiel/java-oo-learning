package com.willian.cursojava.aula15;

import java.util.Scanner;

public class Crime {
    public static void main(String[] args) {

        /* 25. Crime, pergunte para uma pessoa algumas perguntas e veja o que ela responde.
    Telefonou para a vitima?
    mora perto da vitima?
    Devia para a vitima?
    Ja trabalhou para a vitima?
     */
        Scanner scan = new Scanner(System.in);
        int suspeito = 0;
        System.out.println("Vamos fazer algumas pergutnas, responda com sinceridade, pois isto pode ter impacto na investiga��o sobre o assasinto do fulano de tals:");
        System.out.println("Telefonou par a v�tima? Responda Sim ou N�o:");
        String pergunta = scan.nextLine();
        suspeito = ehSuspeito(pergunta);
        System.out.println("Mora perto da v�tima? Responda Sim ou N�o:");
        pergunta = scan.nextLine();
        suspeito = suspeito + ehSuspeito(pergunta);
        System.out.println("Esteve no local do Crime? Responda Sim ou N�o:");
        pergunta = scan.nextLine();
        suspeito = suspeito + ehSuspeito(pergunta);
        System.out.println("Devia para a v�tima? Responda Sim ou N�o:");
        pergunta = scan.nextLine();
        suspeito = suspeito + ehSuspeito(pergunta);
        System.out.println("ja trabalhou para v�tima? Responda Sim ou N�o:");
        pergunta = scan.nextLine();
        suspeito = suspeito + ehSuspeito(pergunta);

        //System.out.println(suspeito);
        //System.out.println(pergunta);

        if(suspeito >500){
            System.out.println("Alguma das resposas digitadas n�o � valida. Repsonde direito se n�o tu vai ser preso. ");
        } else if (suspeito ==2 ) {
            System.out.println("Voc� � Suspeita");
        } else if (suspeito >= 3 && suspeito <=4) {
            System.out.println("Voc� � Cumplice!. ");
        }else if (suspeito == 5){
            System.out.println("Voc� � o Assasino!");
        }else {
            System.out.println("Voc� � inocente");
        }

    }

    public static int ehSuspeito(String resposta) {
        // Utilizamos uma margem de precis�o de 0.00001

        if(resposta.toUpperCase().equals("SIM")){
            return 1;
        } else if (resposta.toUpperCase().equals("NAO")) {
            return 0;
        }
        // Verificamos se o n�mero � divis�vel por 2 dentro da margem de precis�o
        return 500;
    }

}
