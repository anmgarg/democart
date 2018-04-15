package garg.anmol.democart.service;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import garg.anmol.democart.dao.ProductDao;
import garg.anmol.democart.model.Product;
import mockit.Expectations;
import mockit.Mocked;
import mockit.Tested;


public class ProductServiceTest {

	@Tested
	ProductService productService;
	
	@Mocked
	ProductDao productDao;
	
	private List<Product> productList;
	
	@Before
	public void setup()
	{  
		Product product1 = new Product();
		product1.setPrice(1000);
		Product product2 = new Product();
		product2.setPrice(4000);
		productList = new ArrayList<Product>();
		productList.add(product1);
		productList.add(product2);
	}
	
	@Test
	public void getTotalTest()
	{
		new Expectations() {{
			 productDao.getProducts(anyInt);
			 result = productList;
			 times = 1;
		}};
		int total = productService.getTotal(11000);
		assertEquals(5000, total);
	}
	
	
}
