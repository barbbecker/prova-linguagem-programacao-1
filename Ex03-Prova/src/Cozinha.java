import java.util.ArrayList;
import java.util.List;

/*
Al�m de automatizar seu sistema de fila, a cafeteria tamb�m quer melhorar o
funcionamento da cozinha. Crie uma classe chamada Cozinha que tem uma lista de
pedidos a serem feitos. Essa lista deve ser implementada utilizando a classe List do
Java, e os pedidos podem ser considerados como uma String (ou seja, um
List<String>).
A classe Cozinha deve ter um m�todo novoPedido(String pedido) para
adicionar um prato/pedido a ser feito, e um m�todo pedidoPronto(String
prato) para retirar o prato/pedido da lista quando estiver pronto. Al�m disto, deve
ter um m�todo chamado pedidosEmPreparo() que retorna uma lista de
pratos/pedidos que ainda est�o sendo preparados.
Crie testes para os tr�s m�todos em quest�o.
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
