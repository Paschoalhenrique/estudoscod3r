package colecoes;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class ConjuntoComportado {

	//@SuppressWarnings("unlikely-arg-type")
	public static void main(String[] args) {
		Set<String> listaAprovados = new TreeSet<>();
		listaAprovados.add("Fernanda");
		listaAprovados.add("Paschoal");
		listaAprovados.add("Henrique");
		listaAprovados.add("Dutra");	
		listaAprovados.add("lindos");
		//listaAprovados.remove(listaAprovados);
		
		for (String candidato: listaAprovados) {
		System.out.println(candidato); 
	}
		Set<Integer> nums = new HashSet<>();
		nums.add(1);
		nums.add(10);
		nums.add(120);
		nums.add(30);	
		nums.add(22);
		for(int n: nums) {
			System.out.println(n);
		}
	
}
	
}
