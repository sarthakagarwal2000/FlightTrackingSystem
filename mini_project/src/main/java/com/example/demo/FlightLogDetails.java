package com.example.demo;

import java.sql.Time;
import java.sql.Date;

public class FlightLogDetails {
    private Long flightLogId;
    private Long aircraftId;
    private Date date;
    private Time departure;
    private String destination;
    private String aircraftName;
    private String aircraftSerialNumber;
    
    
    
    
    
    
	public FlightLogDetails(Long flightLogId, Long aircraftId, Date date, Time departure, String destination,
			String aircraftName, String aircraftSerialNumber) {
		super();
		this.flightLogId = flightLogId;
		this.aircraftId = aircraftId;
		this.date = date;
		this.departure = departure;
		this.destination = destination;
		this.aircraftName = aircraftName;
		this.aircraftSerialNumber = aircraftSerialNumber;
	}
	public Long getFlightLogId() {
		return flightLogId;
	}
	public void setFlightLogId(Long flightLogId) {
		this.flightLogId = flightLogId;
	}
	public Long getAircraftId() {
		return aircraftId;
	}
	public void setAircraftId(Long aircraftId) {
		this.aircraftId = aircraftId;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public Time getDeparture() {
		return departure;
	}
	public void setDeparture(Time departure) {
		this.departure = departure;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public String getAircraftName() {
		return aircraftName;
	}
	public void setAircraftName(String aircraftName) {
		this.aircraftName = aircraftName;
	}
	public String getAircraftSerialNumber() {
		return aircraftSerialNumber;
	}
	public void setAircraftSerialNumber(String aircraftSerialNumber) {
		this.aircraftSerialNumber = aircraftSerialNumber;
	}

    
    
    // Constructors, getters, and setters
}