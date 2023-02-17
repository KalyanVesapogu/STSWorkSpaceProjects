package com.example.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Admin {
	@Id
	int adminId;

	public int getAdminId() {
		return adminId;
	}

	public void setAdminId(int adminId) {
		this.adminId = adminId;
	}

	@Override
	public String toString() {
		return "Admin [adminId=" + adminId + "]";
	}

	public Admin(int adminId) {
		super();
		this.adminId = adminId;
	}

	public Admin() {
		super();
	}
	
}
