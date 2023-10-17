package com.willian.cursojava.aula17;

public class LoopFor {
    public static void main(String[] args) {
        for (int i = 0; i<5; i++){
            System.out.println("i tem valor: " +i);
        }

        for (int i = 5; i>0; i--){
            System.out.println("i tem valor: " +i);
        }

        for (int i = 0,j = 10; i<j; i++,j--){
            System.out.println("i tem valor: " +i+ " j tem valor: " +j );
        }

        int i = 0;
        for(;i <5;){
            System.out.println("i tem valor: " +i );
            i++;
        }

        int soma = 0;
        for (i = 1; i<5; soma += i++);
        System.out.println("O valor da soma é: " +soma );

    }
}
