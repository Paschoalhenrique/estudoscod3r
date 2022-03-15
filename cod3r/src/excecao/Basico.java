package excecao;

public class Basico {

	public static void main(String[] args) {

	
		
		try {
	
			System.out.println(7/0);
		} catch (Exception execucao) {
			System.out.println("Ocorreu um erro no momenro "
					+ "de imprimir o nome do usurio");
			
		}
	}
}



