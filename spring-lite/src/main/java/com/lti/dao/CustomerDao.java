package com.lti.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.lti.entity.Customer;

@Component
public class CustomerDao {
	
	@PersistenceContext
	private EntityManager entityManager;
	
	@Transactional
	public void save(Customer register) {
		entityManager.merge(register);
	}
	
	public Customer fetch(int id) {
		return entityManager.find(Customer.class, id);
	}
	
	public List<Customer> displayAllCustomer(){
		return entityManager.createQuery("select c from Customer c").getResultList(); 
	}
}
