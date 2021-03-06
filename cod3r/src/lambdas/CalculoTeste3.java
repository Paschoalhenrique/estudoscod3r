package lambdas;

public class CalculoTeste3 {

	public static void main(String[] args) {
		
		Calculo calc = (x,y ) -> {return x + y;	};
		System.out.println(calc.executar(2, 3));

		calc = (x, y) -> x*y;
		System.out.println(calc.executar(2, 3));
		
		calc = (x, y )-> x-y;
		System.out.println(calc.executar(3, 4));
		
		System.out.println(calc.Legal());
		System.out.println(Calculo.muitoLegal());
	}

}
