
	package com.niit.shopingcart;

	

	
	import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.shopingcart.Model.Product;
import com.niit.shopingcartdao.ProductDAO;

	public class Producttest {
		
		
		public static void main(String[] args) {
			
			AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
			
			context.scan("com.niit.shopingcart");
			context.refresh();
			
			
		   ProductDAO productDAO = (ProductDAO) context.getBean("productDAO");
		   
		   Product product = 	(Product) context.getBean("product");
		   product.setId("p001");
		   product.setName("symphony");
		   product.setDescription("it is a cooler");
		   product.setPrice(10000);
		   
		   
		 productDAO.saveOrUpdate(product);
		 productDAO.delete("CG120");
 		 
	
			
		}  

		}
	



