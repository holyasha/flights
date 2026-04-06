package com.example.flights.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.flights.model.entities.Flight;

public interface FlightsRepository extends JpaRepository<Flight, Long> {

}