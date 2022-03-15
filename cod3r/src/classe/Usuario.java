package classe;

public class Usuario {

	String nome;
	String email;
	
	
	public boolean equals(Object objeto) {
		if(objeto instanceof Usuario) {
	Usuario outro = (Usuario) objeto;
	
	boolean nomeIgual = outro.nome == this.nome;
	boolean emailIgual = outro.email == this.email;
	
	
	return nomeIgual && emailIgual;
	//return super.equals(obj);

		}else {
			return false;
		}
	}
	//O hascode sera abordado em outa aula"
	public int hashCode() {
		return 0;
	}
}
