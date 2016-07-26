
	package com.niit.shopingcartdao;

	import java.util.List;

import com.niit.shopingcart.Model.Category;
import com.niit.shopingcart.Model.Suppliername;

	public interface SupplierDAO {



		public List<Suppliername> list();

		public Suppliername get(String id);
		
		
			// TODO Auto-generated method stub
			
		

		public void delete(String id);

		

		public void saveOrUpdate(Suppliername supplier);
		



	}



