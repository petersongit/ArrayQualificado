package br.com.caelum.ed.vetoresbr.com.caelum.ed.vetores.testes;

import br.com.caelum.ed.vetores.Aluno;
import br.com.caelum.ed.vetores.Vetor;

public class TestePega {

	public static void main(String[] args) {
		Aluno a1 = new Aluno();
		
		a1.setNome("Rafael");
		
		Vetor lista = new Vetor();
		
		lista.adicionar(a1);
		
		lista.pega(0);
		lista.pega(1);
		lista.pega(100000000);

	}

}
