package com.projetJEE.repository;

import java.util.List;
import org.springframework.stereotype.Repository;
import com.projetJEE.model.User;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class UserRepository{
	
	@PersistenceContext
	private EntityManager em;
	
	
	public List<User> getAllUsers() {
		List<User> res = null;
		try {
			Query query = em.createQuery("SELECT b FROM User AS b");
			res = query.getResultList();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return res;
	}
	
	public User get(int id) {
		User res = null;
		try {
			res = em.find(User.class, id);
		}catch (Exception e) {
			e.printStackTrace();
		}
		return res;
	}
	
	public User addUser(User user) {
		try {
			em.persist(user);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return user;
	}
	
	public User updateUser(User user) {
		try {
			em.merge(user);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return user;
	}
	
	public void deleteUser(int id) {
		try {
			Query query = em.createQuery(
					"DELETE  FROM User WHERE id = :id");
			query.setParameter("id", id);
			query.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}