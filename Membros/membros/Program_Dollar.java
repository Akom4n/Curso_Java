package membros;

import java.util.Locale;
import java.util.Scanner;

import util.Currency_Converter;

public class Program_Dollar {
	
	public static void main(String[] args) {
		
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("What is the dollar price? ");
		double dollar = sc.nextDouble();
		
		
		System.out.print("How many dollars will be bought? ");
		double quantity = sc.nextDouble();
		
		
		double val_converter = Currency_Converter.converter(dollar, quantity);
		System.out.printf("Amount to be paid in reais =  %.2f%n", val_converter);
		
		sc.close();
		
	}

}
