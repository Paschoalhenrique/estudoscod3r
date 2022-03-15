package fundamentos.operadores;

public class DesafiosLogicos {

	public static void main(String[] args) {
		
		//trabalho na terça (V ou F)
		//trabalho na quinta (V ou F)
		
		boolean trab1 = false;
		boolean trab2 = false;
		
		boolean comprouTV50 = trab1 && trab2;
		boolean comprouTV32 = trab1 ^ trab2;
		boolean comprouSorvete = trab1 || trab2;
		
		//Operador unário
		boolean maisSaudavel = !comprouSorvete;
		
		System.out.println("comprou TV 50\" ? " + comprouTV50 );
		System.out.println("comprou TV 32 \" ? " + comprouTV32);
		System.out.println("comprou sorvete ?" + comprouSorvete);
		System.out.println("comprou sorvete ?" + maisSaudavel);
		
		
		
		
	}
	
}
