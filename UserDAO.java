
	package com.niit.shopingcartdao;

	import java.util.List;

	import com.niit.shopingcart.Model.Category;
import com.niit.shopingcart.Model.User;

	public interface UserDAO {



		public List<User> list();

		public User get(String id);
		
		
			// TODO Auto-generated method stub
			
		

		public void delete(String id);

		

		public  void saveOrUpdate(User user);

		



	}



