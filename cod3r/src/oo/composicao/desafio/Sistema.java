package oo.composicao.desafio;

public class Sistema {

	public static void main(String[] args) {
		
		
		
		Compra compra1 = new Compra();
		compra1.adicicionarItem("Caneta", 1, 100);
		compra1.adicionarItem(new Produto("Notebook", 2000), 2);

		
		Compra compra2 = new Compra();
		compra2.adicicionarItem("Caderno", 10, 10);
		compra2.adicionarItem(new Produto("Impressora", 1000), 1);
		
		
		Cliente cliente = new Cliente("Maria julia moraes");
		cliente.compra.add(compra1);
		cliente.compra.add(compra2);
		
		System.out.println(cliente.obterValorTotal());
		
	}

}
