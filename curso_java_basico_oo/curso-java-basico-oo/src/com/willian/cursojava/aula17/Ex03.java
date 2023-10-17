package com.willian.cursojava.aula17;

import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x = 0;
        while (x<1){
            System.out.println("Digite seu nome: ");
            String nome = scan.nextLine();
            System.out.println("Digite sua idade ");
            int idade = scan.nextInt();
            System.out.println("Digite seu salario: ");
            double salario = scan.nextDouble();
            System.out.println("-------");
            System.out.println("Digite seu estado civil: c s e seu sexo ");
            String variavel_intermediaria_funcinar = scan.nextLine();
            String estadoCivil = scan.nextLine();

            System.out.println("seu sexo ");
            String sexo = scan.nextLine();


            if ((nome.length()>3) && (idade <150 && idade >0) && (salario>=0)  && (estadoCivil.equals("c")||estadoCivil.equals("s"))&&(estadoCivil.equals("m")||estadoCivil.equals("f"))){
                System.out.println("Você digitou uma tudo certo, o programa vai ser encerrado. ");
                x = 1;
            }else {
                System.out.println("algum dado está correto.  ");

            }

        }
    }
}
