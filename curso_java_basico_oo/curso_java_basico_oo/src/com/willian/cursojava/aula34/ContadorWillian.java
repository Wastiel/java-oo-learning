package com.willian.cursojava.aula34;

public class ContadorWillian {
    static int contador = 0;

    public ContadorWillian() {
        contador ++;
    }

    public void incrementar(){
        contador ++;
    }
    public void zerar(){
        contador =0;

    }
    public void decrementar(){
        contador --;
    }
    public int  mostrarValor(){
        return contador;
    }
}
