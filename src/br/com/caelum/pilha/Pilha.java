package br.com.caelum.pilha;

import java.util.LinkedList;
import java.util.List;

public class Pilha {
	private List<Peca> pecas = new LinkedList<Peca>();
	
	public void insere(Peca peca) {
		this.pecas.add(peca);
		
	}
	
	public Peca remove() {
		return null;
	}
	
	public boolean vazia() {
		return true;
	}
	
	
}
