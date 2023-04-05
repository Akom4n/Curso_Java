package application_example;

import java.util.Locale;
import java.util.Scanner;

import entities_poo.Funcionario;

public class Program_Fexf {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Funcionario funct = new Funcionario();
		
		System.out.println("Name: ");
		funct.name = sc.nextLine();
		System.out.println("Gross Salary: ");
		funct.grossSalary = sc.nextDouble();
		System.out.println("Tax: ");
		funct.tax = sc.nextDouble();
		
		System.out.println();
		System.out.println("Funcionario: " + funct);
		System.out.println();
		System.out.print("Which percentage to increase salary? ");
		double percentage = sc.nextDouble();
		funct.increaseSalary(percentage);
		
		System.out.println();
		System.out.println("Update data: " + funct);
		
		sc.close();
		
	}

}
