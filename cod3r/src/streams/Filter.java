package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class Filter {

	public static void main(String[] args) {
		
		Aluno a1 = new Aluno("ana", 7.0);
		Aluno a2 = new Aluno("paula", 7.2);
		Aluno a3 = new Aluno("sandra", 7.4);
		Aluno a4 = new Aluno("camila", 4.0);
		Aluno a5 = new Aluno("beth", 5.0);
		Aluno a6 = new Aluno("ph", 6.0);
		Aluno a7 = new Aluno("nanda", 9.0);
		
		List<Aluno>alunos = Arrays.asList(a1, a2, a3, a4, a5, a6, a7);


		Predicate<Aluno> aprovado = a -> a.nota >=7;
		Function<Aluno, String>saudacaoAprovado=
				a -> "Parabéns " + a.nome + "! Você foi aprovado(a)!";
		
				alunos.stream()
				.filter(aprovado)
				.map(saudacaoAprovado)
				.forEach(System.out::println);
				

	}

}
