package garg.anmol.democart.dao;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import garg.anmol.democart.model.Product;

public class ProductDao {

	public ProductDao()
	{
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		sessionFactory.
		
	}
	public static Product getProduct(int id)
	{
		 
	}
	public static void getProducts(String keyword)
	{
		
	}
}
