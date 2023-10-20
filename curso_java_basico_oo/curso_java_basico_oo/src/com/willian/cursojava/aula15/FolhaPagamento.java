package com.willian.cursojava.aula15;

import java.util.Scanner;

public class FolhaPagamento {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        /* 12. Programa para o calculo da fohlha de pagamento:
        imposto de renda que depende do alario bruto
        3% para o sindicato
        11% fgts do salario bruto
        Salario liquido - salario bruto - descontos
        pedir o valor hora e a quatnidade de horas trabalhadas no mês
        Mostra:
        - Desconto de IR:
        Salario até = 900 isento
        Salario até = 1500 5%
        Salario até = 2500 10%
        Salario até Acima 2500  20%
         imprimir:
         Salario bruto: (5 * 220) : R$ 1100,00
         (-) IR (5%): R$ 55,00
         (-) OMSS(10%): R$ 110,00
         FGTS (11%) : 121,00
         total de descontos: 165
         Salario liquido: 935
         */
        System.out.println("Digite o valor hora do funcionário e também as horas trabalhadas do mês:");

        double valorHora = scan.nextDouble();
        double horasTrabalhadas = scan.nextDouble();
        double ir;
        double inss = 10.00;
        double sindicatoDesconto = 3.0;
        double fgts = 11.00;
        double salarioLiquido;
        double salario = valorHora * horasTrabalhadas;


        if(salario <=900){
            ir = 0;
        } else if (salario <=1500) {
            ir = 5.00;
        } else if (salario <= 2500) {
            ir = 10.00;
        } else {
            ir = 20.00;
        }

        double descontosTotais = (salario*(ir/100)) + (salario*(inss/100)) + (salario*(sindicatoDesconto/100));
        salarioLiquido = salario - (descontosTotais);

        System.out.println("O salário Bruto: (" + valorHora+ " * "+ horasTrabalhadas +")    : R$ " +(valorHora*horasTrabalhadas));
        System.out.println("(-) IR ("+(ir==0?"Isento":ir+"%")+")    : R$ " +(salario*(ir/100)));
        System.out.println("(-) INSS ("+(inss)+"%)  : R$ " +(salario*(inss/100)));
        System.out.println("FGTS ("+(fgts)+"%)  : R$ " +(salario*(fgts/100)));
        System.out.println("Total de descontos  : R$ " +descontosTotais);
        System.out.println("Salario Liquid  : R$ " +salarioLiquido);

    }
}
