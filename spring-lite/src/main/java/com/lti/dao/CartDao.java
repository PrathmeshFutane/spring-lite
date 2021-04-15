package com.lti.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Component;

import com.lti.entity.Cart;
import com.lti.entity.Category;

@Component
public class CartDao {

	@PersistenceContext
	private EntityManager entityManager;
	
	
	public Cart fetch(int id) {
		return entityManager.find(Cart.class, id);
	}
	
	public List<Cart> displayAllCart(){
		return entityManager.createQuery("select c from Cart c").getResultList();
	}
}
