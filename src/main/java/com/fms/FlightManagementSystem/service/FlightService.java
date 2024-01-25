package com.fms.FlightManagementSystem.service;


import com.fms.FlightManagementSystem.model.Booking;
import com.fms.FlightManagementSystem.model.Flight;
import com.fms.FlightManagementSystem.model.Manager;
import com.fms.FlightManagementSystem.model.Passenger;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Component
public class FlightService {

    public List<Flight> FlightList = new ArrayList<>();
    public List<Booking> BookingList = new ArrayList<>();
    public List<Passenger> PassengerList = new ArrayList<>();
    public HashMap<String,Flight> ManagerFlightList = new HashMap<>();

    public long createFlight(Flight f1){

//        long BookingId = BookingList.size()+1;
        long FlightId = FlightList.size()+1;
        f1.setFlightID(FlightId);
        // extract the manager's id from user's login and set it with flight object

      FlightList.add(f1);
     // ManagerFlightList.put("M101",f1);

        return FlightId ;

    }

    public List<Flight> getAllFlight(){
        return FlightList;
    }

    public long bookflight(Passenger p){

        long passengerId = PassengerList.size()+1;
        long bookingId = BookingList.size()+1;
        p.setUserID(passengerId);
        p.setBookingId(bookingId);
        PassengerList.add(p);

        BookingList.add(new Booking(passengerId,bookingId,1
        ));

    return bookingId;

    }





}
