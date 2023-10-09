package com.example.demo;

public class AircraftDTO {
	private Long id;
	private String serial_number;
	public AircraftDTO(Long id, String serial_number) {
		super();
		this.id = id;
		this.serial_number = serial_number;
	}
	public AircraftDTO() {
		// TODO Auto-generated constructor stub
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getSerial_number() {
		return serial_number;
	}
	public void setSerial_number(String serial_number) {
		this.serial_number = serial_number;
	}
	
	

}
