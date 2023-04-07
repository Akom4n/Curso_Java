package util;

public class Currency_Converter {
	
	public static double IOF = 6.0;
	
	
	public static double converter(double dollar, double quantity) {
		
		double valor = dollar * quantity;
		return valor += valor * IOF / 100;
		
	}

}
