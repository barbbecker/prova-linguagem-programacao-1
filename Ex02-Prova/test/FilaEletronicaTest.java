import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class FilaEletronicaTest {

	@Test
	public void testaProximo() {
		FilaEletronica fila = new FilaEletronica();
		fila.proximo();
		fila.proximo();
		
		int ordem = fila.proximo();
		assertEquals(3, ordem);
		
	}
}
