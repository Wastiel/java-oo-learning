# Aula 05. Vetores e Matrizes

## Vetores (Arrays)
- introdução
	- Vetores, arrays

- vetores/arrays
	- Extrutura mais siples que existe, funcionamento parecido entre linguagens
	- lista ordenada de dados
	- Pq utilizar
		- Temperaturas médias durante um ano. 
		````java
		double tempDia001 = 31.3;
        double tempDia002 = 32;
        double tempDia003 = 33.7;
        double tempDia004 = 34;
        double tempDia005 = 32;
		````
		- Solução declarar 360 variaveis por ano?
		- Não, vamos realizar algo tipo uma planilha de excel.
		- Reservado na memoria o endereço de memória
		- Padrão array, primeiro indice, posição [0];
- Organizando as informações do array no java
- double [] temperaturas = new double[numeros de posições];
	- double [] temperaturas = new double[365];
	- boa pratica java double [] temperaturas ao invés de double temperaturas []
- Abaixo um fonte com so diversos detalhes do array:
````java
double [] temperaturas = new double[365];
        temperaturas[0] = 31.3;
        temperaturas[1] = 32;
        temperaturas[2] = 33.7;
        temperaturas[3] = 334;
        temperaturas[4] = 33.1;

        System.out.println("O vallor da temperatura do dia 1 é: " + temperaturas[0]);
        System.out.println("O vallor da temperatura do dia 1 é: " + temperaturas[1]);
        System.out.println("O vallor da temperatura do dia 1 é: " + temperaturas[2]);
        System.out.println("O vallor da temperatura do dia 1 é: " + temperaturas[3]);

        //Saber quantas posições o array tem:

        System.out.println("O tamanho do array: " + temperaturas.length);

        System.out.println("valores do array + " +temperaturas); // vai mostrar o endereço de memória

        for (int i = 0; i < temperaturas.length; i++) {
            System.out.println("O vallor da temperatura do dia 1 é: " + temperaturas[2]);
        }

        // quando criamos um array, valor inicial zero

````
- Valor inicial de um double.
- For melhorado:
	- for (double temp : temperaturas){

	}
	- for melhorado não conseguimos pegar o valor.


## Correção Exercícios Aula 19 (Vetores/Arrays)
- [Lista de exercicios](https://youtu.be/UN6ZJBSTR0M)
- [Lista de exercicios](https://youtu.be/o4S35dlr4_E)
- [Lista de exercicios](https://youtu.be/eAuxsgm3pl4)
- [Lista de exercicios](https://youtu.be/NZw0BbGxCmM)
- [Lista de exercicios](https://youtu.be/64Bj0RMWkiU)


## Matrizes (Arrays multi-dimensionais)
- [Link da aula](https://youtu.be/UN6ZJBSTR0M)
- Introdução
	- Matrizes
	- Arrays
- Parte 1
	- Introudção e prática
	- Manipulação
	- Matrizes 3 dimensões
	- Matrizes Irregulares
- Matriz
	- Vatores/array, lista ordenada de n elementos
	- Matriz, vamos trabalhar com uma tabela.
	- Matriz, é um array de array.
- Problema notas do aluno
	- Tipo uma tabela
	[][][][]
	[][][][]
	- Uma matriz é um sequencia de linhas de vetores
	- nome sempre na boa pratica plural, notasAlunos, exemplo
	````java

        double [][] notasAlunos = new double[30][4];
        
        notasAlunos[0][0] = 10;
        notasAlunos[0][1] = 7;
        notasAlunos[0][1] = 9;
        notasAlunos[0][1] = 9.5;

        notasAlunos[1][0] = 9;
        notasAlunos[1][1] = 8;
        notasAlunos[1][1] = 7;
        notasAlunos[1][1] = 9;

        notasAlunos[2][0] = 8;
        notasAlunos[2][1] = 9;
        notasAlunos[2][1] = 10;
        notasAlunos[2][1] = 12;
	````
- Aula segunda parte
[Parte 2](https://youtu.be/C6lhdwDo2Ng)
- Parte 2: Manipulação
	- Como setar novos valores, alterar valores e imprime na tela. 
- Como imprimmos o valor na tela (Uma matriz de vetores)
````java
//Exemplo para imprimir
double [][] notasAlunos = new double[3][4];

        notasAlunos[0][0] = 10;
        notasAlunos[0][1] = 7;
        notasAlunos[0][2] = 9;
        notasAlunos[0][3] = 9.5;

        notasAlunos[1][0] = 9;
        notasAlunos[1][1] = 8;
        notasAlunos[1][2] = 7;
        notasAlunos[1][3] = 9;

        notasAlunos[2][0] = 8;
        notasAlunos[2][1] = 9;
        notasAlunos[2][2] = 10;
        notasAlunos[2][3] = 7;

        for (int i = 0; i < notasAlunos.length; i++) {
            // maneira errada System.out.println(notasAlunos[i] + " ");
            // correto é um for dentro de outro for
            for (int j = 0; j < notasAlunos[i].length; j++) {
                System.out.print(notasAlunos[i][j] + " ");
            }
            System.out.println();

        }
        notasAlunos[1][3] = 8;
        System.out.println();

        double soma = 0;
        for (int i = 0; i < notasAlunos.length; i++) {
            // maneira errada System.out.println(notasAlunos[i] + " ");
            // correto é um for dentro de outro for
            soma = 0;
            for (int j = 0; j < notasAlunos[i].length; j++) {
                System.out.print(notasAlunos[i][j] + " ");
                soma +=notasAlunos[i][j];
            }
            System.out.println("Média do aluno " + i + " é = "+ (soma/4));

        }
````
- inicializando com grandes valores
````java
        double [] notasAluno1 = {7,8,9,10};
        double [][] notasAluno2 = {{7,8,9,10},{7,8,9,10}};
        double [] notasAluno3 = {7,8,9,10};
````
- Aula terceira parte
[Parte 3](https://youtu.be/99u1tAbYcww)
- Parte 3: Matrizes Dimensões
	- Entender o tamanho de matrizes e matrizes de 3 dimensões.
	- Na aula vimos matrizes de duas dimensões
	- Existem matrizes de N dimensões
	- Fica dificil de entendermos matrizes de 4 dimensões, pq tentamos desenhar
	- Matriz de 3 dimensões, seria tipo um cubo.
	- matriz[x][y][z]
- Vamos pratircar uma matriz 3x3
````java
// exemplos de matriz tridimensional
int [][][] matrizTridimensional = new int[3][3][3];

        for (int i = 0; i < matrizTridimensional.length; i++) {
            for (int j = 0; j < matrizTridimensional[i].length; j++) {
                for (int k = 0; k <matrizTridimensional[i][j].length ; k++) {
                    System.out.println("i =  " +i+ "j =  " +j+ "k =  " +k);
                    matrizTridimensional[i][j][k] = i + j + k;
                }
            }
        }

        int soma = 0;
        int somaPares = 0;
        int somaImpares = 0;
        for (int i = 0; i < matrizTridimensional.length; i++) {
            for (int j = 0; j < matrizTridimensional[i].length; j++) {
                for (int k = 0; k <matrizTridimensional[i][j].length ; k++) {
                    soma += matrizTridimensional[i][j][k];

                    if(matrizTridimensional[i][j][k] % 2 == 0){
                        somaPares+=matrizTridimensional[i][j][k];
                    }else{
                        somaImpares+=matrizTridimensional[i][j][k];
                    }
                }
            }
        }
        System.out.println("Soma " +soma);
        System.out.println("somaPares " +somaPares);
        System.out.println("somaImpares " +somaImpares);
    }
````
[Parte 4](https://youtu.be/99u1tAbYcww)
- Parte 4: Matrizes Irregulares
	- array regular [1][1]
	- Array irregular é um array com irregularidades
		- arrayIrregular [0] = new int[1]
		- arrayIrregular [1] = new int[2]
		- arrayIrregular [2] = new int[3]
````java
Scanner scan =new Scanner(System.in);
        System.out.println("Número de pessoas que serão entrevistadas: ");
        int numEntrevistados = scan.nextInt();

        String[][] nomesFilhos = new String[numEntrevistados][];

        for (int i = 0; i < nomesFilhos.length; i++) {
            System.out.println("Entre com a quantidade de filhos");
            int qtdFilhos = scan.nextInt();
            nomesFilhos[i] = new String[qtdFilhos];
            for (int j = 0; j < nomesFilhos[i].length; j++) {
                System.out.println("Digite o nome do filho " +(j+1));
                nomesFilhos[i][j] = scan.next();

            }
        }
        for (int i = 0; i < nomesFilhos.length; i++) {
            System.out.println("Pessoa " +i+ " tem " +nomesFilhos[i].length+ " Filhos");
            for (int j = 0; j < nomesFilhos[i].length ; j++) {
                System.out.println(nomesFilhos[i][j]);
            }
        }
    }
````


## Correção Exercícios Aula 20 (Matrizes/Arrays multi-dimensionais)
- [Exercicios - Parte 1](https://youtu.be/Cf4sv_9vENs?t=7)
- [Exercicios - Parte 2](https://youtu.be/lHKmF-kOq90)
- [Exercicios - Parte 3](https://youtu.be/zaD6mQj11ew)
- [Exercicios - Parte 4](https://youtu.be/9h9OfzW9u9M)
- [Exercicios - Parte 5](https://youtu.be/Cf4sv_9vENs?t=7)
