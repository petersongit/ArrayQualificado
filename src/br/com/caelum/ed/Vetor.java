package br.com.caelum.ed;

public class Vetor {
	private Aluno objetos[] = new Aluno[100];
	private int posLivre = 0;
	private int totalDeAlunos = 0;

	public void adicionar(Aluno aluno) {
		/*for (int i = 0; i < this.objetos.length; i++) {
			if (this.objetos[i] == null) {
				this.objetos[i] = aluno;
				break;
			}
		}*/

		this.garantaEspaco();
		objetos[posLivre] = aluno;
		this.posLivre++;
		this.totalDeAlunos++;
	}

	public void adicionarPosicao(int posicao, Aluno aluno) {
		this.garantaEspaco();
		if (!posicaoOcupada(posicao)) {
			throw new IllegalAccessError("Posição inválida");
		}

		
		for (int i = (this.totalDeAlunos - 1); i >= posicao; i--) {
			objetos[i + 1] = objetos[i];
		}
		
		objetos[posicao] = aluno;
		this.totalDeAlunos++;
	}

	public Aluno pega(int posicao) {
		if (!this.posicaoValida(posicao)) {
			throw new IllegalAccessError("Posição inválida");
		}

		return this.objetos[posicao];
	}

	public void remove(int posicao) {
		if (!this.posicaoValida(posicao)) {
			throw new IllegalAccessError("Posição inválida");
		}		
		
		for (int i = posicao; i < (this.totalDeAlunos - 1); i++) {
			objetos[i] = objetos[i + 1];	
		}

		this.totalDeAlunos--;
		
	}

	public boolean contem(Aluno aluno) {
		for (int i = 0; i < this.totalDeAlunos; i++) {
			if (this.objetos[i] == aluno) {
				return true;
			}
		}

		return false;

	}

	public int tamanho() {
		return totalDeAlunos;
	}

	@Override
	public String toString() {
		if (this.totalDeAlunos == 0) {
			return "[]";
		}

		StringBuilder builder = new StringBuilder();
		builder.append("[");

		for (int i = 0; i < this.totalDeAlunos - 1; i++) {
			builder.append(this.objetos[i]);
			builder.append(", ");
		}

		builder.append(this.objetos[this.totalDeAlunos - 1]);
		builder.append("]");

		return builder.toString();

		// return Arrays.toString(alunos);
	}

	private boolean posicaoOcupada(int posicao) {
		return posicao >= 0 && posicao <= this.totalDeAlunos;
	}

	private boolean posicaoValida(int posicao) {
		return posicao >= 0 && posicao + 1 < this.totalDeAlunos;
	}

	private void garantaEspaco() {
		if (this.totalDeAlunos == this.objetos.length) {
			Aluno arrayNovo[] = new Aluno[this.objetos.length * 2];
			
			for (int i = 0; i < this.objetos.length; i++) {
				arrayNovo[i] = objetos[i];				
			}
			
			objetos = arrayNovo;
		}		
	}
}
