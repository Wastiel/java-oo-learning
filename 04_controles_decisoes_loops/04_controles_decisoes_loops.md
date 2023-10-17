# 04. Controle, Decisões e Loops

# Controle de Decisão: IF - ELSE
- [Link da Aula](https://youtu.be/KJYSXTYgL_o)
- Introdução
	- Controle de decisão
	- IF Se algo acontecer
	- IF else - caso aconteca ou não 
	- Muitos IF's
- Comando IF
	- If é uma condicional
	- vamos verificar se a condicional é veradadeira, executamos
	- se for falsa, nao acontece.
	- Exemplo batatas
	````java
	boolean temBatata = true;
	int ovos = 6;

	if(temBatata){
		ovos = 9;
	}

	System.out.println("Compre : " + ovos + " ovos.");
	````
	- se a condicional for verdadeira, a gente executa, se não for verdadeira, não executamos
- Comando else
	- Executa a condição contraria ao solicitado

````java
public class IfElse {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Entrar com a sua idade: ");

        int idade = scan.nextInt();

        if (idade >=18){
            System.out.println("É maior de idade!");
        }else{
            System.out.println("Não é maior de idade!");
        }
    }
}
````	
- IF's aninhados
	- condições sequenciasi

````java
public class IfElse {
    public static void main(String[] args) {
        
        System.out.println("Entrar com a o valor do produto: ");
        int valor = scan.nextInt();

        if (valor <=10){
            System.out.println("Está barato, pode comprar!");
        } else if(valor > 10 && valor<15){
            System.out.println("Você pode pedir um desconto!");
        } else if (valor >= 15 && valor <17){
            System.out.println("Pode pesquisar mais");
        } else{
            System.out.println("Está muito caro");
        }
    }
}
````


# Controle de Decisão com Múltipla Escolha: SWITCH
- [Link da Aula](https://youtu.be/JTLgFZyBUN4)
- Introdução
	- Switch -Case
	- Funciona a uma alternativa a varios If- Elses aninhados
- exemplo
	````java
		public class SwitchCase {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Entre com um dia da semana");

        int diaSemana = scan.nextInt();

        switch (diaSemana) {
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("segunda");
                break;
            case 3:
                System.out.println("Terca");
                break;
            case 4:
                System.out.println("Quarta");
                break;
            case 5:
                System.out.println("Quinta");
                break;
            case 6:
                System.out.println("Sexta");
                break;
            case 7:
                System.out.println("sabado");
                break;
            default:
                System.out.println("Não é um dia da semana válido");
        }
        switch (diaSemana) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("Dia Util");
                break;
            case 7:
                System.out.println("sabado");
                break;
            default:
                System.out.println("Não é um dia da semana válido");
        	}

    	}
	}
	````

- Valores dentro do switch:
	- short
	- byte
	- int
	- char
	- enum
	- String

- [Lista de exericicios](https://www.slideshare.net/loianeg/curso-java-basico-exercicios-aulas-14-15) 


# Correção Exercícios Aula 15 (if-else e switch-case)
- [Link da Aula](https://youtu.be/-BpAWP6T6a8)
- [Lista de exericicios](https://www.slideshare.net/loianeg/curso-java-basico-exercicios-aulas-14-15) 
- ignoreCase

# Loops – WHILE e DO WHILE
- [Link da Aula](https://youtu.be/9_12LPVMJYc)
- Introdução
	- Controle While
	- Controle do do-While
- Comando While - Enquanto
	- Vai avaliar uma expressão e se for verdadeira, executa o bloco de código.
- Variavel i ou contador, para fazer um controle de contagens.
- i++; incremento do i ou i = i + 1;
- icrementar contadores com o ++ é comun

````java
// Exemplo while
public static void main(String[] args) {
        int i = 0;
        int max = 10;
        System.out.println("Contando até " + max);

        while (i <max){
            System.out.println("Contando: " +i);
            i++;

        }

    }
````
- O algoritimo acima conta de 1 a 10, controlado pelo ii
- Cuidado sempre com a movimentação do contador.
- Comando do-while
	- Esse comando é faça enquanto a expressão for verdadeira. Vai deixar de ser executado após ela ser falsa.
````java
//Exemplo do-while
do {
            i++;
            System.out.println("valor de I" + i);
        } while (i<15);
            System.out.println("" +i);
        }
````
- While - Enquanto primeiro avalia a expressão e depois executa
- Do-While - faça enquanto - Primeiro encrementa e depois exeucta o bloco de códigos.

# Loops – FOR
- [Link da Aula](https://youtu.be/HrfWrbmFUKQ)
- Mais utilizado que aceitam o for.
- Introdução
	- Controle loop For
- For vai executar o bloco dentro do for.
	- podemos inicializar um contador, a condição e atualização.
- Variações
	- For normal
	````java
	for (int i = 0; i<5; i++){
		System.out.println("i tem valor: " +i);
	}

	//ou

	 for (int i = 5; i>0; i--){
            System.out.println("i tem valor: " +i);
     }

	````
	- Isto vai imprimir de um a 5.
- Se formos olhar, o escopo do i, é dentro do for. 
- For com mais de uma variável

````java
	for (int i = 0,j = 10; i<j; i++,j--){
		System.out.println("i tem valor: " +i+ "j tem valor: " +j );
	}
````
- Quando usamos mais de uma variavel, separamos por vigula. 
- For com partes ausentes (Não é muito comum)

````java
int = 0;
for(;i <5;){
	System.out.println("i tem valor: " +i );
	i++;
}
````
- Loop infinito
	- for(;;);
	- Nunca vai parar, não é recomendado

- loop sem corpo
````java
int soma = 0;
for (i = 1; i<5; soma += i++);
	System.out.println("O valor da soma é: " +soma );
````
- Sem corpo ele executa direto. Caso não precise imprimir.Loop 
- A ideia de nao usar as chaves, é para executar o bloco dietamente não tendo a necessidade de executar algo em especifico. 

- [Exercicios 17 - 18](https://www.slideshare.net/loianeg/curso-java-basico-exercicios-aulas-16-17)
# Correção Exercícios Aula 17 (while, do-while, for)
- [Link da Correção parte 1](https://youtu.be/7ccdc5Vkf7Q)
- [Link da Correção parte 2](https://www.youtube.com/watch?v=ATEpiDIqDx4)
- [Link da Correção parte 3](https://www.youtube.com/watch?v=ltG7MEnTx8M)
- [Link da Correção parte 4](https://www.youtube.com/watch?v=bfkocfgM7_U)
- [Link da Correção parte 5](https://www.youtube.com/watch?v=coiYSnquB7g)



- usar o do while para controle é bem interessante


# Comandos BREAK e CONTINUE
- [Link da Aula](https://youtu.be/rU-DCmwAtXE)