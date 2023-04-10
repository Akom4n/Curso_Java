package application_example;

import java.util.Locale;
import java.util.Scanner;

import entities_poo.Product_ex;

public class Program_ex {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Enter product data: ");
		System.out.print("Name: ");
		String name = sc.nextLine();
		
		System.out.print("Price: ");
		double price = sc.nextDouble();
		
		System.out.print("Quantity in Stock: ");
		int quantity = sc.nextInt();
		Product_ex product = new Product_ex(name, price, quantity);
		
		System.out.println();
		System.out.println("Product Data: " + product);
		
		System.out.println();
		System.out.println("Enter the number of products to be added in stock: ");
		quantity = sc.nextInt();
		product.addProducts(quantity);
		 
		System.out.println();
		System.out.println("Update Data: " + product);
		
		System.out.println();
		System.out.println("Enter the number of products to be removed from stock: ");
		quantity = sc.nextInt();
		product.removeProducts(quantity);
		
		System.out.println();
		System.out.println("Update Data: " + product); 
		
		sc.close();
		
	}

}
