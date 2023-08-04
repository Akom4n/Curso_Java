package application;

import entities.Client;

public class Program {
	
	public static void main(String[] args) {
		
		Client c1 = new Client("Maria", "maria@gmail.com");
		Client c2 = new Client("Maria", "maria@gmail.com");
		
		/* Nesse caso daria true por que o compilador da um tratamento especial annão ser que seja feito um new
		String s1 = "Test";
		String s2 = "Test";
		*/
		
		//Dessa forma não constara como true
		String s1 = new String("Test");
		String s2 = new String("Test");
		
		System.out.println(c1.hashCode());
		System.out.println(c2.hashCode());
		System.out.println(c1.equals(c2));
		System.out.println(c1 == c2); // Da false por que independente do valor ser o mesmo, são objetos diferentes.
		System.out.println(s1 == s2); //Nesse caso daria true por que o compilador da um tratamento especial annão ser que seja feito um new
		
	}
}
