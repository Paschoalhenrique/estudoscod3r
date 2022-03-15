package fundamentos;

public class Temperatura {

	
	public static void main(String[] args) {
		
		double FATOR = 5.0/9.0;
		double AJUSTE = 32;
		
		double fahrenheit = 86;
		double celsius = (fahrenheit - AJUSTE) * FATOR;
		System.out.println("O resultado é: " + celsius + "°C");
		System.out.println("============================");
		
		fahrenheit = 0;
		celsius = (fahrenheit - AJUSTE);
		
		System.out.println("Resultado é " + celsius + "°C.");
		
	}
}
