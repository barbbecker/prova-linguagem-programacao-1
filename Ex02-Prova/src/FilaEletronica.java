/*
A cafeteria da Fundatec quer automatizar parte do seu sistema de atendimento com
uma fila de espera eletr�nica. Por exemplo, quando um cliente faz um pedido, o
sistema gera um n�mero (sequencial) para este cliente, na ordem de chegada.
Assim, crie uma classe FilaEletronica que tenha um atributo inteiro chamado
ordem. Inicialize este atributo com o valor zero no construtor da classe. Crie um
m�todo chamado proximo() que retorna o n�mero para o cliente que est�
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
