package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {

	public static void main(String[] args) {
		
		Queue<String> fila = new LinkedList<>();
		
		//Offer e add -> adicionam elementos na fila 
		//Diferença é o comportamento ocorre quando a fila esta cheia
		fila.add("ana"); // restona null
		fila.add("bia"); //lança exception
		fila.add("carlos");
		fila.add("sandra");
		fila.add("rafa");
		fila.add("gui");
		
		//Peek e element -> obter o proximo elemento da fila (sem remover)	
		//diferença é o comportamento ocorre quanmdo a fila esta vazia !
		System.out.println(fila.peek()); //retorna null
		System.out.println(fila.peek());
		System.out.println(fila.element());// lança Exception
		System.out.println(fila.element());
		
		//fila.size()
		//fila.clear();
		//fila.isEmpty();
		System.out.println(fila.poll());
		System.out.println(fila.remove());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.remove());
		
	}

}
