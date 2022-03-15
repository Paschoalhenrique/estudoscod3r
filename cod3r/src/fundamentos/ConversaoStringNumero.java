package fundamentos;

import javax.swing.JOptionPane;

public class ConversaoStringNumero {

	public static void main(String[] args) {
		
		
		String valor1 = JOptionPane.showInputDialog("Digite o primeiro numero");
		String valor2 = JOptionPane.showInputDialog("Digite o segundo numero");
		String valor3 = JOptionPane.showInputDialog("Digite terceiro numero");
		
		System.out.println(valor1 + valor2);
		double numero1 = Double.parseDouble(valor1);
		double numero2 = Double.parseDouble(valor2);
		double numero3 = Double.parseDouble(valor3);
		
		//String resultado = resultado;
		
		
		double soma = numero1 + numero2 + numero3;
		System.out.println("total é " + soma);
		System.out.println("Soma é " + soma);
		System.out.println("Média é " + soma / 2);
		//System.out.println("Resultado: "  + resultado);
		
		
	}
}
