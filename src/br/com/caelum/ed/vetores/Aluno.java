package br.com.caelum.ed.vetores;

public class Aluno {
	private String nome;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public String toString() {
		return this.nome;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		return result;
	}

	/*@Override
	public boolean equals(Object obj) {
		System.out.println(obj);
		
		Aluno outro = (Aluno) obj;
		return this.nome.equals(outro.nome);
	}*/


	
}
