package com.willian.cursojava.aula17;

import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x = 0;
        while (x<1){
            System.out.println("Digite seu login: ");
            String nome = scan.nextLine();
            System.out.println("Digite sua senha: ");
            String senha = scan.nextLine();

            if (nome.equals(senha)){
                System.out.println("Voc� digitou uma uma inv�lida!");
            }else {
                System.out.println("Agora as senhas est�o corretas ");
                x = 1;
            }

        }
    }
}
