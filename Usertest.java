
	package com.niit.shopingcart;

	

	
	import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.shopingcart.Model.User;
import com.niit.shopingcartdao.UserDAO;

	public class Usertest {
		
		
		public static void main(String[] args) {
			
			AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
			
			context.scan("com.niit.shopingcart");
			context.refresh();
			
			
		   UserDAO userDAO = (UserDAO) context.getBean("userDAO");
		   
		   User user = 	(User) context.getBean("user");
		   user.setId("sa110");
		   user.setName("sadhu");
		   user.setPassword("sadhana");
		   user.setMobile("9063500938");
		   user.setAddress("hyderabad");
		   user.setMail("sadhu.shiny@gmail.com");
		   user.setAddress("hyderabad");
		   
		   
		 userDAO.saveOrUpdate(user);
		 userDAO.delete("sa110");
		 
 		 
	
			
		}  

		}
	



