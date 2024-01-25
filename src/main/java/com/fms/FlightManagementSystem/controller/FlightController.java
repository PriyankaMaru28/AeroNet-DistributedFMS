package com.fms.FlightManagementSystem.controller;


import com.fms.FlightManagementSystem.model.Flight;
import com.fms.FlightManagementSystem.model.Passenger;
import com.fms.FlightManagementSystem.service.FlightService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class FlightController {

    @Autowired
    public FlightService flightService;

    @GetMapping("/")
    public String getAllFlight(){
        return "Flights";
    }

    @GetMapping("/api/getFlights")
    public List<Flight> getAllFlights(){
        return flightService.getAllFlight();
    }


    @PostMapping("/api/createFlight")
    public long createFlight(@RequestBody Flight f){
        // Add the flight details in the array;ist and return the booking id
        return flightService.createFlight(f);

    };

    @PostMapping("/api/bookings")
    public long bookFlight(@RequestBody Passenger p){
        return flightService.bookflight(p);
    }
}
