package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class DesafioFilder {

	public static void main(String[] args) {
		
		Produto p1 = new Produto("lapis", 1.99, 0.12, 30);
		Produto p2 = new Produto("Notebook", 4899.89, 0.32, 0);
		Produto p3 = new Produto("Impressora", 1200, 0.40, 0);
		Produto p4 = new Produto("iPad", 310099, 0.29, 0);
		Produto p5 = new Produto("Relogio", 1900, 0.12, 0);
		Produto p6 = new Produto("Monitor", 800, 0.31, 0);
		Produto p7 = new Produto("Caneta", 2.99, 0.10, 20);
		
		List<Produto> produtos = Arrays.asList(p1, p2, p3, p4, p5, p6, p7);
		
		//filter, filter, map
		Predicate<Produto> superPromocao = p -> p.desconto >= 0.3;
		Predicate<Produto> freteGratis = p -> p.valorFrete ==0;
		Predicate<Produto> precoRelevante = p -> p.preco >= 500;
		
		Function<Produto, String> chamadaPromocional =
				p -> "Aproveitar " + p.nome + " por R$ " + p.preco;
		produtos.stream()
			.filter(superPromocao)
			.filter(freteGratis)
			.filter(precoRelevante)
			.map(chamadaPromocional)
			.forEach(System.out::println);
		

	}

}
