package com.willian.cursojava.aula15;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Scanner;

public class InteiroDecimal {
    public static void main(String[] args) {
        // 23. numero e informe se é inteiro ou decimal.
        Scanner scan = new Scanner(System.in);
        System.out.println("Entre com um numero inteiro");

        double valor = scan.nextDouble();

        if(valor == Math.floor(valor)){
            System.out.println("inteiro");
        }else{
            System.out.println("decimal");
        }
    }
}
