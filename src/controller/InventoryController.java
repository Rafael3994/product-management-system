package controller;

import java.util.List;

import model.Inventory;
import model.Product;
import model.exceptions.ProductoExistenteException;
import view.ViewConsole;

public class InventoryController {
	ViewConsole viewConsole;
	Inventory inventory;
	
	public InventoryController() {
		viewConsole = new ViewConsole();
		inventory = new Inventory();
	}
	
	
	public void start() {
		String inputUserOption;
		
		Product product1 = new Product("Laptop", 799.99);
		Product product2 = new Product("cd", 2.99);
		try {
			this.inventory.addProduct(product1);
			this.inventory.addProduct(product2);
		} catch (ProductoExistenteException e) {
			e.printStackTrace();
		}
		
		do {
			viewConsole.showMenu();
			inputUserOption = viewConsole.readInputUser("Select an option:");
			switch (inputUserOption) {
			case "0": {
				System.out.println("EXIT");
				break;
			}
			case "1": {
				this.addProduct();
				break;
			}
			case "2": {
				this.showAllProducts();
				break;
			}
			case "3": {
				this.removeProduct();
				break;
			}
			case "4": {
				this.searchProduct();
				break;
			}
			default:
				System.out.println("Try again with another number");
				break;
			}
			
			
		} while (Integer.parseInt(inputUserOption) != 0);
		
	}
	
	public void addProduct() {
		Product newProduct = this.viewConsole.showMenuCreateProduct();
		try {
			this.inventory.addProduct(newProduct);
		} catch (ProductoExistenteException e) {
			e.printStackTrace();
		}
	}
	
	public void searchProduct() {
		String searchParamName = this.viewConsole.showMenuSearchProduct();
		List<Product> productsFind =  this.inventory.findProdructsByName(searchParamName);
		this.viewConsole.showProductList(productsFind);
	}
	
	public void removeProduct() {
		int inputId = Integer.parseInt(this.viewConsole.readInputUser("Introudce el id:"));
		try {
			this.inventory.deleteProduct(inputId);
			this.viewConsole.showMessage("The product with the id: " + inputId + "was deleted.");
		} catch (ProductoExistenteException e) {
			e.printStackTrace();
		}
	}
	
	public void showAllProducts() {
		this.viewConsole.showProductList(this.inventory.getAllProducts());
	}
}
