
	package com.niit.shopingcart;

	

	
	import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.shopingcart.Model.Suppliername;
import com.niit.shopingcartdao.SupplierDAO;

	public class Suppliernametest2 {
		
		
		public static void main(String[] args) {
			
			AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
			
			context.scan("com.niit.shopingcart");
			context.refresh();
			
			
		   SupplierDAO supplierDAO = (SupplierDAO) context.getBean("supplierDAO");
		   
		   Suppliername supplier = 	(Suppliername) context.getBean("suppliername");
		   supplier.setId("SUP120");
		   supplier.setName("sadhana120");
		   supplier.setAddress("HYDERABAD");
		   
		   
		 supplierDAO.saveOrUpdate(supplier);
		 
 		 
	
			
		}  

		}
	



