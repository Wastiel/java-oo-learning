# Aula 02 - Comecando com Java

## Primeiro Programa em Java
- [Vídeo Aula](https://youtu.be/mu2ti43cgwc)
- Cronograma, primeiro programa
	- Hellow World
	- Compilar o programa 
	- Executar 
	- Entender o que acontece
	- Vamos fazer de forma manual os programas
- Wellow world - Primeiro programa
	- public static void main(String[] args) - iniciador do programa
	````java
	class helloWorld{
	public static void main(String[] args){
		System.out.println("Hellow World!");
		}
	}
	````
- Convenção java, Classe MinhaClasse, MinhaPrimeiraClasseJava Seguem. No final vai por osmose.
- javac HelloWorld.java - criamos a compilação do programa
- traduzimos pelo javac o que entendemos para a VM
- Executar o arquivoj java HelloWorld

- O comando System.out.println("Hellow World!"); serve para mostrar algo na tela

- Entendendo o nosso código
	````java
	class helloWorld{
	public static void main(String[] args){
		System.out.println("Hellow World!");
		}
	}
	````
	- class - Declaração da Classe - Tudo no java é um Objeto - Instancia de uma classe
	- Hellow Orld - Nome da classe
	- Pubolic Static - Método
	- void - Tipo de retorno do metodo
	- Main - Nome do método
	- java Case Sensitive
	- (String[] args) - argumentos
	- System.out.println("Hellow World!"); - Codigo executado
	- O código é dividio em blocos.

- Mudanças e aulas.
	- vamos utilizar sempre a mesma estrutura de programa
		- O que vai mudar são as classes e o código
		A estrutura demais fica padrão.

- Lição de casa
- Escrever o mesmo programa, so que em portugues:

	````java
	class helloWorld{
	public static void main(String[] args){
		System.out.println("Hellow World!");
		}
	}
	````

# Correção Exercícios Aula 05
- [Vídeo Aula](https://youtu.be/3rZNefsMmKs)

````java
class helloWorld{
public static void main(String[] args){
	System.out.println("Hellow World!");
	}
}
````

# Passando argumentos para o programa
- [Vídeo Aula](https://youtu.be/dhGPGv7XCM8)
- Agenda
	- Passar argumentos para um programa java	
	- Compilar
	- Executar
	- Entender o que acontece
- Executamos o programa que mostrava uma mensagem.
- args, recebe um argumento.
	- args[0], vetor de strings
	- vamos pegar o idnex 0
- Interpretado e compilado
- Compilamos o programa 
	- javac Argumentos.java -> compilamos
	- java Argumentos cursoJava -> executando o nprograma passando argumentos.
- 

- Lição: Argumentos2, que vai escrever olá mundo, mais o argumento passado para o programa.

````java
	class Argumentos2{

		public static void main(String[] args){

			System.out.println("Olá Mundo " + args[0]);
			}
	}
````
# Correção Exercícios Aula 06
- [Vídeo Aula](https://youtu.be/Ebvl0BlnD-U)

````java
	class Argumentos2{

		public static void main(String[] args){

			System.out.println("Olá Mundo " + args[0]);
			}
	}
````

 
# Entendendo os Erros
- [Vídeo Aula](https://youtu.be/NoEoOaTSFMo)
- Entender os erros que acontecem ao executar um programa java
- Vamos escrever programas para gerar erro, e corrigilos
- Erros:
	- Erros de Sintaxe
		- Quando esquecemos algo, acontece erro de sintaxe {}.
	- Erros de Semântica
		- Erro ao declarar uma variavel, erro de semantica.
	- Erros em Tempo de execução
		- Nao declarei o metodo main, dai ocorre por não ter o ponto de entrada
- Sublime ja mostra alguns erros no java, ele ja controla alguns pontos.
````java
	class Erros{

		public static void main(String[] args){

			System.out.println("Você digitou " + args[0])
			}
	}
````
- O código a cima gerou erro:

	Erros.java:5: error: ';' expected
	                        System.out.println("Voc├¬ digitou " + args[0])
	                                                                      ^
	1 error

# Instalando uma IDE (Eclipse e Netbeans)
- [Vídeo Aula](https://www.youtube.com/watch?v=NoEoOaTSFMo)
- Instalar o Eclipse
- Instalar o NetBeans
- Comecando
		- ecplise.org
		- netbeans.org
- Eu fiquei com intelljei, que ja tinha instalado na minha maquina
- Criei um workspace para os programas que vamos vir a construir


# Introdução a Classes e Objetos
- [Video Aula](https://youtu.be/KUUrrIX6wGo)
- Introdução o orientação a objetos
- Aula Teorica
- Aprender termos
- Faculdade começamos com paradigmo estrutural
	- Pegamos um problema e solucionamos ele.
- No mercado usamos orientação a Objetos
- Resolução de problemas
- Aprender no decorrer do curso a diferença a paradigam extruturado e paradigma Orientado a Objetos
- Java é orientado a objetos
	- Vantagens
		- Reuso de código
		- Reflete o mundo Real
		- Facilita Manutenção no código
- Esforço para aprender Orientação Objetos
- Classes
	- Descrição de um grupo de objetos
	- Ao redor de onde estamos, varios objetos
	- Para o mundo da programação, eu como pessoa posso ser um objeto
	- Exemplo:
		- cachorro pode ser definido como Objeto, podemos ter uma classe chamada Cachorro
		- Nome Classe: Cachorro
		- Conjunto de atributos: Descrições
		- Conjunto de métodos: Comportamentos do cachorro
		- Labrado tem 21 polegadas, um peso e qualidade amigavel, tempo de vida 10 a 15 anos, e muito inteligente. Pode ter problema de olhos, coraçção
		- Caracteristicas - Raca, altura, nivel de inteligencia e etc... Caracteristicas de cachorro, TUdo isto são atributos
		- Pessoa - Altura, nome, peso - Exemplos de atributos
	- Classe: Descrição
	- Objeto: Se torna uma coisa
		- Planta da Casa seria uma classe
		- No momento que começamos a construir, aquili se torna um objeto. Uma instancia daquelo que estava no papel
	- Classe Cachorro, Com atributos
	- Temos um chachorro é um objeto rotiviler
	- Mesma coisa com outro cachorro.
	- Então temos duas instancias da classe cachorro
		- Rotivlier
		- Pomeranea
- Comportamento
	- Latir
	- passear
	- comer
	- dormir
	- brincar
	- ter filhotes
- Metodos são ações que definem aquela classe. Ações de uma classe.
- Metodos ações da Classe
- Objetos
	- Objeto: Se torna uma coisa
		- Planta da Casa seria uma classe
		- No momento que começamos a construir, aquili se torna um objeto. Uma instancia daquelo que estava no papel
- Herança
	- Permite que reutilize estrutura e comportamento de classes
	- Classe Animal
		- Nome
		- Mamifero mama
		- Reptil poe ovos
	- Nem todo mamifero tem 4 patas, mas todo mamifero mama
	- cachorro dentro de casa
	- Lobo na floresta
	- Gato em casa
	- Tigre na floresta
	- Ambos tem caracteristicas de bigode, mas tem outras diferenas
	- Todos tem caracteristicas comuns, mamifero, felino e canino fazem também.

- Polimorfismo
	- Ter habilidade de mais de um tipo
	- Exemplo, todos emitem um som
		- Emitir som é um comportamento do animal.
		- Pedir para o gato emitir som, ele vai miar
		- Compra emitir som, ela vai fazer som
		- Tudo depende da subclasse do animal, e o valor vai ser diferente para o tipo de animal.
- Pacotes
	- Organiar Classes
	- Convenção do pacote: dominio + projeto + pasta
	- Ex: com.loiane.cursojava.aula09
	- Organizar Bibliotecas