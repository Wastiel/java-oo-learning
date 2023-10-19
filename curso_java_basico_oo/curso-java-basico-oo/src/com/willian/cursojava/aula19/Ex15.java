package com.willian.cursojava.aula19;

public class Ex15 {
    public static void main(String[] args) {
        int[] a = new int[10];

        int par = 0;
        int impar = 0;
        for (int i = 0; i < a.length; i++) {
            a[i] = i;
            //System.out.println(a[i]);
            if ((a[i] % 2 != 0) || (a[i] == 1)) {
                System.out.println(a[i]);
                impar++;
            } else if (a[i]%2==0) {
                System.out.println(a[i]);
                par++;

            }
        }

        System.out.println("par: " +((double)par/a.length)*100);
        System.out.println("impar: " + ((double)impar/a.length)*100);

    }
}




