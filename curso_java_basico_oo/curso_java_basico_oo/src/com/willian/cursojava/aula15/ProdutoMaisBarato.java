package com.willian.cursojava.aula15;

import java.util.Scanner;

public class ProdutoMaisBarato {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // 08. Digitar 3 produtos e dizer qualé o mais barato
        System.out.println("Digite o valor dos 3 produtos que vou lhe sinalizar o mais barato:");

        double produto1 = scan.nextDouble();
        double produto2 = scan.nextDouble();
        double produto3 = scan.nextDouble();

        System.out.println((produto1<produto2 && produto1<produto3)
                ? "O produto de " +produto1+ " é mais barato de todos!!" :  (produto2<produto1 && produto2<produto3)
                ? "O produto de " +produto2+ " é o mais barato de todos!" : "O produto de " +produto3+ " é mais barato de todos!");
    }
}
