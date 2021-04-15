package com.lti.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.lti.entity.CartItem;

@Component
public class CartItemDao {


	@PersistenceContext
	private EntityManager entityManager;
	
	
	public CartItem fetch(int id) {
		return entityManager.find(CartItem.class, id);
	}
	
	public List<CartItem> displayAllCartItem(){
		return entityManager.createQuery("select ci from CartItem ci").getResultList();
	}
}
