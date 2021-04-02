package estruturadedados.exercicios.vetor;

import java.util.Arrays;

public class VetorExercicio {
	
	public static void main(String[] args) {
		
		Integer[] lista = rotacionar(5,2); //(quantidade de números da lista, numero de rotacoes)
		System.out.println(Arrays.toString(lista));
		
	}
	
	public static Integer[] rotacionar(Integer numeros, Integer rotacoes) {
		Integer[] lista = new Integer[numeros];
		for(int i = 0; i < numeros; i++) {
			lista[i] = i+1;
		}
		
		for(int i = 0; i < rotacoes; i++) {
			int primeiro = lista[0];
			int j;
			for(j = 0; j < lista.length - 1; j++) {
				lista[j] = lista[j+1];
			}
			lista[j] = primeiro;
		}
		
		return lista;
	}

}
