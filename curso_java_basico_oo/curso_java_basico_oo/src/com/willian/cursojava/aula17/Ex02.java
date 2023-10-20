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
                System.out.println("Você digitou uma uma inválida!");
            }else {
                System.out.println("Agora as senhas estão corretas ");
                x = 1;
            }

        }
    }
}
