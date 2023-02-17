package com.example.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.Customer;
import com.example.service.CustomerService;

@RestController
@RequestMapping("/customer")
public class CustomerController {
	
	@Autowired
	CustomerService customerService;
	
	@PostMapping(value = "/insert")
	public Customer insertCustomer(@RequestBody Customer customer) {
		return this.customerService.insertCustomer(customer);
	}
	
	@PutMapping(value = "/update")
	public Customer updateCustomer(@RequestBody Customer customer) {
		return this.customerService.updateCustomer(customer);
	}
	
	@DeleteMapping(value = "/delete/{customerId}")
	public boolean deleteCustomer(@PathVariable(name = "customerId") int customerId) {
		return this.customerService.deleteCustomer(customerId);
	}
	
	@GetMapping(value = "/viewCustomers")
	public List<Customer> viewCustomers(){
		return this.customerService.viewCustomers();
	}
	
	@GetMapping(value = "/viewCustomer/{customerId}")
	public Customer viewCustomer(@PathVariable(name = "customerId") int customerId) {
		return this.customerService.viewCustomer(customerId);
	}
}
