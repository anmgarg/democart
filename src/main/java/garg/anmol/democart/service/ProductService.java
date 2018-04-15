package garg.anmol.democart.service;

import java.util.List;

import garg.anmol.democart.dao.ProductDao;
import garg.anmol.democart.model.*;

public class ProductService {

	ProductDao productDao;
	
	public ProductService()
	{
		productDao = new ProductDao();
	}
	
	/*
	 * This method returns a list of products whose 
	 * individual price is less than the passed value.
	 */
	private List<Product> listProducts(int value)
	{
		List<Product> productList = new ProductDao().getProducts(value);
		
		return productList;
	}
	
	/*
	 * This method returns the total price of products whose 
	 * individual price is less than the passed value.
	 */
	public int getTotal(int value)
	{
		int total = 0;
		
		List<Product> productList = productDao.getProducts(value);
		
		for(Product product : productList)
		{
			total = total + product.getPrice();
		}
		
		return total;
	}
	
	
}
