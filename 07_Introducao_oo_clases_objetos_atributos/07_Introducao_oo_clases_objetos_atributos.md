# Aula 07. Orientação Objetos e Java

## Conceitos classe, objetos, atributos
- [Vídeo Aula](https://youtu.be/Gq1BS63pkRA)
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
[Vídeo Aula](https://youtu.be/-t_c6F_Uoeg)
- Definição de métodos em classes do java
	- Aprendemos definição de classes e objetos
	- Variavel instanciada passsa a ser objeto. 
	- atributos, descrição de propriedades da determinada classe.
- Ações dos objetos.
- Método simples sem retorno e/ou parâmetro
	````java
	void exibirAutonomia(){
		System.out.println("A autonnomia do carro é: " +capCombustivel * consumoCombustivel + "km");
	}
	````
- Agora vamos criar metodos.
- Vamos pegar o Carro como exemplo. 
- Dentro do metodo, como estamos dentro da classe carro, temos acesso a qualquer atributo. 
- Metodo sempre começa com verbo. (Em função de boas práticas).

# Classes e métodos com retorno
- [Vídeo Aula](https://youtu.be/_3fal2H8Agw)
- Classes e métodos com retorno
- Método sem retorno é com void
- Final do método, temos que dar o return da saida do métodos.
````java
void exibirAutonomia(){
        System.out.println("A autonnomia do carro é: " +capCombustivel * consumoCombustivel + "km");
    }
    double obterAutonomia(){
        System.out.println("Métodos obterAutonomia foi chamado");
        return capCombustivel*consumoCombustivel;
    }    
````

````java
double autonomia = van.obterAutonomia();
        System.out.println("Autonomia: " + autonomia);
        System.out.println("Autonomia: " + van.obterAutonomia());
````

# Classes e métodos com parâmetros
- [Vídeo Aula](https://youtu.be/ffvsI9dnDiY)
- Como declaramos métodos com parametros
- Parametros
	````java
	double obterAutonomia(double km){
		return km/consumoCombustivel;
	}
	````
- Colocamos os dados (parametros) que iremos utilizar dentro do métodos
- Dados que não estão na classe, isto utilizamos parametros
- Primeiro vem os atriubtos e depois os metodos, como boas práticas
- consumocombustivel, temos pq já é da classe.
- O méotodo quando estamos construindo é parametro.
- Quando chamamos o método é argumento. 
- Exemplo de chamada:
	````java
	double qtdCombustivel10 = van.calcularCombustivel(10);
        double qtdCombustivel15 = van.calcularCombustivel(10);

        System.out.println("qtde Combústivel de 10" + qtdCombustivel10);
        System.out.println("qtde Combústivel de 15" + qtdCombustivel15);
	````

# Correção Exercícios Aula 27: Classes e métodos
- [Vídeo Aula](https://youtu.be/DTewirzLmb4)
- [Vídeo Aula](https://youtu.be/SC7YLvc6Sto)
- [Vídeo Aula](https://youtu.be/SC7YLvc6Sto)
- [Vídeo Aula](https://youtu.be/ZILUIBmGAmk)


# Pacotes (packages) e import
[Vídeo Aula](https://youtu.be/aRQHjfYBpM8)
- Pacoes e organização do código
- Palavra chave importe
- Começamos a utilizar a IDE para facilitar nossa vida
- Pacotes, organizar o código
- Convenção Java
	- Sempre em lowercase(letra minúscola)
	- Domínio da empresa ao contrário +
	- Nome projeto + (opicional - evitar colisão)
	- Pastas para organizar
- import de classes
	- Framework, sempre começa com o nome do framework na importação
	- import ...
	- Exemplos Scanner
	- impor java.util.Scanner;
	- import padrão para um exemplo de carro
		- impor com.willian.cursojava.aula27.carro
		ou
		- com.willian.cursojava.aula27.carro Carro carro; 
	- Da para importar pacote assim:
		- com.willian.cursojava.aula27.*
- [Documentação java](https://docs.oracle.com/en/java/)


# Construtores e Código de inicialização
- [Link Vídeo](https://youtu.be/uJKcKzro9pU)
- Até agora...
	````java
	carro van = new Carro();
	van.marca = "fiat";
	van.modelo = "Ducato";
	van.numeroPassageiros = 10;
	van.capCombustivel = 100;
	van.consumoCombustivel = 5;	
	````
	- new Carro(), chamamos o construtor da classe.
		- isto está pedindo para o programa guardar memória para o que necessita ser utilizado
- Toda a classe do java ja tem um construtor simples e vazio
- Podemos passar todos os dados dentro do construtuor da classe
	- Exemplo
	````java
	carro(String marca_, String modelo_){
		marca = marca_;
		modelo = modelo_;
	}
	````
- Pode ter quantos construtores você quiser, desde que estejam com nomes diferentes ou parametros de entrada diferentes
	 ````java
	 Carro van2 = new Carro("Fiat", "Ducato", 10, 100);

	 Carro(String marca_, String modelo_, int numPassageiros_, double capCombustivel_){
        marca = marca_;
        modelo = modelo_;
        numPassageiros = numPassageiros_;
        capCombustivel = capCombustivel_;

    	}
	 ````
- Dicas
	- Construtor, não precisa declarara, ele ja faz automaticamente.
	- Quando precisamos criar um construtor com muitos dados, podemos criar automaticamente:
		- No intelijei, simplismente vamos na opção code

- Gerar sempre o construtor também vazio (Desde que não seja o padrão), boa pratica
	- publica Carro2(String marca){
		marca = marca;
	}
	- public Carro2(){}
	hibernaete precisa de um construtor vazio. 

# Palavra chave this
[Link Vídeo](https://youtu.be/RLzR--Pwvcs)
- Construtor com parâmetro
	````java
	Carro(String marca_, String modelo_){
		marca = marca_;
		modelo = modelo_;
	}
	````
	- Não é elegante e também não é muito utilizada no mundo java.
- No dia a dia, usamos o parametro com o nome.
- Resolver a confução do nome;
- Utilizamos o this.
	````java
	carro(String marca, String modelo)
	this.marca = marca;
	this.modelo = modelo;
	````
- this referencia os atributos e metodos da propria classe.
- Referenciar construtor dentro de outro construturo, é possivel. 
- Retorno de atributos via this.
- ctrl vai para o próximo ponto do fonte
- 


# Modificadores private e public
[Link vídeo](https://youtu.be/6oD7TE90e-M)
- Public
	- todo mundo pode ver
- Private
	- Só a classe pode ver aquilo, aquele método.	
	- Defoult, dentro do mesmo pacote.
- Atributos,
	- Seguem o fluxo conforme a informação de pacote.
	- Se estiverem no default, Dentro do pacote.
	- Public é geral
	- Private é dentro da própria classe.
- Metodos Declaramos como public, o que ceremos expor para outras classes.
- Temos que importar o pacote em locais que queiramos utilizr.
- Método para organizar a classe, ele fica private (Chamamos métodos da propria classe, dentro da classe).
	- Exemplo:
		````java
		private double divideKMPorConsumoCombustivel(double km){
			return km/this.consumoCombustivel;
		}

		public double calcularCombustivel(double km){
			return this.divideKMPorConsumoCombustivel(km);
		}

		````
- Circulo é public.	
- Triangulo é default.
- Tem outro para protected.
- Quadrado vermelho é privado.
- Out-line da para ver tudo que foi declarado.	

# Encapsulamento: métodos getters e setters
[Vídelo Aula](https://youtu.be/vKif9IxYTLY)
- Métodos Getters e Setters
- Classe java, sempre declaramos como private.
	- Atributos pricados, não conseguimos utilizar os mesmos;
- Método getter e método Set:
	````java
	public class Carro {

	    private String marca;
	    private String modelo;
	    private int numPassageiros;
	    private double capCombustivel;
	    private double consumoCombustivel;

	    public String getMarca() {
	        return this.marca
	    }

	    public void setMarca(String marca){
	    	this.marca = marca;
	    }
	}
	````
- Se acostumar com os padrões Get and Setters, em função de alguns frameworks
- Usamos os metodos sett's e Gets, para pegar e registrar os dados nas classes principais.
- As IDE's fazem automaticamente. 
	- Code 
		- Genereate 

# Sobrecarga de métodos e construtores (overload)
- [Vídeo Aula]
- Sobrecarga de Métodos
	- Sobreposição, overloading
	- Sobrecaregar metodos ou construtores
- como fazemos?
	- Sobrecarga, mesmo nome, mas assinatura diferente
- Mudar o tipo de retorno, manter o mesmo tipo de retorno
- Sobrecarga de construtores
	- Vários construtores na mesma classe.
	````java
	public class MinhaCalculadora {
	    public int soma(int num1, int num2){
	        return num1+num2;
	    }
	    public double soma(double num1, double num2){
	        return num1+num2;
	    }
	    public int soma(int num1, int num2, int num3){
	        return num1+num2+num3;
	    }
	    public int some(int[] vetorInteiros){
	        int total = 0;
	        for (int i = 0; i < vetorInteiros.length; i++) {
	            total +=vetorInteiros[i];
	        }
        return total;

	````

# Correção Exercícios Aula 33: Construtores e Encapsulamento
- [Vídeo Aula](https://youtu.be/eFYqJHZw2G8)
- [Vídeo Aula](https://youtu.be/LNTGVzYVtMk)
- [Vídeo Aula](https://youtu.be/LNTGVzYVtMk)
- [Vídeo Aula](https://youtu.be/cv8-GNYNOOo)
- Exercicio 1 - Dica
	- Void/private utilzado para organizar código.

- Exercicio 2 - Dica
	- No dia a dia em projetos, não damos saida de dados, exemplo do que não é feito: 
		````java
		public void consultarSaldo(){
		        System.out.println("Saldo atual  da conta = " +saldo);
		    }
		````
	- Quando quisermos mostrar algo no console, utilizamos log's. 

- Exercício 3 - Dica
	- private para organizar o código.

- Exercício 4 - Dica
	- 

# Variáveis e métodos estáticos (modificador static)
- [Vídeo Aula](https://youtu.be/cv8-GNYNOOo)
- Utilizar um modificado Estático.
- Programa utilizado, calculadora
- static, voce nao precisa de uma instancia da classe
	- int soma1 = MinhaCalculadora.soma(1,2);
- Classe Math.
	- Métodos Estáticos
- Sem a estancia, não temos acessos aos métodos dela.
	- MinhaCalculadora calc = new MinhaCalculadora();
	- MinhaCalculadora.soma(1,2);
- Criamos um outro métodos, para acesssar dentro do método main. Ele precisa ser estatico para ser visivel dentro do main.
- Variavel tem que ser static para ser vista pelo método main.
- Exemplos de tudo falado abaixo:
	````java
	public class TestaCalculadora {
	    static int resultSoma;
	    public static void main(String[] args) {

	        resultSoma = MinhaCalculadora.soma(1,2);
	        System.out.println("Soma: " +soma2val(1, 2));
	        
	    }
	    static int soma2val(int num1, int num2){
	        return MinhaCalculadora.soma(num1, num2);
	    }
	}
	````
- Atributo Statico é compartilhado com tudo da classe

# Correção Exercícios Aula 34: Modificador static
- [Vídeo Aula](https://youtu.be/oTy5jP7CK9c)
- [Vídeo Aula](https://youtu.be/oTy5jP7CK9c)
- [Vídeo Aula](https://youtu.be/A8caJRDWWVQ)



# Recursividade
- [Vídeo Aula](https://youtu.be/X56_FjmbmE4)
- Calcular um numero utilizando recursividade
- Introdução 
	- Métodos Recursivos
	- Exemplos Calcular Fatorial
- Função/Método recursivo
	- Método que chama ele mesmo
	- Precisa de um ponto de parada
- Fatorial de um número:
	- 5! = 5 * 4 * 3 * 2 * 1 = 120
	- Método não recursivo
	````java
	public static int fatorial(int num){
	        if(num ==0){
	            return 1;
	        }
	        int total = 1;
	        for(int i = num; i>1; i--){
	            total *=i;
	        }
	        return total;
    	}
	````
- Método Recursivo
	````java
	public static int fatorial(int num){
	        if(num ==0){
	            return 1;
	        }
	        int total = 1;
	        for(int i = num; i>1; i--){
	            total *=i;
	        }
	        return num * fatorial(num-1);
    	}
	````
- Para fatorial usa o conceito de pilhas
- Vantagens de executar um método Recursivo
	- Mais facil de entender
	- Nao siginficia que vai ter uma performance melhor que um algoritimo não recursivo
	- Utilizado em estrutura de dados
	- Algoritimos de grafos, usam recursividade
- Vamos usar as estruturas prontas que o java fornece para a gente. 
- 

# Correção Exercícios Aula 35: Recursividade
- [Vídeo Aula](https://youtu.be/2YyJ3CZBlAI)
- [Vídeo Aula](https://youtu.be/wl1gIU5y-II)

# Relacionamento tem um
- [Vídeo Aula](https://youtu.be/edXQiFAdH2c)
- Introdução entre classes
	- Declaração de classe dentro de outra classe
	- Relacionamento entre classes
	- Array (Vetor) de classes
- Aula bem importante para quem quer ser desenvolvedor.
- Vamos criar uma classe Contato
	- Nome
	- Endereco
	- Telefone

- Vamos criar uma classe Endereco
	- nomeRua
	- numero
	- complemento
	- cep
	- cidade
	- estado

- Primeiro exemplo que vamos relacionar um para.
	- Relacionamos um objeto na criação de outro
	- Ao invez de usar String endereco, usamos:
		- Endereco endereco;

- Exemplo de relacionamento tem um:
	````java
	Contato contato = new Contato();
        contato.setNome("Willian");
        contato.setTelefone("11 9999-9999");

        //criaro objeto endereco
        Endereco end = new Endereco();
        end.setNomeRua("Game of Thrones");
        end.setNumero("n/a");
        end.setComplemento("-");
        

        contato.setEndereco(end);
	````
- Exemplo com o Telefone
	````java
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
	````

- Exemplo tem N
	- Contato pode ter vários telefones.
	- Ñão utilizamos arrays, utilizamos collections.

- Exemplo utilizado nesta aula sobre tem muitos:
	````java
	Telefone[] telefones = new Telefone[2];
        telefones[0] = telefone;
        telefones[1] = telefone2;

        contato.setTelefones(telefones);

        System.out.println(contato.getNome());
	````


# Correção Exercícios Aula 36: Relacionamento tem um
- [Vídeo Aula](https://youtu.be/5-dQS7QuwcY)
- [Vídeo Aula](https://youtu.be/ML32UfX43Pw)






http://www.loiane.com/2013/11/screencast-git-e-github-para-iniciantes