
	package com.niit.shopingcartdao;

	import java.util.List;

	import com.niit.shopingcart.Model.Category;
import com.niit.shopingcart.Model.Product;

	public interface ProductDAO {



		public List<Product> list();

		public Product get(String id);
		
		
			// TODO Auto-generated method stub
			
		

		public void delete(String id);

		

		public void saveOrUpdate(Product product);

		



	}



