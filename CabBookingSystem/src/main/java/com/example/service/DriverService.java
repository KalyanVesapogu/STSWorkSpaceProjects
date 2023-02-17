package com.example.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.DriverDAO;
import com.example.entity.Driver;

@Service
public class DriverService {
	
	@Autowired
	DriverDAO driverDAO;
	
	public Driver insertDriver(Driver driver) {
		return this.driverDAO.save(driver);
	}
	
	public Driver updateDriver(Driver driver) {
		return this.driverDAO.save(driver);
	}
	
	public boolean deleteDriver(int driverId) {
		this.driverDAO.deleteById(driverId);
		return true;
	}
	
	public List<Driver> viewAllDrivers(){
		return driverDAO.findAll();
	}
	
	public Driver viewDriver(int driverId) {
		Optional<Driver> optional = this.driverDAO.findById(driverId);
		if(optional.isPresent())
			return optional.get();
		else
			return null;
	}
}
