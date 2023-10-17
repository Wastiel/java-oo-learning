package com.willian.cursojava.aula10;

public class Variaveis {
    public static void main(String[] args) {

        //variavies com convenção de java
        int idade = 20;
        String nome = "Willian";
        String nomeDoMeuCachorro = "Toto";
        String ano2014 = "2014";

        /* Variaveis que podem se declarar, mas nao é convenção java
        int _idade;
        int $idade;
        String ano2014;
        String nome_do_meu_cachorro;
        String NomeDoMeuCachorro;
        String NomeDoMeucachorro;*/

        idade = 25;
        System.out.println("Idade = " + idade);
        System.out.println("Nome = " + nome);

        //Sempre escrever as variaveis que signifiquem alguma coisa, nao como exemplo abaixo.
        int a = 10;
        String b = "Loriane";

        char o = 111;
        char i = 105;

        System.out.println("Soma? " + o + i);
        System.out.println(o + i);

        //No unicode
        char interrogacao = 0x00E1;

        System.out.println("" + o + i + interrogacao);
    }
}
