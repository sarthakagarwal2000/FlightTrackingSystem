package com.example.demo;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface Flight_log_repository extends JpaRepository<Flight_log,Long>{
	Optional<Flight_log> findById(Long id);

	@Query("SELECT f FROM Flight_log f WHERE f.aircraft_id = :aircraft")
	List<Flight_log> findAllByAircraft(@Param("aircraft") Aircraft aircraft);
	
	@Query("SELECT f FROM Flight_log f WHERE f.aircraft_id.name = :airplaneName")
    List<Flight_log> findAllByAircraftName(@Param("airplaneName") String airplaneName);
    
    @Query("SELECT f FROM Flight_log f")
    List<Flight_log> findAllFlightLogs();
}
