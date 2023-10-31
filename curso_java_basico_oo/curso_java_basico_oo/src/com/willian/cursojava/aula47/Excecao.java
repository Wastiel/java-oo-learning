package com.willian.cursojava.aula47;

public class Excecao {
    public static void main(String[] args) {
        try{
            int[] vetor = new int[4];
            System.out.println("Antes da Exception");
            vetor[4] = 1;

            System.out.println("Este texto nao sera impresso");

        }catch(ArrayIndexOutOfBoundsException exception){
            System.out.println("Exceção ao acessar um indice do vetor que não existe");
        }
        System.out.println("Este texto sera impresso apos a exception");
    }
}
