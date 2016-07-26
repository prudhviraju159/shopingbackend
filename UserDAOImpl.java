
package com.niit.shopingcartdao;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;


import com.niit.shopingcart.Model.User;

@Repository("userDAO")
public class UserDAOImpl implements  UserDAO {
	

	@Autowired
	private SessionFactory sessionFactory;


	public UserDAOImpl(SessionFactory sessionFactory) {
		
		this.sessionFactory = sessionFactory;
	}



	


	@Transactional
	public  void saveOrUpdate(User user){
		
	sessionFactory.getCurrentSession().saveOrUpdate(user);
		
			
	}

	@Transactional
	public void delete(String id) {
		User user = new User();
		user.setId(id);
		sessionFactory.getCurrentSession().delete(user);
	}

	@Transactional
	public User get(String id) {
		String hql = "from User where id=" + "'"+ id +"'";
		//  from user where id = '101'
		Query query = (Query)sessionFactory.getCurrentSession().createQuery(hql);
		
		List<User> listuser = (List<User>)  query.getResultList();
		
		if (listuser != null && !listuser.isEmpty()) {
			return listuser.get(0);
		}
		return null;
	}
	
	@Transactional
	public List<User> list() {
		@SuppressWarnings(  "unchecked")
		List<User> listUser = (List<User>) 
		           sessionFactory.getCurrentSession()
			.createCriteria(User.class)
				.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();
		return listUser;
	}






	






	
}






	