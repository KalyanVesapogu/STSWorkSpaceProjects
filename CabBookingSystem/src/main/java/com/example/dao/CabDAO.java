package com.example.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.entity.Cab;

@Repository
public interface CabDAO extends JpaRepository<Cab, Integer>{

}
