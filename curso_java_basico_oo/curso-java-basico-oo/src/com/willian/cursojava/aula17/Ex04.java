package com.willian.cursojava.aula17;

public class Ex04 {
    public static void main(String[] args) {
        int i = 0;
        double populacaoA = 80000;
        double populacaoB = 200000;

        int anos = 0;

        while (i <1){
            populacaoA = populacaoA + (populacaoA * 0.03);
            populacaoB = populacaoB + (populacaoB * 0.015);
            anos ++;


            if(populacaoA == populacaoB){
                i = 1;
            }

        }
        System.out.println("A população se equiparou em " +anos+ " anos");
    }
}
