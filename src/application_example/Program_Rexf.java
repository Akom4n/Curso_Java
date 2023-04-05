package application_example;

import java.util.Locale;
import java.util.Scanner;

import entities_poo.Rectangle;


public class Program_Rexf {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Rectangle rect = new Rectangle();
		
		System.out.println("Enter rectangle width and height: ");
		
		rect.width = (int) sc.nextDouble();
		rect.height = (int) sc.nextDouble();
		
		System.out.printf("AREA = %.2f%n", rect.area());
		System.out.printf("PERIMETER = %.2f%n", rect.perimeter());
		System.out.printf("Diagonal = %.2f%n", rect.Diagonal());
		
		
		sc.close();
		
	}

}
