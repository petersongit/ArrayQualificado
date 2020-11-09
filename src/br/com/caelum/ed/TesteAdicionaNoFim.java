package br.com.caelum.ed;

public class TesteAdicionaNoFim {

	public static void main(String[] args) {
		Aluno a1 = new Aluno();
		Aluno a2 = new Aluno();
		Aluno a3 = new Aluno();
		Aluno a5 = new Aluno();
		
		Vetor alunos = new Vetor();
		
		
		a1.setNome("Peterson");
		a2.setNome("Vanessa");
		a3.setNome("Guilherme");
		a5.setNome("Pedro");
		
		
		
		alunos.adicionar(a1);
		alunos.adicionar(a2);
		alunos.adicionarPosicao(2, a3);
		alunos.remove(0);
		
		
		//Aluno a4 = alunos.pega(0);
		
//		System.out.println(a4);
		
		
		System.out.println(alunos);
		
		//alunos.remove(5);
		System.out.println(alunos);
		
		System.out.println(alunos.contem(a2));
		
		System.out.println(alunos.tamanho());
		
		
	}

}
