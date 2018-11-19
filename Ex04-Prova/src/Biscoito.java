/*
Na fábrica de biscoitos PlicTech o sistema de gestão de alimentos controla os
ingredientes de cada tipo de biscoito, porém é um sistema manual. Vamos modelar
este sistema de maneira a automatizar parte dele.
Crie uma classe que represente um ingrediente, e que contém seu nome (String),
quantidade (double) e o tipo de medida (String). Da mesma forma, crie uma classe
que represente um biscoito, com seu nome e uma lista de ingredientes para o
mesmo. A classe biscoito deve ter um método para adicionar ingredientes em sua
lista de ingredientes, e também um método chamado receita() que imprime em
tela a lista de ingredientes e as quantidades. Por exemplo, a seguinte listagem é
impressa quando o teste abaixo é executado:
 */

import java.util.ArrayList;
import java.util.List;

public class Biscoito {

	private String nomeBiscoito;
	private List<Ingrediente> ingredientes;
	
	
	public Biscoito(String nomeBiscoito) {
		this.nomeBiscoito = nomeBiscoito;
		this.ingredientes = new ArrayList<Ingrediente>();
	}

	public String getNomeBiscoito() {
		return nomeBiscoito;
	}
	
	public List<Ingrediente> getIngredientes() {
		return ingredientes;
	}
	
	public void adicionarIngredientes(Ingrediente ingrediente) {
		this.ingredientes.add(ingrediente);
	}
	
	public void receita() {
		System.out.println("[Listagem]");
		for (Ingrediente ingrediente : ingredientes) {
			System.out.println(ingrediente.getNome() + " " +
					ingrediente.getQuantidade() + " " +
					ingrediente.getTipoDeMedida());
		}
	}
}
