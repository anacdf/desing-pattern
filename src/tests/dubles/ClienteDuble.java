package tests.dubles;

import com.company.Genero;

public class ClienteDuble {
	 private String nome;
	    private String cpf;
	    private int idade;
	    private Genero genero;
	    private boolean socio;

	    public ClienteDuble(String nome, String cpf, int idade, Genero genero, boolean socio) {
	        this.nome = nome;
	        this.cpf = cpf;
	        this.idade = idade;
	        this.genero = genero;
	        this.socio = socio;
	    }

	    public String getNome() {
	        return nome;
	    }


	    public String getCpf() {
	        return cpf;
	    }


	    public int getIdade() {
	        return idade;
	    }


	    public Genero getGenero() {
	        return genero;
	    }


	    public boolean isSocio() {
	    	if(socio) {
	    		return true;
	    	}return false;
	    }

		@Override
		public String toString() {
			return "Cliente [nome=" + nome + ", cpf=" + cpf + ", idade=" + idade + ", genero=" + genero + ", socio=" + socio
					+ "]";
		}
	    
}
