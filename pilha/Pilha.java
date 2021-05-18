package estruturadedados.exercicios.pilha;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import java.util.Scanner;

public class Pilha {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		List<String> operations = new ArrayList<String>();
		
		Integer num = leitor.nextInt();
		leitor.nextLine();
		for(int i = 0; i < num; i++) {
			String x = leitor.nextLine();
			operations.add(x);	
		}
		
		List<Integer> list = getMax(operations);
		for(Integer n : list) {
			System.out.println(n);
		}
		
	}
	
	public static List<Integer> getMax(List<String> operations){
		List<Integer> list = new Stack<Integer>();
		List<Integer> max = new Stack<Integer>();
		
		for(String element : operations) {
			if(element.length() == 1) {
				
				Integer elementNumber = Integer.valueOf(element);
				
				if(elementNumber.equals(2)) { //Delete the element present at the top of the stack.
					list.remove(list.size()-1);
				}
				if(elementNumber.equals(3)) { //Add the list's highest element to the stack maximums
					Integer highest = 0;
					for(int j = 0; j < list.size(); j++) {
						if(list.get(j) > highest) {
							highest = list.get(j);
						}
					}
					max.add(highest);
				}
			} else { //Add the element in the stack list
				Integer elementNumber = Integer.valueOf(element.substring(2));
				list.add(elementNumber);
			}
		}
		return max;
	}
	
}

