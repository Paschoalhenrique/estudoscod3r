package padroes.observer;

public class AniversarioSurpresa {

	public static void main(String[] args) {
	
		Namorada namorada = new Namorada();
		Porteiro porteiro = new Porteiro();
		
		porteiro.registarobservador(namorada);
		porteiro.registarobservador(e -> {
			
		System.out.println("Surpresa via lampada!");
		System.out.println("Ocorreu em:" + e.getMomento());
		});
		porteiro.monitorar();

	}

}
