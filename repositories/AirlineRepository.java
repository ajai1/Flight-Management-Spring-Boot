package com.ajai.flightmanagement.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ajai.flightmanagement.entity.Airline;

public interface AirlineRepository extends JpaRepository<Airline, Long>{

}
