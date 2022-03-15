package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Matriz {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Quantos Alunos?");
		int qtdeAlunos = sc.nextInt();

		System.out.print("Quantas notas po r aluno?");
		int qtdeNotas = sc.nextInt();

		double[][] notaDaTurma = new double[qtdeAlunos][qtdeNotas];

		double total = 0;
		for (int a = 0; a < notaDaTurma.length; a++) {
			for (int n = 0; n < notaDaTurma[a].length; n++) {
				System.out.printf("Informe a nota %d do aluno %d:", n + 1, a + 1);
				notaDaTurma[a][n] = sc.nextDouble();
				total += notaDaTurma[a][n];

			}
		}
		double media = total / (qtdeAlunos * qtdeNotas);
		System.out.println("Média da  turma é " + media);
		
		
		for(double[] notasDoAluno: notaDaTurma) {
		System.out.println(Arrays.toString(notasDoAluno));
		}
		sc.close();
	}

}
