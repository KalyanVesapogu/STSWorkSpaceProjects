package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.AdminDAO;
import com.example.dao.TripBookingDAO;
import com.example.entity.Admin;
import com.example.entity.TripBooking;
@Service
public class AdminService {
	@Autowired
	AdminDAO adminDAO;
	
	@Autowired
	TripBookingDAO tripBookingDAO;
	
	public Admin insertAdmin(Admin admin) {
		return this.adminDAO.save(admin);
	}
	
	public Admin updateAdmin(Admin admin) {
		return this.adminDAO.save(admin);
	}
	
	public boolean deleteAdmin(int adminId) {
		this.adminDAO.deleteById(adminId);
		return true;
	}
	
	public List<TripBooking> getAllTrips(){
		return this.tripBookingDAO.findAll();
	}
	
	
}
