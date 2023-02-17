package com.example.entity;


public class AbstractUser {
	String username;
	String password;
	String address;
	String mobileNumber;
	String email;
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "Customer [username=" + username + ", password=" + password + ", address=" + address + ", mobileNumber="
				+ mobileNumber + ", email=" + email + "]";
	}
	public AbstractUser(String username, String password, String address, String mobileNumber, String email) {
		super();
		this.username = username;
		this.password = password;
		this.address = address;
		this.mobileNumber = mobileNumber;
		this.email = email;
	}
	public AbstractUser() {
		super();
	}
	
}
