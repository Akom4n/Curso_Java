package application_example;

import java.util.Locale;
import java.util.Scanner;

import entities_poo.Student;

public class Program_Eexf {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Student est = new Student();

		est.name = sc.nextLine();
		est.first = sc.nextDouble();
		est.second = sc.nextDouble();
		est.three = sc.nextDouble();

		System.out.printf("FINAL GRADE: %.2f%n", est.finalGrade());

		if (est.finalGrade() < 60.0) {
			System.out.println("FAILED");
			System.out.printf("Faltou %.2f Pontos%n", est.Pontos());
		} else {
			System.out.println("PASS");
		}

		sc.close();
	}

}
