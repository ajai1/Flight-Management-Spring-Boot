package com.ajai.flightmanagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ajai.flightmanagement.entity.Airline;
import com.ajai.flightmanagement.service.AirlineService;

@RestController
@RequestMapping("/airline")
@ComponentScan("com.ajai.flightmanagement.serviceImpl")
public class AirlineController {
	
	@Autowired
	AirlineService airlineService;

	@GetMapping("/all")
	public List<Airline> getAllAirline(){
		return airlineService.getAllAirline();
	}
	
	@PostMapping("")
	public Airline addAirline(@RequestBody Airline airline){
		return airlineService.addAirline(airline);
	}
	
}
