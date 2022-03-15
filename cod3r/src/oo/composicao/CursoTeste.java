package oo.composicao;

public class CursoTeste {

	public static void main(String[] args) {
		
		Aluno aluno1 = new Aluno("Paschoal");
		Aluno aluno2 = new Aluno("Henrique");
		Aluno aluno3 = new Aluno("Dutra");
				
		Curso curso1 = new Curso("Java completo");
		Curso curso2 = new Curso("Java web");
		Curso curso3 = new Curso("React nativo");

		curso1.adicionarAluno(aluno1);
		curso1.adicionarAluno(aluno2);
		
		curso2.adicionarAluno(aluno1);
		curso2.adicionarAluno(aluno3);
		curso2.adicionarAluno(aluno2);
		curso2.adicionarAluno(aluno3);
//		curso3.adicionarAluno(aluno2);
//		curso3.adicionarAluno(aluno1);
		
		aluno1.adicionarCurso(curso3);
		aluno2.adicionarCurso(curso3);
		aluno3.adicionarCurso(curso3);
		aluno3.adicionarCurso(curso2);
		
		for (Aluno aluno: curso3.alunos) {
			System.out.println("Estou matriculado no curso 1 " 
		+ curso3.nome + "...");
			System.out.println("...e o meu nome é " + aluno.nome);
			System.out.println();
			//System.out.println("Curso " + curso2.nome);
		}
		
		System.out.println(aluno1.cursos.get(0).alunos);
		Curso cursoEncontrado = aluno1.obterCursoPorNome("Java completo");
		if(cursoEncontrado != null) {
			System.out.println(cursoEncontrado.nome);
			System.out.println(cursoEncontrado.alunos);
		}
	}

}
