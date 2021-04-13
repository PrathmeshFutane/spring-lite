package com.lti.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.lti.entity.Register;

@Component
public class RegisterDao {
	
	@PersistenceContext
	private EntityManager entityManager;
	
	@Transactional
	public void save(Register register) {
		entityManager.merge(register);
	}
	
	public List<Register> fetch(){
		return entityManager.createQuery("select r from Register r").getResultList(); 
	}
}
