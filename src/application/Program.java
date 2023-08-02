package application;

import java.util.Arrays;
import java.util.List;


public class Program {
	
	public static void main(String[] args) {
		List<Integer> myInts = Arrays.asList(5, 2, 10);
		printList(myInts);
		
		List<String> myStrs = Arrays.asList("Maria", "Alex", "Bob");
		printList(myStrs);
	}
	
	//O List<?> é um tipo coringa que pode abrigar alguns tipo de list(obj, int, string, double)
	public static void printList(List<?> list) {
		// list.add(3); << isso daria um erro, o compilador não sabe qual o tipo especifico que foi adicionado na lista.
		for (Object obj : list) {
			System.out.println(obj);
		}
	} //Porem não é possivel adicionar dados no tipo curinga.
}
