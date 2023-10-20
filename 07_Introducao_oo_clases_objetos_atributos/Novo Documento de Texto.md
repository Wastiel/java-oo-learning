# Aula 07. Orientação Objetos e Java

## Conceitos classe, objetos, atributos
- Introdução
	- Forma Geral
	- Definições de classes
	- Atributos
	- Criação de objetos - Istanciar

- Acostumamos a criar classe
- Metodos mais funcionais
- PQ orientação OBjetos Surgiu
	- Mais facil tentar imaginar uma entidade, do que você fazer programação estruturada.
	- Tudo que fizemos até agora foi programação estruturada
	- Vamos começar a trabalhar com Programação Orientada Objetos.
	- Definição, chamamos de classe.
	- Classe tem qualidades (Atributos)
	- Metodos, são ações da classe (Nem sempre são ações). 
- Vamos focar nos atributos
- Carro
	- Cor
	- Marca
	- Modelo
	- número de passageiros
	- Capacidade do tanque de combústivel
	- Consumo de combustível por km
- Classe:
	`````java
	classe Carro {
		String marca;
		String modelo;
		int numPassageiros; //número de passageiros
		double capCombustivel; //capcaidade do tanque de combústivel
		double consumoCombustivel; //consumo de combustível por km
	}
	`````
- Criamos a classe na ide
- Quando damos vida a esse caro, chamamos ele de objeto
	- Van
	- Fusca
	- Ferrari
	- Conversivel
- Criação dos objetos
	````java
	Carro van = new Carro();
	van.marca = "Fiat";
	van.modelo = "Ducato";
	van.numPassageiros = 10;
	van.capCombustivel = 100;
	van.consumoCombustivel = 0.2;

	````

- Exemplo de chamada por outra classe
````java
 Carro van = new Carro();
        van.marca = "Fiat";
        van.modelo = "Ducato";
        van.numPassageiros = 10;
        van.capCombustivel = 100;
        van.consumoCombustivel = 0.2;

        System.out.println("Marca " +van.marca);
        System.out.println("Marca " +van.modelo);
        System.out.println("Marca " +van.numPassageiros);
````



# Correção Exercícios Aula 24: Classes e atributos
- [Lista de exercicios](https://youtu.be/0f5wWNU_nns?list=PLGxZ4Rq3BOBq0KXHsp5J3PxyFaBIXVs3r)
- Buscamos os dados no google, sobre a determinada entidade.


# Classes e métodos simples
# Classes e métodos com retorno
# Classes e métodos com parâmetros
# Correção Exercícios Aula 27: Classes e métodos
# Pacotes (packages) e import
# Construtores e Código de inicialização
# Palavra chave this
# Modificadores private e public
# Encapsulamento: métodos getters e setters
# Sobrecarga de métodos e construtores (overload)
# Correção Exercícios Aula 33: Construtores e Encapsulamento
# Variáveis e métodos estáticos (modificador static)
# Correção Exercícios Aula 34: Modificador static
# Recursividade
# Correção Exercícios Aula 35: Recursividade
# Relacionamento tem um
# Correção Exercícios Aula 36: Relacionamento tem um




#### debug
