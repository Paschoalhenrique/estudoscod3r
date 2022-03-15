package controle;

import java.util.Scanner;

public class IfElseIf {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a nota: ");
		double nota = sc.nextDouble();
		if(nota > 10|| nota <0) {
			System.out.println("nota invalida");
		}else {
			if(nota >= 8.1) {
				System.out.println("Conceito A");
			}
		}
		
		
		
		sc.close();
		
		
		
	}
	
	
}
