package fundamentos;

import java.util.Scanner;

public class Wrapper {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);

		
		// byte
		Byte b = 100;
		Short s = 1000;
		Integer i = 1000;// int
		long l = 10000L;
		
		System.out.println(b.byteValue());
		System.out.println(s.toString());
		System.out.println(i*3);
		System.out.println(l/3);
		
		Float f = 123.10F;
		System.out.println(f);
		
		Double d = 1234.5678;
		System.out.println(d);
		
		Boolean bo = Boolean.parseBoolean("True");
		System.out.println(bo);
		System.out.println(bo.toString().toUpperCase());
		
		Character c = '#'; // char
		System.out.println(c + "....");
		
		
		entrada.close();
		

	}

}
