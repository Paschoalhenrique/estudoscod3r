package excecao.personalizadaB;

//import excecao.Aluno;

public class TesteValidacoes {

	public static void main(String[] args) {

		try {
			//Aluno aluno = new Aluno("PH", 7);
			//Validar.aluno(aluno);
		} catch (NumeroForaIntervaloException e) {
			System.out.println(e.getMessage());

		}
	}
}
