package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.CabDAO;
import com.example.entity.Cab;

@Service
public class CabService {
	
	@Autowired
	CabDAO cabDAO;
	
	public Cab insertCab(Cab cab) {
		return this.cabDAO.save(cab);
	}
	
	public Cab updateCab(Cab cab) {
		return this.cabDAO.save(cab);
	}
	
	public boolean deleteCab(int cabId) {
		this.cabDAO.deleteById(cabId);
		return true;
	}
	
	public List<Cab> viewAllCabs(){
		return cabDAO.findAll();
	}
	
}
