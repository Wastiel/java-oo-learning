package com.willian.cursojava.aula19;

public class Ex14 {
    public static void main(String[] args) {
        int[] a = new int[10];
        int[] b = new int[10];
        int contador = 0;
        double media = 0;
        for (int i = 0; i < a.length; i++) {
            a[i] = i;
            System.out.println(a[i]);
            if((a[i] % 3 == 0) || (a[i] == 1)){
                System.out.println(a[i]);
                contador ++;
                media +=a[i];

            }
        }
        System.out.println("todos: " +media);
        System.out.println("contador: " +contador);
        System.out.println("Soma dos multiplos de 5: " +(media/contador));
    }
}
