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

public class Ingrediente {

	private String nome;
	private double quantidade;
	private String tipoDeMedida;
	
	public Ingrediente(String nome, double quantidade, String tipoDeMedida) {
		this.nome = nome;
		this.quantidade = quantidade;
		this.tipoDeMedida = tipoDeMedida;
	}

	public String getNome() {
		return nome;
	}

	public double getQuantidade() {
		return quantidade;
	}

	public String getTipoDeMedida() {
		return tipoDeMedida;
	}
	
	
}
