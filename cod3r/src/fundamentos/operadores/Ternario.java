package fundamentos.operadores;

public class Ternario {

	public static void main(String[] args) {
		
		double media = 7.5;
		String resultadoFInal = media >= 5.0? "aprovado." : "em recuperação.";
		System.out.println("O aluno esta "+ resultadoFInal );
		
 
		double nota = 4.6;
		boolean bomComportamento = true;
		boolean passouPorMedia = nota >= 5.0;
		boolean temDesconto = bomComportamento && passouPorMedia;
		String resultado = temDesconto ? "sim." : "não.";
		
		System.out.printf("tem desconto? %s", resultado);
		
		
	}
}
