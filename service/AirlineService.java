package com.ajai.flightmanagement.service;

import java.util.List;

import com.ajai.flightmanagement.entity.Airline;

public interface AirlineService {

	public List<Airline> getAllAirline();
	
	public Airline addAirline(Airline airline);
	
}
