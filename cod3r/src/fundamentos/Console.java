package fundamentos;

import java.util.Scanner;

public class Console {

	public static void main(String[] args) {


	//	System.out.print("bom ");
	//	System.out.print("dia\n");
		
	//	System.out.println("bom");
	//	System.out.println("dia");
		
	//	System.out.printf("salario: %.1f%n", 1234,5678 );
		System.out.printf("Nome: %s%n", "ph");
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite seu nome:");
		String nome = entrada.nextLine();
		
		System.out.println("DIgite seu sobre nome:");
		String sobrenome = entrada.nextLine();
		
		System.out.println("Digite sua idade:");
		int idade = entrada.nextInt();
		
		System.out.printf("%s %s tem %d anos .%n", nome, sobrenome, idade);
		
		entrada.close();
		
		
		
	}

}
