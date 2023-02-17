package com.example.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.entity.Driver;

@Repository
public interface DriverDAO extends JpaRepository<Driver, Integer>{

}
