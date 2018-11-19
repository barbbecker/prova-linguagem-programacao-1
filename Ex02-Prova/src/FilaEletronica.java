/*
A cafeteria da Fundatec quer automatizar parte do seu sistema de atendimento com
uma fila de espera eletrônica. Por exemplo, quando um cliente faz um pedido, o
sistema gera um número (sequencial) para este cliente, na ordem de chegada.
Assim, crie uma classe FilaEletronica que tenha um atributo inteiro chamado
ordem. Inicialize este atributo com o valor zero no construtor da classe. Crie um
método chamado proximo() que retorna o número para o cliente que está
fazendo o pedido.
O teste abaixo deve passar:
@Test
public void testaProximo() {
FilaEletronica fila = new FilaEletronica();
fila.proximo();
fila.proximo();
int ordem = fila.proximo();
assertEquals(3, ordem);
}
*/

public class FilaEletronica {

	private int ordem;

	public FilaEletronica() {
		this.ordem = 0;
	}

	public int getOrdem() {
		return this.ordem;
	}

	public int proximo() {
		return this.ordem += 1;
	}
}
