package com.example.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.entity.TripBooking;

@Repository
public interface TripBookingDAO extends JpaRepository<TripBooking, Integer>{
	
}
