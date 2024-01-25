package com.fms.FlightManagementSystem.model;

import java.time.LocalDate;

public class Manager {

    //project lombok - https://projectlombok.org
    // generate id

    private String managerId;
    private String airline;
    private LocalDate dateOfFlight;
    private String departureTime;
    private String originCountry;
    private String destinationCountry;
    private String seatClass;
    private String flightStatus;
    private String delayedHours;

    //private lastedited --> timestamp


    public String getManagerId() {
        return managerId;
    }

    public void setManagerId(String managerId) {
        this.managerId = managerId;
    }

    public String getAirline() {
        return airline;
    }

    public void setAirline(String airline) {
        this.airline = airline;
    }

    public LocalDate getDateOfFlight() {
        return dateOfFlight;
    }

    public void setDateOfFlight(LocalDate dateOfFlight) {
        this.dateOfFlight = dateOfFlight;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(String departureTime) {
        this.departureTime = departureTime;
    }

    public String getOriginCountry() {
        return originCountry;
    }

    public void setOriginCountry(String originCountry) {
        this.originCountry = originCountry;
    }

    public String getDestinationCountry() {
        return destinationCountry;
    }

    public void setDestinationCountry(String destinationCountry) {
        this.destinationCountry = destinationCountry;
    }

    public String getSeatClass() {
        return seatClass;
    }

    public void setSeatClass(String seatClass) {
        this.seatClass = seatClass;
    }

    public String getFlightStatus() {
        return flightStatus;
    }

    public void setFlightStatus(String flightStatus) {
        this.flightStatus = flightStatus;
    }

    public String getDelayedHours() {
        return delayedHours;
    }

    public void setDelayedHours(String delayedHours) {
        this.delayedHours = delayedHours;
    }
}
