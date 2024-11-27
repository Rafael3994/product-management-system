package model;

import java.util.ArrayList;
import java.util.List;

import model.exceptions.ProductoExistenteException;

public class Inventory {

	public List<Product> products = new ArrayList<Product>(); 
	
			
	public void addProduct (Product newProduct) throws ProductoExistenteException {
		if(this.isProductExistById(newProduct.getId())) {
			throw new ProductoExistenteException("The product with " + newProduct.getId() + " exists");
		}
		
		this.products.add(newProduct);
	}
	
	private Boolean isProductExistById (int id) {
		Boolean isExist = false;
		for(Product item:this.products) {
			if(item.getId() == id) { isExist = true;}
		}
		
		return isExist;
	}
	
	public void deleteProduct (int id) throws ProductoExistenteException {
		if(!this.isProductExistById(id)) { throw new ProductoExistenteException("The product with " + id + "not exists");}
		this.products.removeIf(item -> item.getId() == id);
	}
	
	public List<Product> getAllProducts ( ) {
		return this.products;
	}
	
	public List<Product> findProdructsByName (String name) {
		List<Product> productsFind = new ArrayList<Product>();
		
		this.products.forEach(item -> {
			if(item.getName().toLowerCase().contains(name.toLowerCase())) {
				productsFind.add(item);
			}
		
		});
		
		return productsFind;
	}
	
	
}
