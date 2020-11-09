package br.com.caelum.ed;

import java.util.ArrayList;
import java.util.List;


public class TesteLinearVSConstante {

	public static void main(String[] args) {
		Vetor vetor = new Vetor();
		
		
		//ArrayList<Aluno> vetor = new ArrayList<Aluno>();
		
		long inicio = System.currentTimeMillis();
		
		for (int i = 1; i < 40000000; i++) {
			Aluno aluno = new Aluno();
			vetor.adicionar(aluno);
			//vetor.add(aluno);
		}
		
		long fim = System.currentTimeMillis();
		
		double tempo = (fim - inicio) / 1000;
		
		System.out.println("Tempo em segundos = " + tempo);						

	}
	
	

}
