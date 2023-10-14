package com.willian.cursojava.aula13;

import java.util.Scanner;

public class Exercicios {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        // 1. Faça um programa que mostre a mensagem "Alo mundo" na tela;
        System.out.println("Alo mundo!");
        //2. Faça umprograma que peça um número e então mostre a mensagem. o numero informado foi;
        System.out.println("Digite um número: ");
        int numero = scan.nextInt();
        System.out.println("O número informado foi: " + numero);

        //3. Peça dois numeros e imprima a soma
        System.out.println("Digite um número: ");
        int numero1 = scan.nextInt();
        System.out.println("O número informado foi: " + numero);
        System.out.println("Digite outro número: ");
        int numero2 = scan.nextInt();
        System.out.println("A soma dos números é: " + (numero + numero2));

        //4. Peça dois 4 notas bimetrais e imprima a media
        System.out.println("Digite as 4 notas  do aluno: ");
        int nota1 = scan.nextInt();
        int nota2 = scan.nextInt();
        int nota3 = scan.nextInt();
        int nota4 = scan.nextInt();
        double mediaNotas = (nota1+nota2+nota3+nota4)/4;
        System.out.println("a média do aluno é: " + mediaNotas);

        //5. faça um programa que converta metros em centimetros
        System.out.println("Digite em metro, que vou converter em centimetro: " );
        int metros = scan.nextInt();
        System.out.println("A conversão de " +metros+ " metros em centimetro é: " + metros*100);

        //6 PRograma para calcular o raio de um circulo
        System.out.println("Digite o raio que vou calcular a area: " );
        double raio = scan.nextDouble();
        double area = Math.PI * Math.pow(raio, 2);
        System.out.println("A area é : " + area);

        //7 Programa que calcule a area de um quadrado e depois mostre o dobro da area
        System.out.println("Digite um dos lados do quadrado: ");
        int lado = scan.nextInt();
        int areaQuadrado = lado * lado;
        System.out.println("A area do quadrado é: " +(areaQuadrado)*2);

        //8 programa que pergunta quanto voce ganha por hora e numero de horas trabalhado. Mostre tudo calculado
        System.out.println("Digite quanto você ganhar por hora e na sequencia as horas trabalhadas no mes: ");
        double valorHora = scan.nextDouble();
        int horas = scan.nextInt();
        System.out.println("Seu salario do mês foi: " + valorHora * horas);

        //9. Digite um programa que recebe graus em Farenheit e converta em Celcius
        System.out.println("Digite a temperatura em Farenheit: ");
        int farenheit = scan.nextInt();
        double grausC = (5*(farenheit-32)/9);
        System.out.println("a temperatura em Celcius é: " + grausC);

        //10 Programa que peça em Celcius e retorne farenhart
        System.out.println("Digite a temperatura em Celcius: ");
        int celcius = scan.nextInt();
        double grausF = ((5*1.8)+32);
        System.out.println("a temperatura em Celcius é: " + grausF);

        //11 Faça um programa que peça 2 números inteiros e um número real.
        // Produto do dobro do primeiro com metade do segundo
        // a soma do triplo do primeiro com o terceiro
        // o terceiro elevado ao cubo



        System.out.println("Digite dois numeros inteiros e um real (Float) em sequencia: ");
        int numeroS1 = scan.nextInt();
        int numeroS2 = scan.nextInt();
        double numeroReal = scan.nextDouble();

        //System.out.println("tericeiro ao cubo: " + numeroReal);
        System.out.println("Produto do dobro do primeiro com metade do segundo: " + ((numeroS1*2) + (numeroS2/2)));
        System.out.println("Soma do tripulo do primeiro com o tericeiro: " + ((numeroS1 * 3) + (numeroReal/2)) );
        double numeroRealCubo = Math.pow(numeroReal, 3.0);
        System.out.println("tericeiro ao cubo: " + numeroRealCubo);

        //12 peça a altura da pessoa para calcular o peso ideal
        System.out.println("Digite sua altura: ");
        double alturaIdeal = scan.nextDouble();
        System.out.println("Sua altura ideal é: " + ((72.7 * alturaIdeal)-58));

        //13 Tendo como entrada, peso, altura e sexo de uma pessoa, calcule
        System.out.println("Digite sua altura, seu peso e sexo no formato 'F' e 'M': ");
        int alturaS14 = scan.nextInt();
        int peso14 = scan.nextInt();
        String sexo = scan.next();
        double pesoIdeal;

        if(sexo == "M"){
            pesoIdeal = (72.7*alturaS14) - 58;
            if(pesoIdeal>18 && pesoIdeal<25){
                System.out.println("Você está dentro do peso ideal que é : " + pesoIdeal);
            }
        }else{if(sexo == "F"){
            pesoIdeal = (62.1*alturaS14) - 44.7;
            if(pesoIdeal>18 && pesoIdeal<25){
                System.out.println("Você está dentro do peso ideal que é : " + pesoIdeal);
            }
            }
        }

        //14 Validar se o peixe tem mais de 50 kg e se sim, gravar valor de multa 4 reais.
        System.out.println("Digite sua altura, seu peso e sexo no formato 'F' e 'M': ");
        double pesoPeixe = scan.nextDouble();
        double valormulta = (pesoPeixe - 50) * 4;
        if(pesoPeixe > 50){
            System.out.println("O peso do peixe é de "+pesoPeixe+" e o valor da multa é de: " + valormulta);
        }else{
            valormulta = 0;
            System.out.println("O peso do peixe é de "+pesoPeixe+" e o valor da multa é de: " + valormulta);
        }

        /* 15 pegar o valor hora e a quatnidade de horas trabalhadas e calcluar as porcentagens descontadas
        11% ir
        8% inss
        5% sindicato
       */

        System.out.println("Digite quanto você ganhar por hora e na sequencia as horas trabalhadas no mes: ");
        double valorHora15 = scan.nextDouble();
        int horas15 = scan.nextInt();
        double salario = valorHora15 * horas15;
        double inss = salario *0.08;
        double ipostoRenda = salario *0.11;
        double sindicato = salario * 0.05;;

        System.out.println("Seu salariobruto do mês foi: " + salario);
        System.out.println("Seu INSS foi do mês foi: " + inss);
        System.out.println("Seu ir foi do mês foi: " + ipostoRenda);
        System.out.println("Seu Sindicato foi do mês foi: " + sindicato);
        System.out.println("Seu salario liquido do mês foi: " + (salario - inss - ipostoRenda - sindicato));

        /*16 Pedir o tamanho em metros quadrados para pintar uma area.
        * 1 litro para cada 3 metros
        * 18 litros de tinta por lata que custam 80 reais
        * Retornar lattas a seem compradas e o valor total
        *
        System.out.println("Digite a quantidade de metros quadrados do local: ");
        double metrosQuadrados = scan.nextDouble();
        double litros = metrosQuadrados/3;
        double quantidadeLatas = litros/18;
        double valorTotal = quantidadeLatas * 80.00;

        System.out.println("Você precisa comprar "+ quantidadeLatas+ " para preencher o local. O total da compra sai por: " + valorTotal);*/


        System.out.println("Digite a quantidade de metros quadrados do local: ");
        double metrosQuadrados = scan.nextDouble();
        double litros = metrosQuadrados/6;
        double quantidadeLatas = litros/18;
        double valorTotal = quantidadeLatas * 80.00;

        System.out.println("Você precisa comprar "+ quantidadeLatas+ " para preencher o local. O total da compra sai por: " + valorTotal);

        //18 programa que peça o tamnho de um arquivo para download emmb e a velodiade de um linke de internet em mbps. Calcular o tempo paproximado para dawloand em minutos
        System.out.print("Digite o tamanho do arquivo para download (em MB): ");
        double tamanhoArquivoMB = scan.nextDouble();

        System.out.print("Digite a velocidade do link de internet (em Mbps): ");
        double velocidadeInternetMbps = scan.nextDouble();

        double tempoDownload = tamanhoArquivoMB / velocidadeInternetMbps;

        System.out.println("O tempo aproximado para download é: " + tempoDownload + " minutos");
    }
}
