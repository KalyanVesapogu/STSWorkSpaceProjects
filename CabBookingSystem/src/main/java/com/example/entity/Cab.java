package com.example.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Cab {
	@Id
	int cabId;
	String carType;
	float perKMRate;
	
	public int getCabId() {
		return cabId;
	}
	public void setCabId(int cabId) {
		this.cabId = cabId;
	}
	public String getCarType() {
		return carType;
	}
	public void setCarType(String carType) {
		this.carType = carType;
	}
	public float getPerKMRate() {
		return perKMRate;
	}
	public void setPerKMRate(float perKMRate) {
		this.perKMRate = perKMRate;
	}
	@Override
	public String toString() {
		return "Cab [cabId=" + cabId + ", carType=" + carType + ", perKMRate=" + perKMRate + "]";
	}
	public Cab(int cabId, String carType, float perKMRate) {
		super();
		this.cabId = cabId;
		this.carType = carType;
		this.perKMRate = perKMRate;
	}
	public Cab() {
		super();
	}
	
}
