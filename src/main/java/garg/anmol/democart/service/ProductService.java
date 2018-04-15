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
	
	public List<Product> listProducts(int value)
	{
		List<Product> productList = new ProductDao().getProducts(value);
		
		return productList;
	}
	
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
