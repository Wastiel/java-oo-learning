package com.willian.cursojava.aula43.Ex03;

public class Teste {
    public static void main(String[] args) {

        Animal camelo = new Animal();
        camelo.setNome("Camelo");
        camelo.setComprimento(150);
        camelo.setPatas(4);
        camelo.setCor("Amarelo");
        camelo.setVelocidade(2);

        Peixe tubarao = new Peixe();
        tubarao.setComprimento(300);
        tubarao.setVelocidade(1);

        Mamifero urso = new Mamifero();
        urso.setNome("Urso");
        urso.setComprimento(180);
        urso.setPatas(4);
        urso.setCor("Vermelho");
        urso.setVelocidade(1);
        urso.setAlimento("Mel");

        Animal[] animais = new Animal[3];
        animais[0] = camelo;
        animais[1] = tubarao;
        animais[2] = urso;

        System.out.println("-------------------------------");
        for (Animal animal: animais){
            System.out.println(animal.toString());
            System.out.println("----------------");
        }

    }
}
