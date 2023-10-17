package com.willian.cursojava.aula15;

import java.util.Scanner;

public class Turno {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // 10. Digitar o turno e dizer bom dia boa tarde ou boa noite, conforme turno e caso digite besteira, vai levar xingao
        System.out.println("Digite o turono que você estuda, que direi uma mensagem especial para você: " +
                "\n V-Vespertino" +
                "\n M-Matutino" +
                "\n N-Noturno");

        char turno = scan.nextLine().toUpperCase().charAt(0);

        switch (turno){
            case'N':
                System.out.println("Boa Noite! ");
                break;
            case'M':
                System.out.println("Bom Dia! ");
                break;
            case'V':
                System.out.println("Boa Tarde! ");
                break;
            default:
                System.out.println("Digita Certo Rapa!!! ");
                break;
        }
    }
}
