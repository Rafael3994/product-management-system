package model;

public class Product {
	
	private int id;
	private String name;
	private Double price;
	
	
	public Product (int id, String name, Double price) {
		this.id = id;
		this.name = name;
		this.price = price;
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
