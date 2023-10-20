package com.willian.cursojava.aula19;

public class Ex09 {
    public static void main(String[] args) {
        int[] a = new int[3];
        int[] b = new int[3];
        double[] c = new double[3];

        b[0] = 10;
        b[1] = 12;
        b[2] = 18;

            for (int i = 0; i < a.length; i++) {
            a[i] = i;
            //b[i] = i*2;


            c[i] = (double)a[i]/(double)(b[i]);
            System.out.println(c[i]);
        }
    }
}
