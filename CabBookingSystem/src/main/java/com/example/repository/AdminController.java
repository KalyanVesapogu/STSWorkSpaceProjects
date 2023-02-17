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

import com.example.entity.Admin;
import com.example.entity.TripBooking;
import com.example.service.AdminService;

@RestController
@RequestMapping("/admin")
public class AdminController {
	@Autowired
	AdminService adminService;
	
	@PostMapping(value = "/insert")
	public Admin insertAdmin(@RequestBody Admin admin) {
		return this.adminService.insertAdmin(admin);
	}
	
	@PutMapping(value = "/update")
	public Admin updateAdmin(@RequestBody Admin admin) {
		return this.adminService.updateAdmin(admin);
	}
	
	@DeleteMapping(value = "/admin/{adminId}")
	public boolean deleteAdmin(@PathVariable(name = "adminId") int adminId) {
		return this.adminService.deleteAdmin(adminId);
	}
	
	@GetMapping(value = "/getAllTrips")
	public List<TripBooking> getAllTrips(){
		return this.adminService.getAllTrips();
	}
}
