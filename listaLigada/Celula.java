package estruturadedados.exercicios.listaLigada;

public class Celula {

	private int elemento;
	private Celula anterior;
	private Celula proximo;

	public Celula(int elemento) {
		this.elemento = elemento;
	}

	public Celula() {
	}

	public int getElemento() {
		return elemento;
	}

	public void setElemento(int elemento) {
		this.elemento = elemento;
	}

	public Celula getAnterior() {
		return anterior;
	}

	public void setAnterior(Celula anterior) {
		this.anterior = anterior;
	}

	public Celula getProximo() {
		return proximo;
	}

	public void setProximo(Celula proximo) {
		this.proximo = proximo;
	}

}
