package garg.anmol.democart.dao;

import java.util.List;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import garg.anmol.democart.model.Product;

public class ProductDao {

	static SessionFactory sessionFactory;
	static Session session;
	
	static
	{
		System.out.println("Running static initialzer...");
		sessionFactory = new Configuration().configure().buildSessionFactory();
		session = sessionFactory.openSession();
	}
	
	public Product getProduct(int id)
	{
		return (Product)session.get(Product.class, id);
	}
	
	public List<Product> getProducts(int value)
	{
		System.out.println("Inside Dao");
		List<Product> productList = session.createQuery("from Product where price <" + value).getResultList();
		return productList;
	}
	
	public boolean saveProduct(Product product)
	{
		boolean status = true;
		
		session.beginTransaction();
		session.save(product);
		session.getTransaction().commit();
		
		return status;
	}
}
