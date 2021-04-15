package com.lti.dao;


import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.lti.entity.Product;

@Component
public class GenericDao {
	
	@PersistenceContext
	private EntityManager entityManager;
	
//	to save object
	@Transactional
	public void save(Object obj){
		entityManager.merge(obj);
	}


}
