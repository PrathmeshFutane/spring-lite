package com.lti.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Component;

import com.lti.entity.Category;
import com.lti.entity.Product;

@Component
public class CategoryDao {

	@PersistenceContext
	private EntityManager entityManager;
	
	public Category fetch(int id) {
		return entityManager.find(Category.class, id);
	}
	
	public List<Category> displayALLCategory(){
		return entityManager.createQuery("select c from Category c").getResultList();
	}

	
}
