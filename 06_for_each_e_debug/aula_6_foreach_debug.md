# Aula 06. For Each e debug aplicação

## For Each
- [Aula](https://youtu.be/2ndBbnsqBXQ) 
- Um for melhorado
- Foi adicionado no java depois da versão 5.
- Vai ser arry, vetor, matriz, multi Dimensão
- para cada
````java
	int [] notas = new int [10];
	for (int nota : notas){
		System.out.println(notas);
	}
````
- No for, temos acesso ao contador, no foreach nao.

- For Each array dentro de arry
````java
 double [][] a = new double[2][2];

        a[0][0] = random.nextDouble(10);
        a[0][1] = random.nextDouble(10);
        a[1][0] = random.nextDouble(10);
        a[1][1] = random.nextDouble(10);

        for(double[] b: a){
            for(double c: b){
                System.out.println(c + " ");
            }
````


