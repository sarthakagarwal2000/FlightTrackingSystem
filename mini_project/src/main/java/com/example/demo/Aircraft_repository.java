package com.example.demo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface Aircraft_repository extends  JpaRepository<Aircraft, Long>{
	@Query("SELECT f.name FROM Aircraft f")
    List<String> findAllNames();
	
	Aircraft findByName(String name);
}

