import org.junit.Test;

public class BiscoitoTest {

	@Test
	public void testaReceita() {
		Ingrediente agua = new Ingrediente("Agua", 1000.0, "ml");
		Ingrediente farinha = new Ingrediente("Farinha", 100.0, "gr");
		Ingrediente acucar = new Ingrediente("Acucar", 500.0, "gr");
		Ingrediente fermento = new Ingrediente("Fermento", 20.0, "gr");
		
		Biscoito plic = new Biscoito("Plic-Tech");
		plic.adicionarIngredientes(agua);
		plic.adicionarIngredientes(farinha);
		plic.adicionarIngredientes(acucar);
		plic.adicionarIngredientes(fermento);
		plic.receita();
	}
}