import java.util.ArrayList;
import java.util.List;

/*
Além de automatizar seu sistema de fila, a cafeteria também quer melhorar o
funcionamento da cozinha. Crie uma classe chamada Cozinha que tem uma lista de
pedidos a serem feitos. Essa lista deve ser implementada utilizando a classe List do
Java, e os pedidos podem ser considerados como uma String (ou seja, um
List<String>).
A classe Cozinha deve ter um método novoPedido(String pedido) para
adicionar um prato/pedido a ser feito, e um método pedidoPronto(String
prato) para retirar o prato/pedido da lista quando estiver pronto. Além disto, deve
ter um método chamado pedidosEmPreparo() que retorna uma lista de
pratos/pedidos que ainda estão sendo preparados.
Crie testes para os três métodos em questão.
 */

public class Cozinha {

	private List<Pedido> pedidos;

	public Cozinha() {
		this.pedidos = new ArrayList<Pedido>();
	}

	public List<Pedido> getPedidos() {
		return pedidos;
	}

	public void novoPedido(Pedido pedido) {
		this.pedidos.add(pedido);
	}

	public void pedidoPronto(String nomePedido) {
		for (Pedido pedido : pedidos) {
			if (pedido.getNomePedido() == nomePedido) {
				pedidos.remove(pedido);
				break;
			}
		}
	}

	public void pedidosEmPreparo() {
		for (Pedido pedido : pedidos) {
			System.out.println("Pedidos em preparo: " + pedido.getNomePedido());
		}
	}
}
