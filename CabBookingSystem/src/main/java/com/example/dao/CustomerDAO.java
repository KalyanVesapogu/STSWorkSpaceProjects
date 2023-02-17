package com.example.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.entity.Customer;

@Repository
public interface CustomerDAO extends JpaRepository<Customer, Integer>{

}
