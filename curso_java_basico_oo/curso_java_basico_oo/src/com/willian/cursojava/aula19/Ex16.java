package com.willian.cursojava.aula19;

public class Ex16 {
    public static void main(String[] args) {
        int[] a = new int[10];
        int inferior = 0;
        int quantidade = 0;
        double media = 0;
        int cont = 0;
        for (int i = 0; i < a.length; i++) {
            a[i] = i + 7;
            System.out.println(a[i]);
            if ((a[i] < 15)) {
                inferior += a[i];

            } else if (a[i] == 15) {
                quantidade++;

            } else if (a[i] > 15) {
                cont++;
                media += a[i];

            }

        }
        System.out.println("menor que 15 " + inferior);
        System.out.println("quantidade " + quantidade);
        System.out.println("media 5: " + ((double) media / cont));
    }
}

