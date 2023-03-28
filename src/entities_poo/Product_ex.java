package entities_poo;

public class Product_ex {
	
	public String name;
	public double price;
	public int quantity;
	
	public double totalValueinStock() {
		return price * quantity;
	}
	
	public void addProducts(int quantity) {
		this.quantity += quantity;
	}
	
	public void removeProducts(int quantity) {
		this.quantity -= quantity;
	}
}
