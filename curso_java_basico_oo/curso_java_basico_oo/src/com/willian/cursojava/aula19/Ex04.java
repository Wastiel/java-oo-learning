package com.willian.cursojava.aula19;

public class Ex04 {
    public static void main(String[] args) {
        double[] a = new double[15];
        double[] b = new double[15];

        for (int i = 0; i < a.length; i++) {
            a[i] = i*i;
            b[i] = (int) Math.sqrt(a[i]);
        }
        //b = a;
        for (double temp: b) {
            System.out.println(temp);
        }
    }
}
