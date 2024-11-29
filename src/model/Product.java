package model;

public class Product {
	
	private static int initialId = 1; 
	private int id;
	private String name;
	private Double price;
	
	
	public Product (String name, Double price) {
		this.id = initialId;
		this.name = name;
		this.price = price;
		Product.initialId += 1;
	}
	
	public int getId () {
		return this.id;
	}
	
	public String getName () {
		return this.name;
	}
	
	public Double getPrice () {
		return this.price;
	}
	
	public void setId (int newId) {
		this.id = newId;
	}
	
	public void setName (String newName) {
		this.name = newName;
	}
	
	public void setPrice (Double newPrice) {
		this.price = newPrice;
	}
	
	public String toString () {
		return "ID: " + this.id 
				+ 
				"\nName: " + this.name
				+
				"\nPrice: " + this.price
				+
				"\n---------------------"
				;
	}
	
}
