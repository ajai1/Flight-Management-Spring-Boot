package com.ajai.flightmanagement.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ajai.flightmanagement.dto.FlightDto;
import com.ajai.flightmanagement.entity.Flight;
import com.ajai.flightmanagement.repositories.FlightRepository;
import com.ajai.flightmanagement.service.FlightService;

@Service
public class FlightServiceImpl implements FlightService{

	@Autowired
	FlightRepository flightRepository;
	
	@Override
	public List<Flight> getAllFlight() {
		return flightRepository.findAll();
	}

	@Override
	public List<FlightDto> getFlightsByAirline(String airlineCode) {
		return flightRepository.getFlightByAirline(airlineCode);
	}

}
