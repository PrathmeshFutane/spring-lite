//package com.lti.controller;
//
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.CrossOrigin;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.lti.entity.Customer;
//import com.lti.model.Status;
//import com.lti.service.CustomerCartCartItemService;
//
//@RestController
//@CrossOrigin
//public class CustomerController {
//	
//	@Autowired
//	private CustomerCartCartItemService customerService;
//	
//	
////	register customer
//	@PostMapping("/registerCustomer.lti")
//	public Status register(@RequestBody Customer customer) {
//		customerService.register(customer);
//		Status s = new Status();
//		s.setMessage("customer register successfully");
//		return s;
//	}
//	
//	
////	get all data
//	@GetMapping("/getAllCustomer.lti")
//	public List<Customer> getALlCustomer(){
//		return customerService.getAllCustomer();
//	}
//	
//	
//	
////	for login
//	@GetMapping("/loginCustomer.lti")
//	public Status register(@RequestParam("name") String name, @RequestParam("college") String college) {
//		Status s = new Status();
//		System.out.println(name.getClass().getSimpleName() + " "+college.getClass().getSimpleName());
//		for(Customer c : customerService.getAllCustomer()) {
//			if(name.equals(c.getName()) && college.equals(c.getCollege())) {
//				s.setMessage("data logged successfully");
//				System.out.println("print to check");
//				return s;
//			}
//		}
//		s.setMessage("invalid loggin");
//		return s;
//	}
//	
//	
//	
//}
