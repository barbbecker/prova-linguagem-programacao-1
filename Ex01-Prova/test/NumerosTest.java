import org.junit.Test;

public class NumerosTest {

	@Test
	public void testarImprimeNumerosPares() {
		Numeros numero = new Numeros();
		
		numero.imprimeNumerosPares(10);
		numero.imprimeNumerosPares(15);
		numero.imprimeNumerosPares(4);
	}
}
