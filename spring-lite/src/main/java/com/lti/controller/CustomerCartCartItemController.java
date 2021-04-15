package com.lti.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.lti.entity.Cart;
import com.lti.entity.CartItem;
import com.lti.entity.Customer;
import com.lti.model.Status;
import com.lti.service.CustomerCartCartItemService;

@RestController
@CrossOrigin
public class CustomerCartCartItemController {

	@Autowired
	private CustomerCartCartItemService cccis;
	
	@GetMapping("/hello.lti")
	public String hello() {
		return "welcome to spring MVC again";
	}
	
	@PostMapping("/registerCustomer.lti")
	public Status registerCustomer(@RequestBody Customer customer) {
		cccis.register(customer);
		return new Status("register Successfully");
	}
	
	
	@PostMapping("/registerCart.lti")
	public Status registerCart(@RequestBody Cart cart) {
		cccis.register(cart);
		return new Status("cart added Successfully");
	}
	
	@PostMapping("/registerCartItem.lti")
	public Status registerCartItem(@RequestBody CartItem cartItem) {
		cccis.register(cartItem);
		return new Status("cart item Successfully");
	}
	
	
	
	
	
}