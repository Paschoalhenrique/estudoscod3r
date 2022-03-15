package controle;

import javax.swing.JOptionPane;

public class IfElse {

	
	public static void main(String[] args) {
		
		System.out.println();
		String valor = JOptionPane.showInputDialog("Informe o numero: ");
		int numero = Integer.parseInt(valor);
		
		if(numero % 2 == 0) {
			System.out.println("Número par");
		}
		if(numero % 2 == 1) {
			System.out.println("Número Impar");
			
		}
	}
}
