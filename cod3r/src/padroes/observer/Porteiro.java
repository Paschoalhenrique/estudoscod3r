package padroes.observer;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Porteiro {

	private List<ObservadorChegadaAniversariante> observadores
	= new ArrayList<>();

	public void registarobservador(
			ObservadorChegadaAniversariante observador) {
		observadores.add(observador);
	}

	public void monitorar() {
		Scanner sc = new Scanner(System.in);
		
		String valor = " ";

		while (!"sair".equalsIgnoreCase(valor)) {
			
			System.out.print("Aniversariante chegou!");
			valor = sc.nextLine();

			if ("sim".equalsIgnoreCase(valor)) {
				//criar o evento
				EventoChegadaAniversariante evento = 
						new EventoChegadaAniversariante(new Date());
			
			observadores.stream()
				.forEach(o-> o.chegou(evento));
			//notificar os observadores!
			} else {
				System.out.println("Alarme falso!");
			}
		}
		sc.close();
	}

}
