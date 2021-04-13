package com.lti.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.lti.dao.RegisterDao;
import com.lti.entity.Register;

@Component
public class RegisterService {
	
	@Autowired
	private RegisterDao registerDao;
	
	public void register(Register register) {
		registerDao.save(register);
	}
	
	public List<Register> getAllData(){
		return registerDao.fetch();
	}
}
