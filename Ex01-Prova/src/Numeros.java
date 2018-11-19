/*
Crie uma classe chamada Numeros, e nela uma função chamada
imprimeNumerosPares. Esta função deve receber um valor do tipo inteiro e
imprimir em tela (sysout) os números pares de 0 até este valor.
Para verificar se um valor é par durante a iteração, pode-se usar o método auxiliar
abaixo (o qual pode ser colocado na mesma classe Numeros):
public boolean numeroPar(int numero) {
return numero % 2 == 0;
}
Crie uma classe de teste para exercitar o código acima. O teste deve criar uma
instância da classe Numeros e chamar o método imprimeNumerosPares.
 */

public class Numeros {

	public void imprimeNumerosPares(int numero) {
		int numeros = 0;
		for (int i = 0; i <= numero; i++) {
			if (i % 2 == 0) {
				numeros = i;
				System.out.println(numeros);
			}
		}
	}
}
