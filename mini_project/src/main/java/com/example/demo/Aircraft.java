package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "Aircraft")
public class Aircraft {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	private String serial_number;
	
	@OneToMany(mappedBy = "aircraft_id", cascade = CascadeType.ALL)
	private List<Flight_log> flight_logs = new ArrayList<>();
	
	 public Aircraft() {
	    }
	
	public Aircraft(String name, String serial_number) {
		super();
		this.name = name;
		this.serial_number = serial_number;
		
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSerial_number() {
		return serial_number;
	}

	public void setSerial_number(String serial_number) {
		this.serial_number = serial_number;
	}



	
	
}
