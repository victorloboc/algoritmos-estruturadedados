package estruturadedados.exercicios.listaLigada;

import estruturadedados.alura.listaligada.Celula;

public class ListaDuplamenteLigada {

	private Celula primeira;
	private Celula ultima;
	private int totalDeElementos = 0;

	public void adiciona(int elemento) {
		Celula nova = new Celula(elemento);
		if (totalDeElementos == 0) {
			this.primeira = nova;
			this.ultima = nova;

			totalDeElementos++;

		} else {
			nova.setAnterior(this.ultima);
			this.ultima.setProximo(nova);
			this.ultima = nova;

			totalDeElementos++;
		}

	}

	public void inverter() {

		Celula temp = null;
		Celula atual = this.primeira;
		Celula primeira = this.primeira;
		Celula ultima = this.ultima;
		while (atual != null) {
						
			if (atual == primeira) {
				this.ultima = atual;
			}

			if (atual == ultima) {
				this.primeira = atual;
			}
			
			temp = atual.getAnterior();
			atual.setAnterior(atual.getProximo());
			atual.setProximo(temp);
			atual = atual.getAnterior();
		}
	}

	@Override
	public String toString() {
		Celula atual = this.primeira;
		String s = "[";
		while (atual != null) {
			s += atual.getElemento() + ", ";
			atual = atual.getProximo();
		}
		s += "]";
		return s;

	}

}
