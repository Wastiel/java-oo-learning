package com.willian.cursojava.aula35;

public class Somat�rio {


    public static int somatorio(int num){


        if (num == 1){
            return 1;
        }
        System.out.println(num);


        return num + somatorio( num -1 );
    }
}
