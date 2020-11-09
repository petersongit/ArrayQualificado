package br.com.caelum.ed.vetoresbr.com.caelum.ed.vetores.testes;

import br.com.caelum.ed.vetores.Aluno;
import br.com.caelum.ed.vetores.Vetor;

public class TesteRemove {

	public static void main(String[] args) {
		Aluno a1 = new Aluno();
		Aluno a2 = new Aluno();
		
		a1.setNome("Petrson");
		a2.setNome("Maria");
		
		Vetor lista = new Vetor();
		
		
		
		lista.adicionar(a1);
		lista.adicionar(a2);
		
		System.out.println(lista);
		
		lista.remove(1);
		
		System.out.println(lista);
			
		
	}

}

