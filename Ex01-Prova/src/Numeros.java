/*
Crie uma classe chamada Numeros, e nela uma fun��o chamada
imprimeNumerosPares. Esta fun��o deve receber um valor do tipo inteiro e
imprimir em tela (sysout) os n�meros pares de 0 at� este valor.
Para verificar se um valor � par durante a itera��o, pode-se usar o m�todo auxiliar
abaixo (o qual pode ser colocado na mesma classe Numeros):
public boolean numeroPar(int numero) {
return numero % 2 == 0;
}
Crie uma classe de teste para exercitar o c�digo acima. O teste deve criar uma
inst�ncia da classe Numeros e chamar o m�todo imprimeNumerosPares.
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
