package com.lti.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.lti.entity.Product;
import com.lti.model.Status;
import com.lti.service.ProductService;

@RestController
@CrossOrigin
public class ProductController {
	
	@Autowired
	private ProductService productService;
	
	@GetMapping("/helloworld.lti")
	public Status helloWorld() {
		Status s = new Status();
		s.setMessage("hi jack");
		return s;
	}
	
	@PostMapping("/addProduct.lti")
	public Status addProduct(@RequestBody Product product) {
		productService.register(product);
		Status s = new Status();
		s.setMessage("Product added successfully");
		return s;
	}
	
	@GetMapping("/getAllProduct.lti")
	public List<Product> getAllProducts(){
		List<Product> list = productService.getAllProduct();
		return list;
	}
	
	
}
