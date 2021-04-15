package com.lti.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.lti.entity.Product;

@Component
public class ProductDao {

	@PersistenceContext
	private EntityManager entityManager;
	
	public Product fetch(int id) {
		return entityManager.find(Product.class, id);
	}
	
	public List<Product> displayALLProduct(){
		return entityManager.createQuery("select p from Product p").getResultList();
	}
}
