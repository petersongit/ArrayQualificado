package br.com.caelum.ed.listaligada;

public class ListaLigada {
	private Celula primeira;
	private Celula ultima;
	private int totalDeElementos;
	
	public void adiciona(Object elemento) {
		Celula nova = new Celula(this.primeira, elemento);
		this.primeira = nova;
	
		if(this.totalDeElementos == 0){
			// caso especial da lista vazia
			this.ultima = this.primeira;
		}
		
			this.totalDeElementos++;		
	}

	


	public void adiciona(int posicao, Object elemento) {}
	public Object pega(int posicao) {return null;}
	public void remove(int posicao){}
	public int tamanho() {return 0;}
	public boolean contem(Object o) {return false;}

	public void adicionaNoComeco(Object elemento) {}
	public void removeDoComeco() {}
	public void removeDoFim() {}

}
