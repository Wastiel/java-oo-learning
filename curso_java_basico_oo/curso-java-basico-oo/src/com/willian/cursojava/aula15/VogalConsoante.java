package com.willian.cursojava.aula15;

import javax.lang.model.element.NestingKind;
import java.util.Scanner;

public class VogalConsoante {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // 04. Validar se é vogal ou cosoante
        System.out.println("Digite uma letra e te direi se é vogal ou consoante");

        char vogal = scan.nextLine().toUpperCase().charAt(0);

        switch (vogal){
            case'A':
            case'E':
            case'I':
            case'O':
            case'U':
                System.out.println("É uma vogal " + vogal);
                break;
            default:
                System.out.println("É consoante! " + vogal);
        }
    }
}
