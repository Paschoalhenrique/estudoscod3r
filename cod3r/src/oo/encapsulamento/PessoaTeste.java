package oo.encapsulamento;

public class PessoaTeste {

	public static void main(String[] args) {
		
		Pessoa p1 = new Pessoa("Paschoal", "Henrique", 41);
		p1.setIdade(230);
		// p1.idade =- 30; // alterar a variavel
		
		
		System.out.println(p1.getIdade()); //ler atributos da variavel
		System.out.println(p1);
		System.out.println(p1.getNomeCompleto());
		
	}

}
