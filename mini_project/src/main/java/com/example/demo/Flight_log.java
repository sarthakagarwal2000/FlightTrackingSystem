package com.example.demo;

import java.sql.Date;
import java.sql.Time;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="Flight_log")
public class Flight_log {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@ManyToOne
	@JoinColumn(name = "aircraft_id")
	private Aircraft aircraft_id;
	private Time departure;
	private String destination;
	private Date date__;

	
    public Flight_log() {
    }
	
	public Flight_log(Aircraft aircraft_id, Date date, Time departure, String destination) {
		super();
		this.aircraft_id = aircraft_id;
		this.date__ = date;
		this.departure = departure;
		this.destination = destination;
	}
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Aircraft getAircraft_id() {
		return aircraft_id;
	}
	public void setAircraft_id(Aircraft aircraft_id) {
		this.aircraft_id = aircraft_id;
	}
	public Date getDate__() {
		return date__;
	}
	public void setDate__(Date date) {
		this.date__ = date;
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
	
	
	
	
}
