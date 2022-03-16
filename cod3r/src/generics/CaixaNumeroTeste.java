package generics;

public class CaixaNumeroTeste {

	public static void main(String[] args) {
		
		//caixa A doublr ponto flutuante
		CaixaNumero<Double> caixaA = new CaixaNumero<Double>();
		caixaA.guardar(2.3);		
		System.out.println(caixaA.abrir());
		
		//caixa B inteiro 
		CaixaNumero<Integer> caixaB = new CaixaNumero<>();
		caixaB.guardar(123);		
		System.out.println(caixaB.abrir());
	}

}
