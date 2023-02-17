package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.entity.Order;

import java.util.List;

public interface OrderRepository extends JpaRepository<Order,Integer> {

    List<Order> findByCategory(String category);


}