
package com.niit.shopingcartdao;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.shopingcart.Model.Suppliername;


@Repository("supplierDAO")
public class SupplierDAOImpl implements SupplierDAO {
	

	@Autowired
	private SessionFactory sessionFactory;


	public SupplierDAOImpl(SessionFactory sessionFactory) {
		
		this.sessionFactory = sessionFactory;
	}



	


	@Transactional
	public  void saveOrUpdate(Suppliername supplier){
		
	sessionFactory.getCurrentSession().saveOrUpdate(supplier);
		
			
	}

	@Transactional
	public void delete(String id) {
		Suppliername supplier = new Suppliername();
		supplier.setId(id);
		sessionFactory.getCurrentSession().delete(supplier);
	}

	@Transactional
	public Suppliername get(String id) {
		String hql = "from supplier where id=" + "'"+ id +"'";
		//  from supplier where id = '101'
		Query query = (Query)sessionFactory.getCurrentSession().createQuery(hql);
		
		List<Suppliername> listsupplier = (List<Suppliername>)  query.getResultList();
		
		if (listsupplier != null && !listsupplier.isEmpty()) {
			return listsupplier.get(0);
		}
		return null;
	}
	
	@Transactional
	public List<Suppliername> list() {
		@SuppressWarnings(  "unchecked")
		List<Suppliername> listsupplier = (List<Suppliername>) 
		           sessionFactory.getCurrentSession()
			.createCriteria(Suppliername.class)
				.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();
		return listsupplier;
	}






	





	





	
}






	