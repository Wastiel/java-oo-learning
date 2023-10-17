# Aula 03. Programação Básica

## Introdução a Variáveis
[Link da aula](https://youtu.be/ELBqT_rueAQ)
- Introdução
	- Declaração de variaveis
	- Como declarar variaveis no java
	- Convenção de nomenclatura (Importante)

- No nosso dia já utilizamo varios objetos, para guardar alguma coisa.
- Quando estamos no nosso PC, abrimos um arquivo, ele está fazendo uma referencia para uma area de memoria do dispositivo.

- Uma variavel em um programa, referencia de uma area de memoria de um valor guardado. 
- o que seria uma variavel
	- Área de memoria associada a um nome que pode armazenar valores de um determinado tipo
		- Variavel associada a um ponto da memório
	Exemplo: Armazenar a idade de uma pessoa
- Declaração de uma variavel
	- <tipo> <Nome variavel>;
- Atribuição de váriavel
	- <tipo> <Nome variavel> = <valor>;

- Convenção de nomenclatura
- Existe 50 palavras reservadas
	- Exemplos: if, continue, for, new, booolean, else
	- Pegamos com o tempo
- Regras seguidas por desenvolvedores
- Boas práticas
	- Primeira letra - a-z A-z _ &
	- Depois - a-z A-z _ & 0-9
	- Case Sensitive
	- Nao é legal usar o &
	- Sempre com minuscola e segue case sensitive

- Tipos primitivos
	- int = numeros inteiros
	- float, doble = pontos flutuantes, com virgulas
	- char, caracteres
	- boolean, verdadeiro e falso.

- Criamos um pacote no exemplo
	- com.willian.cursojava.aula10
- String nao é um tipo primitivo, ele é um conjunto de charateres
- java, camialcase
- Variaveis
	````java
	public class Variaveis {
	    public static void main(String[] args) {

	        //variavies com convenção de java
	        int idade = 20;
	        String nome = "Willian";
	        String nomeDoMeuCachorro = "Toto";
	        String ano2014 = "2014";

	        /* Variaveis que podem se declarar, mas nao é convenção java
	        int _idade;
	        int $idade;
	        String ano2014;
	        String nome_do_meu_cachorro;
	        String NomeDoMeuCachorro;
	        String NomeDoMeucachorro;*/

	        idade = 25;
	        System.out.println("Idade = " + idade);
	        System.out.println("Nome = " + nome);
	        
	        //Sempre escrever as variaveis que signifiquem alguma coisa, nao como exemplo abaixo.
	        int a = 10;
	        String b = "Loriane";

    }
	````

## Tipos Primitivos
[Link da aula](https://youtu.be/aqiB58NpKLw)
- Introdução
	- Tipos Inteiros 
	- Tipos Ponto Flutuante
	- Tipo Char
	- Tipo Boolean
	- Literais
		- A nível de curiosidade

- Java orientada a Objetos. Ela não é 100%.
	- por causa dos tipos primitivos
	- Booleans
	- Numeros
		- Inteiro
			- byte
			- short
			- int
			- long
			- char
		- Ponto Flutuante 
			- float
			- double

- Inteiros
	- 4 tipos de inteiros (Tamanhos diferentes e intervalos diferentes de valores)
		- byte - Raro
		- short - Raro
		- int - No dia a dia
		- long
			- Exemplo destas declarações
				- byte idade1 = 20;
				- short idade2 = 20;
				- int idade3 = 20;
				- long idade4 = 20;

- Ponto Flutuante 
	- 2 tipos - São iguais, a difernça é o tamanho (Dia a dia o mais utilizado, duble).
		- float
		- double
			- Exemplo declarações 
				- float saldo1 = 100.30f;
					- o F é literal, temos que colocar o f no final, pouco usado no dia
				- double saldo2 = 100.30;

- char
	- char
		char o = 'o';
		char i = 'i';
		- Char nao seria um inteiro? 
			- De acordo com a ASCII cada caracter, tem um valor
			- exemplos:
				- 95 = A
				- 97 = A
				- F = 46 
				- f = 66
	- Exemplo legal para entender a ideia de um char ser um inteiro
		````java
		char o = 111;
        char i = 105;

        System.out.println("Soma? " + o + i); // isto mostra oi
        System.out.println(o + i); // isto mostra 216, soma dos caracteres ASCII        
		````
- Unicode
	- Facil para quem utiliza a, b, c, d, origem latinas, não para origens arabes
	- System.out.println("" + o + i + interrogacao);

- Boolean 
	- verdadeiro = true;
	- Falso = false;

- Literais 
	- Padrão int, mas tu pode especificar
		- int idade1 = 20;
		- long idade2 = 20l
	- Notação cientifica
		- double d1 = 1234e2; notação cientifica
		- double d2 = 123.4f;
	- Hexadecimais, octais, binários
		- usamos o sistema decimal
		- Utilizam ouros sistemas
			- int decVal = 26;
			- int hexVal = 0x1a;
			- int octVal = 032;
			- int binVal = 0b11010; //a partir do java 7

- Piadinha de natal
	````java
	public class Piadinha {
	    public static void main(String[] args) {
	        int Oct310 = 031;
	        int Dec310 = 25;

	        System.out.println(031 == 25); //piadinha de natal
	    }
	}

	````

- Sequencias de Escape
| Seqüência  | Caráter                                      |
|------------|----------------------------------------------|
| `\b`       | backspace                                    |
| `\t`       | tabulação horizontal                         |
| `\n`       | newline                                      |
| `\f`       | form feed                                    |
| `\r`       | carriage return                              |
| `\"`       | aspas                                        |
| `\'`       | aspas simples                                |
| `\\`       | contrabarra                                  |
| `\xxx`     | o caráter com código de valor octal xxx      |
| `\uxxxx`   | o caráter Unicode com código de valor hexadecimal xxxx |


- Todos os fontes utilizados nesta aula, tão no pacote "package com.willian.cursojava.aula11;"

## Lendo dados usando a classe Scanner
[Link da aula](https://youtu.be/Z6Y8zupCKfk)
- Introdução
	- Ler dados do teclado
		- Linha inteira
		- Ler um tipo de dado especifico

- Classe Scanner
	- Scanner  scan = new Scanner(System.in);
- Import, dizer que queremos utilziar tal classe do scanner
Lendo dados do Teclado
	- Opção1 
		- Lendo uma linha inteira
		String nome = scan.nextLine;
	- Opção2 
		- String primeiroNome = scan.next();
		- int idade = scan.nextInt();
		- double altura = scan.nextDouble();

- Vamos praticar
	````java
	public class LeituraDadosTeclado {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        /*

        System.out.println("Digite seu nome completo: ");
        String nomeCompleto = scan.nextLine();
        System.out.println("Seu nome completo: " + nomeCompleto);

        System.out.println("Digite seu primeiro nome: ");
        String primeiroNome = scan.nextLine();
        System.out.println("Seu nome completo: " + primeiroNome);

        System.out.println("Digite a sua idade: ");
        int idade = scan.nextInt();
        System.out.println("Sua idade é: " + idade);

        System.out.println("Digite a sua Altura: ");
        Double altura = scan.nextDouble();
        System.out.println("Sua Altura é: " + altura);*/

        System.out.println("Digite o seu primeiro nome, idade, quantidade de filhos, altura e se tem animais de estimação: ");
        String primeiroNome = scan.next();
        int idade = scan.nextInt();
        byte qtdFilhos = scan.nextByte();
        float altura = scan.nextFloat();
        boolean temPet = scan.nextBoolean();

        System.out.println("Você digitou os seguintes valores: ");
        System.out.println("Primeiro nome: " + primeiroNome);
        System.out.println("Idade: " + idade);
        System.out.println("Quantidade de filhos:  " +altura);
        System.out.println("Altura:  " + altura);
        System.out.println("Bichinho:  " + temPet);

    }
}
	````

## Operadores
[Link da aula](https://youtu.be/199tKAE6sxo)
- Introdução
	- Operadores Aritiméticos
	- Operadores Relacionais
	- Operadores Lógicos
	- Operadores Assignment
	- Procedencia

- São simbolos que solicitam ao compilador executar alguma solicitação. 
- Operadores Aritiméticos
| Operador | Descrição         |
|----------|-------------------|
| `+`      | Adição            |
| `-`      | Subtração         |
| `*`      | Multiplicação     |
| `/`      | Divisão           |
| `%`      | Módulo            |
| `++`     | Incremento        |
| `--`     | Decremento        |

- Contactenar string e somar valores
- incremento e decremento

- Operadores Relacionais
| Operador | Descrição                              |
|----------|----------------------------------------|
| ==       | Igualdade (verdadeiro se igual)        |
| !=       | Diferença (verdadeiro se diferente)    |
| >        | Maior que                              |
| <        | Menor que                              |
| >=       | Maior ou igual a                       |
| <=       | Menor ou igual a                       |

- Operadores Lógicos
| Operador | Descrição            |
|----------|----------------------|
| `&&`     | E lógico (AND)       |
| `||`     | OU lógico (OR)       |
| `!`      | Negação lógica (NOT) |

- Tabela Verdade
| A         | B         | A AND B       | A OR B        | NOT A     | NOT B     |
|-----------|-----------|---------------|---------------|-----------|-----------|
| Falso     | Falso     | Falso         | Falso         | Verdadeiro| Verdadeiro|
| Falso     | Verdadeiro| Falso         | Verdadeiro    | Verdadeiro| Falso     |
| Verdadeiro| Falso     | Falso         | Verdadeiro    | Falso     | Verdadeiro|
| Verdadeiro| Verdadeiro| Verdadeiro    | Verdadeiro    | Falso     | Falso     |

- Curto Circuito

- [Exericicios a serem entreges] (https://www.slideshare.net/loianeg/curso-java-bsico-exerccios-aulas-11-12-13)
- 1. Faça um programa que mostre a mensagem "Alo mundo" na tela;

## Correção Exercícios Aula 13.
- [Link da aula](https://youtu.be/pfI20o_lyRA) 
