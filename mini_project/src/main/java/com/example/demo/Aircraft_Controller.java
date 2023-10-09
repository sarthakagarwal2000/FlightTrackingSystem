package com.example.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class Aircraft_Controller {
	
	@Autowired
	private Aircraft_repository aircraft_repo;
	@Autowired
	private Flight_log_repository flight_repo;
	
	// to save the aircraft data with two fields.
	@PostMapping("/save")
	public Aircraft addAircraft(@RequestBody Aircraft aircraft) {
		return aircraft_repo.save(aircraft);
		
	}
	// to save the data of flight_log with 4-5 fields.
	@PostMapping("/save_flight_log")
	public Flight_log addFlightLog(@RequestBody Flight_log flightLog) {
		return flight_repo.save(flightLog);
		
	}
	
	//to track the flight log by the id of dlightlog only
	@GetMapping("/track_flight_log/{flightLogId}")
	public ResponseEntity<FlightLogDetails> getFlightLogDetails(@PathVariable  Long flightLogId){
		
		Optional<Flight_log> optionalFlight = flight_repo.findById(flightLogId);
		
		if (optionalFlight.isEmpty()) {
            return ResponseEntity.notFound().build(); // Flight log not found
        }
		
		 Flight_log flightLog = optionalFlight.get();
	        Aircraft aircraft = flightLog.getAircraft_id();

	        FlightLogDetails flightLogDetails = new FlightLogDetails(
	            flightLog.getId(),
	            aircraft.getId(),
	            flightLog.getDate__(),
	            flightLog.getDeparture(),
	            flightLog.getDestination(),
	            aircraft.getName(),
	            aircraft.getSerial_number()
	        );
	        return ResponseEntity.ok(flightLogDetails);
		
    }
	
	
	// to get the names of all the flight
	
	@GetMapping("/listOfFlights")
	public List<String> getListOfFlights(){
		return aircraft_repo.findAllNames();
	}
	
	
	
	
// to get all the information of the flightlogs
	
	@GetMapping("/all-flight-logs")
	public ResponseEntity<List<FlightLogDetails>> getAllFlightLogs() {
	    List<Flight_log> allFlightLogs = flight_repo.findAll(); 

	    List<FlightLogDetails> flightLogDetailsList = new ArrayList<>();
	    for (Flight_log log : allFlightLogs) {
	        Aircraft aircraft = log.getAircraft_id();
	        flightLogDetailsList.add(new FlightLogDetails(
	            log.getId(),
	            aircraft.getId(),
	            log.getDate__(),
	            log.getDeparture(),
	            log.getDestination(),
	            aircraft.getName(),
	            aircraft.getSerial_number()
	        ));
	    }

	    return ResponseEntity.ok(flightLogDetailsList);
	}
	
//	this.http.get(`http://localhost:8080/${this.flightLog.aircraft_id.name}/getAircraftDetails`)
	
	// to provide the flight name and we will get all the upcoming journey plans details regarding that flight
	@GetMapping("/{flightName}/fliterByAircraft")
	public ResponseEntity<List<FlightLogDetails>> getAllAircraftDetails(@PathVariable String flightName){
		
		List<Flight_log> flightLogsForAirplane = flight_repo.findAllByAircraftName(flightName);

	    if (flightLogsForAirplane.isEmpty()) {
	        return ResponseEntity.notFound().build(); 
	    }

	    List<FlightLogDetails> flightLogDetailsList = new ArrayList<>();
	    for (Flight_log log : flightLogsForAirplane) {
	        Aircraft aircraft = log.getAircraft_id();
	        flightLogDetailsList.add(new FlightLogDetails(
	            log.getId(),
	            aircraft.getId(),
	            log.getDate__(),
	            log.getDeparture(),
	            log.getDestination(),
	            aircraft.getName(),
	            aircraft.getSerial_number()
	        ));
	    }

	    return ResponseEntity.ok(flightLogDetailsList);
		
		
	}
	
	
	// to provid ethe flight name we will get all the airCraft details  like id and serial number
	@GetMapping("/{flightName}/getAircraftDetails")
	public ResponseEntity<AircraftDTO> getAircraftDetails(@PathVariable String flightName) {
	    Aircraft aircraft = aircraft_repo.findByName(flightName);

	    if (aircraft == null) {
	        return ResponseEntity.notFound().build();
	    }

	    AircraftDTO aircraftDetails = new AircraftDTO();
        aircraftDetails.setId(aircraft.getId());
        aircraftDetails.setSerial_number(aircraft.getSerial_number());

        return ResponseEntity.ok(aircraftDetails);
	}
}



