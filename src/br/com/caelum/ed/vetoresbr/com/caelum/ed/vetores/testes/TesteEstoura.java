package br.com.caelum.ed.vetoresbr.com.caelum.ed.vetores.testes;

import br.com.caelum.ed.vetores.Aluno;
import br.com.caelum.ed.vetores.Vetor;

public class TesteEstoura {

	public static void main(String[] args) {
		Vetor vetor = new Vetor();
		
		System.out.println(vetor.tamanhoVetor()); 
		
		for (int i = 0; i < 100002; i++) {
			Aluno aluno = new Aluno();
			vetor.adicionar(aluno);
			}

	
		System.out.println(vetor.tamanhoVetor());
	
	}
}
