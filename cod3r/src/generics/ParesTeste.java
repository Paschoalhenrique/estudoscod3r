package generics;

public class ParesTeste {

	public static void main(String[] args) {
		Pares<Integer, String> resultadoConcurso = new Pares<>();
		
		resultadoConcurso.adicionar(1, "Maria");
		resultadoConcurso.adicionar(2, "Pedro");
		resultadoConcurso.adicionar(3, "Carla");
		resultadoConcurso.adicionar(4, "Bia");
		resultadoConcurso.adicionar(5, "Nada");
		
		System.out.println(resultadoConcurso.getValor(2));
	}

}
