import garg.anmol.democart.dao.ProductDao;
import garg.anmol.democart.model.Product;
import garg.anmol.democart.service.ProductService;

public class Main {

	public static void main(String[] args) {
		
		Product product = new Product();
		ProductDao productDao = new ProductDao();
		product.setName("Cooler");
		product.setPrice(5000);
		productDao.saveProduct(product);
		
		Product product1 = new Product();
		
		product1.setName("Refrigerator");
		product1.setPrice(10000);
		productDao.saveProduct(product1);		
		
		System.out.println(new ProductService().getTotal(11000));
	}

}
