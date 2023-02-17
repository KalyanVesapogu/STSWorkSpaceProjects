package com.example.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Driver {
	@Id
	int driverId;
	String licenseNo;
	@OneToOne
	Cab cab;
	float rating;
	
	public int getDriverId() {
		return driverId;
	}
	public void setDriverId(int driverId) {
		this.driverId = driverId;
	}
	public String getLicenseNo() {
		return licenseNo;
	}
	public void setLicenseNo(String licenseNo) {
		this.licenseNo = licenseNo;
	}
	public Cab getCab() {
		return cab;
	}
	public void setCab(Cab cab) {
		this.cab = cab;
	}
	public float getRating() {
		return rating;
	}
	public void setRating(float rating) {
		this.rating = rating;
	}
	@Override
	public String toString() {
		return "Driver [driverId=" + driverId + ", licenseNo=" + licenseNo + ", cab=" + cab + ", rating=" + rating
				+ "]";
	}
	public Driver(int driverId, String licenseNo, Cab cab, float rating) {
		super();
		this.driverId = driverId;
		this.licenseNo = licenseNo;
		this.cab = cab;
		this.rating = rating;
	}
	public Driver() {
		super();
	}
	
}
