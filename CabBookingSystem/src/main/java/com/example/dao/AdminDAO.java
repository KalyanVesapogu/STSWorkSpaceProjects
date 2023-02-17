package com.example.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.entity.Admin;

@Repository
public interface AdminDAO extends JpaRepository<Admin, Integer>{

}
