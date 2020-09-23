package com.ajai.flightmanagement.entity;

import java.util.Date;

import javax.persistence.*;

@Entity
@Table(name="Flight")
public class Flight {
	
	private long id;
	
	private String flightNumber;
	
	private String destination;
	
	private String arrival;

	private Date departureDateAndTime;
	
	private Date arrivalDateAndTime;
	
	private int passengerCapacity;
	
	private int cargoCapacity;
	
	private String aircraftType;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getFlightNumber() {
		return flightNumber;
	}

	public void setFlightNumber(String flightNumber) {
		this.flightNumber = flightNumber;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public String getArrival() {
		return arrival;
	}

	public void setArrival(String arrival) {
		this.arrival = arrival;
	}

	public Date getDepartureDateAndTime() {
		return departureDateAndTime;
	}

	public void setDepartureDateAndTime(Date departureDateAndTime) {
		this.departureDateAndTime = departureDateAndTime;
	}

	public Date getArrivalDateAndTime() {
		return arrivalDateAndTime;
	}

	public void setArrivalDateAndTime(Date arrivalDateAndTime) {
		this.arrivalDateAndTime = arrivalDateAndTime;
	}

	public int getPassengerCapacity() {
		return passengerCapacity;
	}

	public void setPassengerCapacity(int passengerCapacity) {
		this.passengerCapacity = passengerCapacity;
	}

	public int getCargoCapacity() {
		return cargoCapacity;
	}

	public void setCargoCapacity(int cargoCapacity) {
		this.cargoCapacity = cargoCapacity;
	}

	public String getAircraftType() {
		return aircraftType;
	}

	public void setAircraftType(String aircraftType) {
		this.aircraftType = aircraftType;
	}
	
	
}
