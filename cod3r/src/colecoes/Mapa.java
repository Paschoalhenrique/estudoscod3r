package colecoes;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Mapa {
	
	public static void main(String[] args) {
		
		Map<Integer, String> Usuarios = new HashMap<>();
		Usuarios.put(1, " Paschoal");
		Usuarios.put(20, " fabio");
		Usuarios.put(3, " Henri");
		Usuarios.put(4, " nanda");
		
		System.out.println(Usuarios.size());
		System.out.println(Usuarios.isEmpty());
		
		System.out.println(Usuarios.keySet());
		System.out.println(Usuarios.values());
		System.out.println(Usuarios.entrySet());
		
		System.out.println(Usuarios.containsKey(20));
		System.out.println(Usuarios.containsValue("Ph"));
		
		System.out.println(Usuarios.get(4));
		
				
		for (int chave: Usuarios.keySet()) {
				System.out.println(chave);
			}
		for (String valor: Usuarios.values()) {
			System.out.println(valor);
		}
		for(Entry<Integer, String> registo: Usuarios.entrySet()) {
			System.out.println(registo.getKey()+ "==>");
			System.out.println(registo.getValue());
		
	}
}
}
 
		
		
		
		
	