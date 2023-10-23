package com.willian.cursojava.aula36;

public class Teste {
    public static void main(String[] args) {
        Contato contato = new Contato();
        contato.setNome("Willian");

        //Relacionamento tem-um ednereco
        Endereco end = new Endereco();
        end.setNomeRua("Game of Thrones");
        end.setNumero("n/a");
        end.setComplemento("-");
        end.setCidade("Kings Landing");
        end.setEstado("Westeros");
        end.setCep("9999999");

        //Relacionamento tem-um felefone

        Telefone telefone = new Telefone();
        telefone.setTipo("Celular");
        telefone.setDdd("91");
        telefone.setNumero("99-999999");

        Telefone telefone2 = new Telefone();
        telefone2.setTipo("Casa");
        telefone2.setDdd("91");
        telefone2.setNumero("8888888");

        contato.setEndereco(end);

        Telefone[] telefones = new Telefone[2];
        telefones[0] = telefone;
        telefones[1] = telefone2;

        contato.setTelefones(telefones);

        System.out.println(contato.getNome());

        if(contato.getEndereco() !=null && contato.getEndereco() !=null){
            System.out.println(contato.getEndereco().getCidade());
        }
        /*if(contato.getTelefone() !=null && contato.getTelefone() !=null){
            System.out.println(contato.getTelefone().getDdd());
            System.out.println(contato.getTelefone().getNumero());
        }*/

        if(contato != null && contato.getTelefones() !=null){
            for(Telefone t : contato.getTelefones()){
                System.out.println(t.getDdd() + " " + t.getNumero());
            }
        }

    }
}
