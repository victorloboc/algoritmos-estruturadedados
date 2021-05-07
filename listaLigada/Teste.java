package estruturadedados.exercicios.listaLigada;

public class Teste {
	public static void main(String[] args) {
		ListaDuplamenteLigada lista = new ListaDuplamenteLigada();
			
		for(int i = 1; i <= 4; i++) {
			lista.adiciona(i);
		}
		
		System.out.println(lista);
		
		lista.inverter();
		
		System.out.println(lista);
	
	}
}
