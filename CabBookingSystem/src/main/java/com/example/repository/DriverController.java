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

import com.example.entity.Driver;
import com.example.service.DriverService;

@RestController
@RequestMapping("/driver")
public class DriverController {

	@Autowired
	DriverService driverService;
	
	@PostMapping(value = "/insert")
	public Driver insertDriver(@RequestBody Driver driver) {
		return this.driverService.insertDriver(driver);
	}
	
	@PutMapping(value = "/update")
	public Driver updateDriver(@RequestBody Driver driver) {
		return this.driverService.updateDriver(driver);
	}
	
	@DeleteMapping(value = "/delete/{driverId}")
	public boolean deleteDriver(@PathVariable(name = "driverId") int driverId) {
		return this.driverService.deleteDriver(driverId);
	}
	
	@GetMapping(value = "/viewAllDrivers")
	public List<Driver> viewBestDrivers(){
		return this.driverService.viewAllDrivers();
	}
	
	@GetMapping(value = "/viewDriver/{driverId}")
	public Driver viewDriver(@PathVariable(name = "driverId") int driverId) {
		return this.driverService.viewDriver(driverId);
	}
	
	
}
