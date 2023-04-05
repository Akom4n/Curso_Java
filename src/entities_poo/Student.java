package entities_poo;

public class Student {
	
	public String name;
	public double first;
	public double second;
	public double three;
	
	
	public double finalGrade() {
		return first + second + three;
	}
	
	public double Pontos() {
		if (finalGrade() < 60.0) {
			return 60.0 - finalGrade();
		}
		else {
			return 0.0;
		}
	}

}
