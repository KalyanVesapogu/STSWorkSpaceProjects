package com.example.entity;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class TripBooking {
	@Id
	int tripBookingId;
	int customerId;
	@ManyToOne
	Driver driver;
	String fromLocation;
	String toLocation;
	LocalDateTime fromDateTime;
	LocalDateTime toDateTime;
	boolean status;
	float distanceInKm;
	
	public int getTripBookingId() {
		return tripBookingId;
	}
	public void setTripBookingId(int tripBookingId) {
		this.tripBookingId = tripBookingId;
	}
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public Driver getDriver() {
		return driver;
	}
	public void setDriver(Driver driver) {
		this.driver = driver;
	}
	public String getFromLocation() {
		return fromLocation;
	}
	public void setFromLocation(String fromLocation) {
		this.fromLocation = fromLocation;
	}
	public String getToLocation() {
		return toLocation;
	}
	public void setToLocation(String toLocation) {
		this.toLocation = toLocation;
	}
	public LocalDateTime getFromDateTime() {
		return fromDateTime;
	}
	public void setFromDateTime(LocalDateTime fromDateTime) {
		this.fromDateTime = fromDateTime;
	}
	public LocalDateTime getToDateTime() {
		return toDateTime;
	}
	public void setToDateTime(LocalDateTime toDateTime) {
		this.toDateTime = toDateTime;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	public float getDistanceInKm() {
		return distanceInKm;
	}
	public void setDistanceInKm(float distanceInKm) {
		this.distanceInKm = distanceInKm;
	}
	@Override
	public String toString() {
		return "TripBooking [tripBookingId=" + tripBookingId + ", customerId=" + customerId + ", driver=" + driver
				+ ", fromLocation=" + fromLocation + ", toLocation=" + toLocation + ", fromDateTime=" + fromDateTime
				+ ", toDateTime=" + toDateTime + ", status=" + status + ", distanceInKm=" + distanceInKm + "]";
	}
	public TripBooking(int tripBookingId, int customerId, Driver driver, String fromLocation, String toLocation,
			LocalDateTime fromDateTime, LocalDateTime toDateTime, boolean status, float distanceInKm) {
		super();
		this.tripBookingId = tripBookingId;
		this.customerId = customerId;
		this.driver = driver;
		this.fromLocation = fromLocation;
		this.toLocation = toLocation;
		this.fromDateTime = fromDateTime;
		this.toDateTime = toDateTime;
		this.status = status;
		this.distanceInKm = distanceInKm;
	}
	public TripBooking() {
		super();
	}
	
	
}
