package com.willian.cursojava.aula13;

public class curtoCircuito {
    public static void main(String[] args) {
        Boolean verdadeiro = true;
        boolean falso = false;
        boolean resultado1 = falso & verdadeiro; // ele vai ver a sentença inteira
        boolean resultado2 = falso && verdadeiro; // ele vai ver o primeiro verdadeiro e vai entender queé falso e nao continua comparando

        System.out.println(verdadeiro && falso);
        System.out.println(verdadeiro || falso);
        System.out.println(verdadeiro ^ falso);
        System.out.println(!verdadeiro && falso);

        int resultado = 1 + 1 + 1 * 1 + 1 / 1; // primeiro a multiplicacao e divisao e depois os demais
    }
}
