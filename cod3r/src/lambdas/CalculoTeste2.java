package lambdas;

import java.util.function.BinaryOperator;

public class CalculoTeste2 {

	public static void main(String[] args) {
		
		// ñ permiteint -> doble
		//Double a= 1.0;
		//double 
		
		BinaryOperator<Double> calc = (x,y ) -> {return x + y;	};
		System.out.println(calc.apply(2.0, 3.0));

		calc = (x, y) -> x*y;
		System.out.println(calc.apply(2.0, 3.0));
		
		
		BinaryOperator<Integer> calc2 = (x,y ) -> {return x + y;	};
		System.out.println(calc2.apply(2, 3));

		calc = (x, y) -> x*y; 
		
		System.out.println(calc2.apply(2, 3));
		
//		calc = (x, y )-> x-y;
//		System.out.println(calc.apply(2, 3));
		
//		System.out.println(calc.Legal());
//		System.out.println(Calculo.muitoLegal());
	}

}
