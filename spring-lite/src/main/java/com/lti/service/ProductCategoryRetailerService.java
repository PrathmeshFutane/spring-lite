package com.lti.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.lti.dao.CategoryDao;
import com.lti.dao.GenericDao;
import com.lti.dao.ProductDao;
import com.lti.dao.RetailerDao;
import com.lti.entity.Product;
import com.lti.entity.Retailer;
import com.lti.entity.Category;

@Component
public class ProductCategoryRetailerService {
	
	@Autowired
	private GenericDao genericDao;
	
	@Autowired
	private ProductDao productDao;
	
	@Autowired
	private CategoryDao categoryDao;
	
	@Autowired
	private RetailerDao retailerDao;
	
	
	
//	---------------product-----------------
	public void registerProduct(Product product) {
		genericDao.save(product);
	}
	
	public Product getProductById(int id) {
		return productDao.fetch(id);
	}
	
	public List<Product> getAllProduct(){
		return productDao.displayALLProduct();
	}
	
	
//	-------------category------------------
	public void registerCategory(Category category) {
		genericDao.save(category);
	}
	
	public Category getCategoryById(int id) {
		return categoryDao.fetch(id);
	}
	
	public List<Category> getAllCategory(){
		return categoryDao.displayALLCategory();
	}
		
	
//	-------------retailer------------------
	public void registerRetailer(Retailer retailer) {
		genericDao.save(retailer);
	}
	
	public Retailer getRetailerById(int id) {
		return retailerDao.fetch(id);
	}
	
	public List<Retailer> getAllRetailer(){
		return retailerDao.displayALLRetailer();
	}
}
