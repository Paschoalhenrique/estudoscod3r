package excecao;

import java.util.ArrayList;
import java.util.List;

public class Aluno {

	public final String nome;
	public final List<Aluno> cursos = new ArrayList<>();
	private Object aluno;

	Aluno(String nome, int i) {
		this.nome = nome;
	}

	@SuppressWarnings("unchecked")
	void adicionarCurso(Aluno aluno) {
		this.cursos.add(aluno);
		((List<Aluno>) aluno.aluno).add(this);
		}
	Aluno obterCursoPorNome(String nome) {
		for(Aluno aluno: this.cursos) {
			if (aluno.nome.equalsIgnoreCase(nome)) {
				return aluno;
			}
		}
		
		return null;
	}
	
		public String toString() {
			return "Meu nome e " + nome + " curso ";
		}
	}
	

