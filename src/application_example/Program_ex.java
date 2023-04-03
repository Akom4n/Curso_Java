package application_example;

import java.util.Locale;
import java.util.Scanner;

import entities_poo.Product_ex;

public class Program_ex {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Product_ex product = new Product_ex();
		System.out.println("Enter product data: ");
		System.out.print("Name: ");
		product.name = sc.nextLine();
		
		System.out.print("Price: ");
		product.price = sc.nextDouble();
		
		System.out.print("Quantity in Stock: ");
		product.quantity = sc.nextInt();
		
		System.out.println(product.name + ", " + product.price + ", " + product.quantity);
		
		System.out.println("ATUALIZANDO PARA TESTE");
		
		sc.close();
		
	}

}
