package com.lti.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.lti.dao.ProductDao;
import com.lti.entity.Product;

@Component
public class ProductService {
	
	@Autowired
	private ProductDao productDao;
	
	public void register(Product product) {
		productDao.save(product);
	}
	
	public void getById(int id) {
		productDao.fetch(id);
	}
	
	public List<Product> getAllProduct(){
		return productDao.displayALLProduct();
	}
}
