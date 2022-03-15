package lambdas;

@FunctionalInterface
public interface Calculo {

	public double executar (double a, double b);
	
	default String Legal() {
		return "Legal";
	}
	
	static String muitoLegal() {
		return "muito legal";
	}
	                      
}
