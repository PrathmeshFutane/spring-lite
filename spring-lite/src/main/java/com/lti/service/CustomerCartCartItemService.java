package com.lti.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.lti.dao.CartDao;
import com.lti.dao.CartItemDao;
import com.lti.dao.CustomerDao;
import com.lti.dao.GenericDao;
import com.lti.entity.Cart;
import com.lti.entity.CartItem;
import com.lti.entity.Customer;
import com.lti.entity.Product;

@Component
@Transactional
public class CustomerCartCartItemService {
	
	@Autowired
	private CustomerDao customerDao;
	
	@Autowired
	private CartDao cartDao;
	
	@Autowired
	private CartItemDao cartItemDao;
	
	@Autowired
	private GenericDao genericDao;
	
//	---------------customer-------------------
	public void register(Customer customer) {
		customerDao.save(customer);
	}
	
	public Customer getCustomerById(int id) {
		return customerDao.fetch(id);
	}
	
	public List<Customer> getAllCustomer(){
		return customerDao.displayAllCustomer();
	}
	
//	----------------Cart-------------------------
	public void register(Cart cart) {
		genericDao.save(cart);
	}
	
	public Cart getCartById(int id) {
		return cartDao.fetch(id);
	}
	
	public List<Cart> getAllCart(){
		return cartDao.displayAllCart();
	}

	
	
//	---------------Cart Item-------------------
	public void register(CartItem cartItem) {
		genericDao.save(cartItem);
	}
	
	public CartItem getCartItemById(int id) {
		return cartItemDao.fetch(id);
	}
	
	public List<CartItem> getAllCartItem(){
		return cartItemDao.displayAllCartItem();
	}
	
	
	
}//class

