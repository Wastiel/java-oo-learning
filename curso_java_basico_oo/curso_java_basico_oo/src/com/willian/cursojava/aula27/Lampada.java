package com.willian.cursojava.aula27;

public class Lampada {

    String modelo;
    String tensao;
    int potencia;
    String cor;
    String tipoLuz;
    String[] tipos;
    boolean tipoAbajur;

    boolean ligada = false;

    void ligar(){
     ligada = true;
    }

    void desligar(){
        ligada = false;
    }
    void mostrarEstado(){
        if(ligada){
            System.out.println("Ligada");
        }else{
            System.out.println("Desligada");
        }
    }
    void mudarEstado(){
        if(ligada){
            desligar();
        }else{
            ligar();
        }

    }


}
