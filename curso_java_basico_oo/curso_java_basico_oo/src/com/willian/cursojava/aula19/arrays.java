package com.willian.cursojava.aula19;

public class arrays {
    public static void main(String[] args) {

        double [] temperaturas = new double[365];
        temperaturas[0] = 31.3;
        temperaturas[1] = 32;
        temperaturas[2] = 33.7;
        temperaturas[3] = 334;
        temperaturas[4] = 33.1;

        System.out.println("O vallor da temperatura do dia 1 é: " + temperaturas[0]);
        System.out.println("O vallor da temperatura do dia 1 é: " + temperaturas[1]);
        System.out.println("O vallor da temperatura do dia 1 é: " + temperaturas[2]);
        System.out.println("O vallor da temperatura do dia 1 é: " + temperaturas[3]);

        //Saber quantas posições o array tem:

        System.out.println("O tamanho do array: " + temperaturas.length);

        System.out.println("valores do array + " +temperaturas); // vai mostrar o endereço de memória

        for (int i = 0; i < temperaturas.length; i++) {
            System.out.println("O vallor da temperatura do dia 1 é: " + temperaturas[2]);
        }

        for (double temp : temperaturas){
            System.out.println(temp);
        }
    }
}
