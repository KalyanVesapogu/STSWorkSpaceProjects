package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.TripBookingDAO;
import com.example.entity.TripBooking;

@Service
public class TripBookingService {
	
	@Autowired
	TripBookingDAO tripBookingDAO;
	
	public TripBooking insertTripBooking(TripBooking tripBooking) {
		return this.tripBookingDAO.save(tripBooking);
	}
	
	public TripBooking updateTripBooking(TripBooking tripBooking) {
		return this.tripBookingDAO.save(tripBooking);
	}
	
	public boolean deleteTripBooking(int tripBookingId) {
		this.tripBookingDAO.deleteById(tripBookingId);
		return true;
	}
	
	public List<TripBooking> viewAllTrips(){
		return this.tripBookingDAO.findAll();
	}
	
}
