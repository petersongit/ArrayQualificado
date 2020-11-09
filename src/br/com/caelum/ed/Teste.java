package br.com.caelum.ed;

import java.util.ArrayList;

public class Teste {

	public static void main(String[] args) {		
		ArrayList<Aluno> vetorSemGenerics = new ArrayList<Aluno>(); 
		//ArrayList<Aluno> vetorComGenerics = new ArrayList<Aluno>();
		
		Aluno aluno1 = new Aluno();
		Aluno aluno2 = new Aluno();
		Aluno aluno3 = new Aluno();

		
		//aluno1.setNome("Joao");
		System.out.println(aluno1);
		
		vetorSemGenerics.add(aluno1);
		vetorSemGenerics.add(aluno2);
		vetorSemGenerics.add(0, aluno3);
		
		

		aluno1.setNome("primeiro");
		aluno2.setNome("segundo");
		aluno3.setNome("terceiro");
					
		int tamanho = vetorSemGenerics.size();		
		
		
		if (tamanho != 3) {
			System.out.println("ERRO: O tamanho da lista está errado.");
		}
		

		if (!vetorSemGenerics.contains(aluno1)) {
			System.out.println("ERRO: Não achou um aluno que deveria estar na lista");
		}

		
		vetorSemGenerics.remove(0);
		tamanho = vetorSemGenerics.size();
		
		//vetorSemGenerics.forEach(a -> System.out.println(a.getNome()));
		
		if (tamanho != 2) {
			System.out.println("ERRO: O tamanho da lista esta errado.");
		}
		
		if (vetorSemGenerics.contains(aluno3)) {
			System.out.println("ERRO: Achou um aluno que não deveria estar na lista");
		}
	}

}
