package br.com.caelum.ed.vetoresbr.com.caelum.ed.vetores.testes;

import br.com.caelum.ed.vetores.Aluno;
import br.com.caelum.ed.vetores.Vetor;

public class TesteContemAluno {

	public static void main(String[] args) {
		Aluno a1 = new Aluno();
		Aluno a2 = new Aluno();
		
		a1.setNome("Rafael");
		a2.setNome("Paulo");
		
		Vetor lista = new Vetor();
		
		lista.adicionar(a1);
		lista.adicionar(a2);
		
		System.out.println(lista.contem(a1));
		System.out.println(lista.contem(a2));
		
		Aluno aluno = new Aluno();
		
		aluno.setNome("Ana");
		System.out.println(lista.contem(aluno));


	}

}
