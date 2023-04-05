package entities_poo;

public class Rectangle {
	
	public double height;
	public double width;
	
	public double area() {
		return width * height;
	}
	
	public double perimeter() {
		return 2 * (width + height);
	}

	public double Diagonal() {
		return Math.sqrt(width * width + height * height);
	}
}
