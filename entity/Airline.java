package com.ajai.flightmanagement.entity;

import java.util.List;

import javax.persistence.*;

@Entity
@Table(name="Airline")
public class Airline {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	
	private String airlineCode;
	
	@OneToMany(targetEntity = Flight.class, cascade= CascadeType.ALL)
	@JoinColumn(name="airlinefk", referencedColumnName= "id")
	private List<Flight> flights;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getAirlineCode() {
		return airlineCode;
	}

	public void setAirlineCode(String airlineCode) {
		this.airlineCode = airlineCode;
	}

	public List<Flight> getFlights() {
		return flights;
	}

	public void setFlights(List<Flight> flights) {
		this.flights = flights;
	}
	
	
	
}
