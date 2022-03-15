package oo.heranca.desafio;

public class Traker extends Carro implements Esportivo, Luxo {

	private boolean ligarTurbo;
	private boolean ligarAr;
	//private	boolean desligarTurbo;
	//private	boolean desligarAr;
	
	public Traker() {
		super(315);
	}

	public Traker(int velocidadeMaxima) {
		super(velocidadeMaxima);
		setDelta(15);
	}

	@Override
	public void ligarTurbo() {
		ligarTurbo = true;
		
	}

	@Override
	public void desligarTurbo() {
		@SuppressWarnings("unused")
	 boolean desligarTurbo = false;
	}

	@Override
	public void ligarAr() {
		ligarAr = true;
		
	}

	@SuppressWarnings("unused")
	@Override
	public void desligarAr() {
	boolean desligarAr = false;
		
	}

	@Override
	public int getDelta() {
		if (ligarTurbo && ! ligarAr) {
			return 35;
		}else if (ligarTurbo && ligarAr) {
			return 30;
		} else if (! ligarTurbo && !ligarAr) {
			return 20;
		}else
		return 15;
	}

}





//
//@Override
//public void acelerar() {
//	velocidadeAtual += 15;
//			