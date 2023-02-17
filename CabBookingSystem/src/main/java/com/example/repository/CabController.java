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

import com.example.entity.Cab;
import com.example.service.CabService;

@RestController
@RequestMapping("/cab")
public class CabController {
	
	@Autowired
	CabService cabService;
	
	@PostMapping(value ="/insert")
	public Cab insertCab(@RequestBody Cab cab) {
		return this.cabService.insertCab(cab);
	}
	
	@PutMapping(value ="/update")
	public Cab updateCab(@RequestBody Cab cab) {
		return this.cabService.updateCab(cab);
	}
	
	@DeleteMapping(value = "/delete/{cabId}")
	public boolean deleteCab(@PathVariable(name = "cabId") int cabId) {
		return this.cabService.deleteCab(cabId);
	}
	
	@GetMapping(value = "/viewAllCabs")
	public List<Cab> viewAllCabs(){
		return this.cabService.viewAllCabs();
	} 
	
}
