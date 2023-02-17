package com.example.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Customer {
	@Id
	int customerId;

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + "]";
	}

	public Customer(int customerId) {
		super();
		this.customerId = customerId;
	}

	public Customer() {
		super();
	}
	
	
}
