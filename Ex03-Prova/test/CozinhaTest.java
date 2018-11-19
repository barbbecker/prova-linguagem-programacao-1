import org.junit.Test;

public class CozinhaTest {

	@Test
	public void testaMetodos() {
		Pedido salmao = new Pedido("Salmao");
		Pedido massa = new Pedido("Massa");
		Pedido batata = new Pedido("Batata Frita");
		Pedido frango = new Pedido("Frango");

		Cozinha cozinha = new Cozinha();
		
		cozinha.novoPedido(salmao);
		cozinha.novoPedido(massa);
		cozinha.novoPedido(batata);
		cozinha.novoPedido(frango);
		
		cozinha.pedidoPronto("Massa");
		cozinha.pedidosEmPreparo();
	}
}
