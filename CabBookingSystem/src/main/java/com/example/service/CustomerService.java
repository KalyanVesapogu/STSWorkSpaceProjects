package com.example.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.CustomerDAO;
import com.example.entity.Customer;

@Service
public class CustomerService {
	
	@Autowired
	CustomerDAO customerDAO;
	
	public Customer insertCustomer(Customer customer ) {
		return this.customerDAO.save(customer);
	}
	
	public Customer updateCustomer(Customer customer ) {
		return this.customerDAO.save(customer);
	}
	
	public boolean deleteCustomer(int customerId) {
		this.customerDAO.deleteById(customerId);
		return true;
	}
	
	public List<Customer> viewCustomers(){
		return customerDAO.findAll();
	}
	
	public Customer viewCustomer(int customerId) {
		Optional<Customer> optional = this.customerDAO.findById(customerId);
		if(optional.isPresent())
			return optional.get();
		else
			return null;
	}
	
	//public Customer validateCustomer(String username, String password) {
	//	return this.customerDAO.
	//}
}
