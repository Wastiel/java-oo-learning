package com.willian.cursojava.aula52.labs;

public class AgendaCheiaExeption extends Exception{

    @Override
    public String getMessage() {
        return "Agenda já está cheia";
    }
}
