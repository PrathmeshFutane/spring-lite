package com.lti.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Component;

import com.lti.entity.Retailer;

@Component
public class RetailerDao {
	
	@PersistenceContext
	private EntityManager entityManager;
	
	public Retailer fetch(int id) {
		return entityManager.find(Retailer.class, id);
	}
	
	public List<Retailer> displayALLRetailer(){
		return entityManager.createQuery("select r from Retailer r").getResultList();
	}

	
}
