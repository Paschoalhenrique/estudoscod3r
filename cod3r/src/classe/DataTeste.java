package classe;

public class DataTeste {

	public static void main(String[] args) {
		
		Data d1 = new Data();
		Data  d2 = new Data(31,12,2021);
		
		String dataFormara1 = d1.obterDataFormatada();
		
		
		System.out.println(dataFormara1);
		System.out.println(d2.obterDataFormatada());
		d1.imprimirDataFormatada();
		d2.imprimirDataFormatada();
		
	}
	
}
