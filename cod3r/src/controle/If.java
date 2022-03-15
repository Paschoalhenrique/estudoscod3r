package controle;

import java.util.Scanner;

public class If {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Informe a media: ");
		double media = sc.nextDouble();
		
		if(media <= 10 && media >= 7.0) {
			System.out.print("Aprovado,");
			System.out.println("Parabéns!");
		}
		if(media <7 && media >=4.5) {
			System.out.print("Recuperação!");
		}
		if(media < 4.5 && media>= 0 ) {
			System.out.print("Reprovador!");
		}
		
		sc.close();
	}
}
