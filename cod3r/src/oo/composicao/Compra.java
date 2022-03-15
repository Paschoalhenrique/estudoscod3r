package oo.composicao;

import java.util.ArrayList;

public class Compra {

	String cliente;
	final ArrayList<Item> itens = new ArrayList<Item>();

	void adicionarItem(Item item) {
		itens.add(item);
		item.compra = this;
	}	
	
	double obterValorTotal() {
		double total = 0;
		
		 for (Item item: itens) {
			 total += item.quantidade * item.preco;
		 }
		
		return total;
	}

	//	public void adicionarItem(String string, int i, double d) {
//		// TODO Auto-generated method stub
//		
//	}
	
}
