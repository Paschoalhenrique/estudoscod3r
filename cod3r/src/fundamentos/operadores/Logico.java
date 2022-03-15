package fundamentos.operadores;

import java.util.Scanner;

public class Logico {

	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		boolean condicao1 = true;
		boolean condicao2 = 3 > 7;
		
		System.out.println(condicao1 && !condicao2);
		System.out.println(condicao1 || condicao2);
		System.out.println(condicao1 ^ condicao2);
		System.out.println(!!condicao1 );
		System.out.println(!condicao1);
		
		///////////////////////////////////////////////////////////////
		System.out.println("Tabela verdade( AND)");
		System.out.println(true & true);
		System.out.println(true & false);
		
		///////////////////////////////////////////////////////////
		System.out.println("\nTabela verdade ou (OR)");
		System.out.println(true && false);
		System.out.println(true && false);
		
		///////////////////////////////////////////
		
		System.out.println("\nTabela verdade ou exclusiva(XOR)");
		System.out.println(true ^ true);
		System.out.println(true ^ false);
		System.out.println(false ^ true);
		System.out.println(false ^ false);
		
		//////////////////////////////////////////////////////
		System.out.println("\nTabela verdade NOT");
		System.out.println(!true);
		System.out.println(!false);
		
		entrada.close();
		
		
	}
}
