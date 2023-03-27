package poo;

import java.util.Locale;
import java.util.Scanner;

import entities_poo.Triangle_WithPoo;

public class Program_WithPoo {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		//Instanciando a classe Triangle e definindo variaveis.
		Triangle_WithPoo x, y;
		x = new Triangle_WithPoo();
		y = new Triangle_WithPoo();
		
		System.out.println("Enter the measures of triangle X: ");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();
		
		System.out.println("Enter the measures of triangle Y: ");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();
		
		double areaX = x.area();
		
		double areaY = y.area();
		
		System.out.printf("Triangle X area: %.4f%n", areaX);
		
		System.out.printf("Triangle Y area: %.4f%n", areaY);
		
		if(areaX > areaY) {
			System.out.println("Large area: X");
		}
		else {
			System.out.println("Large area: Y");
		}
		
		
		sc.close();
		
	}

}
