package colecoes;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha {

	public static void main(String[] args) {
		
		Deque<String> Livros = new ArrayDeque<>();
		
		Livros.add("O pequeno principe");
		Livros.push("dom quixote");
		Livros.push("o hobbit");
		
		System.out.println(Livros.peek());
		System.out.println(Livros.element());

		System.out.println(Livros.pop());
		System.out.println(Livros.poll());
		System.out.println(Livros.poll());
		System.out.println(Livros.poll());
		System.out.println(Livros.poll());
		
		
		Livros.equals(Livros);
		//System.out.println(Livros.equals( ));
//		Livros.size(); // define o tamanho
//		Livros.clear();//Limpa fila
//		Livros.contains(); //contens

	}

}
