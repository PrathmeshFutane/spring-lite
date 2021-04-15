package com.lti.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.lti.entity.Product;
import com.lti.entity.Retailer;
import com.lti.entity.Category;
import com.lti.model.Status;
import com.lti.service.ProductCategoryRetailerService;

@RestController
@CrossOrigin
public class ProductCategoryRetailerController {

	@Autowired
 	private ProductCategoryRetailerService pcrs;
	
	@PostMapping("/addRetailer.lti")
	public Status addRetailer(@RequestBody Retailer retailer) {
		pcrs.registerRetailer(retailer);
		return new Status("retailer register successfully");
	}
	
	
	@PostMapping("/addCategory.lti")
	public Status addCategory(@RequestBody Category category) {
		pcrs.registerCategory(category);
		return new Status("category register successfully");
	}
	
	
	@PostMapping("/addProduct.lti")
	public Status addProduct(@RequestBody Product product) {
//		Category c = new Category();
//		Retailer r = new Retailer();
		pcrs.registerProduct(product);
//		c = product.getCategory();
//		r = product.getRetailer();
//		System.out.println(c.getCategoryId()+" "+r.getRetailerId());
		return new Status("product register successfully");		
		
	}
}
