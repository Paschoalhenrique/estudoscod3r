package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class DesafioMap {

	public static void main(String[] args) {
		
		
		List<Integer>nums = Arrays.asList(1,2,3,4,5,6,7,8,9);
//		1. Numero para string binaria... 6=> "110"
//		2. Inverter a string ..."11"=> "011"
//		3. converter de volta para inteiro =>"011" =>3

		UnaryOperator<String> inverter =
				s -> new StringBuilder(s).reverse().toString();//deniindo lambda 
		
		Function<String, Integer> binarioParaInt = 
				s -> Integer.parseInt(s, 2);// recebi um passando 2 paramentros
				
		nums.stream() //oparaçao de build contrução
		.map(Integer::toBinaryString)// converter string chamada metodo
		.map(inverter)//converter
		.map(binarioParaInt )
		.forEach(System.out::println); // operação de imprimir no console
		

	}

}
