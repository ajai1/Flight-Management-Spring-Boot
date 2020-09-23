package com.ajai.flightmanagement.dto;

import com.ajai.flightmanagement.entity.Flight;

public class FlightDto {
	public FlightDto(){
		
	}

	public FlightDto(String airlineCode, Flight flight) {
		this.airlineCode = airlineCode;
		this.flight = flight;
	}

	private String airlineCode;
	
	private Flight flight;

	public String getAirlineCode() {
		return airlineCode;
	}

	public void setAirlineCode(String airlineCode) {
		this.airlineCode = airlineCode;
	}

	public Flight getFlight() {
		return flight;
	}

	public void setFlight(Flight flight) {
		this.flight = flight;
	}
	
}
