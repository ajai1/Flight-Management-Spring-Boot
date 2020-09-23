package com.ajai.flightmanagement.service;

import java.util.List;

import com.ajai.flightmanagement.dto.FlightDto;
import com.ajai.flightmanagement.entity.Flight;


public interface FlightService {
	
	public List<Flight> getAllFlight();
	
	public List<FlightDto> getFlightsByAirline(String airlineCode);

}
