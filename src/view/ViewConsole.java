package view;

import java.util.HashMap;
import java.util.List;
import java.util.Scanner;
import java.util.Map;

import model.Product;

public class ViewConsole {

	
	public void showMessage(String message) {
		System.out.println(message);
	}
	
	public void showError(String message) {
		System.out.println(message);
	}
	
	public void showProductList(List<Product> products) {
		products.forEach(item -> System.out.println(item.toString()));
	}
	
	public String readInputUser(String title) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("\n\n"+title);
		return keyboard.nextLine();
	}
	
	public void showMenu() {
		 System.out.println("\n----- MENÚ -----");
	     System.out.println("1. Agregar producto");
	     System.out.println("2. Mostrar productos");
	     System.out.println("3. Eliminar producto");
	     System.out.println("4. Buscar productos por nombre");
	     System.out.println("0. Salir");
	}
	
	public Product showMenuCreateProduct() {
		System.out.println("\n----- CREATE PRODUCT -----");
		String productName = this.readInputUser("Introduce the Name: ");
		Double productPrice = Double.parseDouble(this.readInputUser("Introduce the Price: "));
		return new Product(productName, productPrice);
	}
	
	public String showMenuSearchProduct() {
		String productName = this.readInputUser("Introduce the Name to search: ");
		return productName;
	}
	
}
