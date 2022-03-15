package classe;

public class ValorVsReferencia {

	public static void main(String[] args) {
		
		double a = 2;
		double b = a; //atricuição por valor (TipoPrimitivo)
		
		a++;
		b--;
		
		System.out.println(a + "," + b);
		
		Data d1 = new Data(1, 6, 2022);
		Data d2 = d1; //atribuição por referencia (Objeto)
		
		d1.dia = 31;
		d2.mes = 12;
		System.out.println(d1.obterDataFormatada());
		System.out.println(d2.obterDataFormatada());
		
		voltareDataParaValorPadrao(d1);
		System.out.println(d1.obterDataFormatada());
		System.out.println(d2.obterDataFormatada());

		
		int c = 5;
		alterarPrimitico(c);
		System.out.println(c);
	}

	 static void alterarPrimitico(int c) {
				 
		
	}

	private static void voltareDataParaValorPadrao(Data d) {
	 d.dia = 1;
	 d.mes = 1;
	 d.ano = 1980;
	 
		
	}
	static void alterarPrimitivo(int a) {
		a++;
	}
	static void alterarprimitivo(int b) {
		b++; //teste de alteração de primitivos em java
	}

}
