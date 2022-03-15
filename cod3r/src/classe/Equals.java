package classe;

public class Equals {
	public static void main(String[] args) {
		
		Usuario u1 = new Usuario();
		u1.nome = "Paschoal Henriquee";
		u1.email = "paschoaldutra@hotmail.com";
		
		Usuario u2 = new Usuario();
		u2.nome = "Paschoal Henrique";
		u2.email = "paschoaldutra@hotmail.com";
		
		System.out.println(u1 == u2);
		System.out.println(u1.equals(u2));
		System.out.println(u2.equals(u1));
		System.out.println(u2.equals(u2));
	
		//System.out.println(u2.equals(new Data()));
	}

}
