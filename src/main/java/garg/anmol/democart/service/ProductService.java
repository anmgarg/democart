package garg.anmol.democart.service;

import java.util.List;

import garg.anmol.democart.dao.ProductDao;
import garg.anmol.democart.model.*;

public class ProductService {

	public List<Product> listProducts(int value)
	{
		List<Product> productList = new ProductDao().getProducts(value);
		
		return productList;
	}
	
	public int getTotal(int value)
	{
		int total = 0;
		List<Product> productList = new ProductDao().getProducts(value);
		
		for(Product product : productList)
		{
			total = total + product.getPrice();
		}
		
		return total;
	}
}
