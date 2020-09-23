package com.ajai.flightmanagement.controller;

import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.util.CollectionUtils;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ajai.flightmanagement.dto.FlightDto;
import com.ajai.flightmanagement.entity.Flight;
import com.ajai.flightmanagement.service.FlightService;

@RestController
@RequestMapping("/flights")
@ComponentScan("com.ajai.flightmanagement.serviceImpl")
public class FlightController {
	
	@Autowired
	FlightService flightService;
	
	@GetMapping("")
	public List<Flight> getAllFlight(){
		return flightService.getAllFlight();
	}
	
	@GetMapping("/airline")
	public List<FlightDto> getFlightsByAirline(@RequestParam Map<String, String> allParams){
		String airlineCode ="";
		if(!CollectionUtils.isEmpty(allParams)){
			for(Entry<String, String> entry : allParams.entrySet()){
				String param = entry.getKey();
				String val = entry.getValue();
				if("code".equalsIgnoreCase(param) && !StringUtils.isEmpty(val)){
					airlineCode = val;
				}
			}
		}
		return flightService.getFlightsByAirline(airlineCode);
	}

}
