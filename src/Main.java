import java.util.List;
import java.util.Scanner;

import model.Inventory;
import model.Product;
import model.exceptions.ProductoExistenteException;

public class Main {

	public static void main(String[] args) {
		Product product1 = new Product(1, "Laptop", 799.99);
		
		//System.out.println(product1.toString());
		Product product2 = new Product(2, "Smartphone", 499.49);
		//System.out.println(product2.toString());
		Product product3 = new Product(3, "Laptop2", 799.99);
		Inventory inventory = new Inventory();
		try {
			inventory.addProduct(product1);
			inventory.addProduct(product2);
			inventory.addProduct(product3);
		} catch (ProductoExistenteException e) {
			e.printStackTrace();
		}
		
		/*
		try {
			inventory.deleteProduct(1);
		} catch (ProductoExistenteException e) {
			e.printStackTrace();
		}
		*/
		
		
		//inventory.getAllProducts().forEach(product -> System.out.println(product));
		inventory.findProdructsByName("laptop")
		.forEach(item -> System.out.println(item.toString()));
	}

}
