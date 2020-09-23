package com.ajai.flightmanagement.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;

import com.ajai.flightmanagement.entity.Airline;
import com.ajai.flightmanagement.repositories.AirlineRepository;
import com.ajai.flightmanagement.repositories.FlightRepository;
import com.ajai.flightmanagement.service.AirlineService;

@Service
public class AirlineServiceImpl implements AirlineService{
	
	@Autowired
	AirlineRepository airlineRepository;
	@Autowired
	FlightRepository flightRepository;

	@Override
	public List<Airline> getAllAirline() {
		return airlineRepository.findAll();
	}

	@Override
	public Airline addAirline(Airline airline) {
		if(airline != null) {
			return airlineRepository.save(airline);		
		}
		return new Airline();
	}

}
