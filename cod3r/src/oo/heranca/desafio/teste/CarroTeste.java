package oo.heranca.desafio.teste;

import oo.heranca.desafio.Carro;
import oo.heranca.desafio.Civic;
import oo.heranca.desafio.Traker;

public class CarroTeste {

	public static void main(String[] args) {
		
		Carro c1 = new Civic();
		
		c1.acelerar();
		System.out.println(c1);
		
		c1.acelerar();
		System.out.println(c1);
		
		c1.acelerar();
		System.out.println(c1);
		
//		c1.acelerar();
//		System.out.println(c1);
		
		Traker c2 = new Traker(400);
		c2.ligarTurbo();
		
		
		c2.acelerar();
		c2.frear();
		System.out.println(c2);

		c2.acelerar();
		 c2.frear();
		System.out.println(c2);
		
		c2.acelerar();
		System.out.println(c2);

	}

}
