package com.willian.cursojava.aula34;

public class TestaContadorWillian {
    public static void main(String[] args) {
        ContadorWillian contadorWillian = new ContadorWillian();
        System.out.println(contadorWillian.mostrarValor());

        contadorWillian.decrementar();
        contadorWillian.decrementar();
        System.out.println(contadorWillian.mostrarValor());

        contadorWillian.incrementar();
        System.out.println(contadorWillian.mostrarValor());
        contadorWillian.zerar();
        System.out.println(contadorWillian.mostrarValor());
    }
}
