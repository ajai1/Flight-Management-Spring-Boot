package com.ajai.flightmanagement.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.ajai.flightmanagement.dto.FlightDto;
import com.ajai.flightmanagement.entity.Flight;

public interface FlightRepository extends JpaRepository<Flight, Long>{
	
	@Query("SELECT new com.ajai.flightmanagement.dto.FlightDto(a.airlineCode, f) from Airline a JOIN a.flights f where a.airlineCode=:airline")
	public List<FlightDto> getFlightByAirline(@Param("airline") String airline);

}
