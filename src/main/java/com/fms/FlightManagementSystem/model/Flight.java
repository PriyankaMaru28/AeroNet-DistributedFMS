package com.fms.FlightManagementSystem.model;

public class Flight {


    private float flightID;
    private String originCountry;
    private String flightStatus;
    private String dateOfFlight;
    private String destinationCountry;
    private String delayedHours;

    private String departureTime;
    private int totalNumberOfSeats;

    // private manager id

    public float getFlightID() {
        return flightID;
    }

    public void setFlightID(float flightID) {
        this.flightID = flightID;
    }

    public String getOriginCountry() {
        return originCountry;
    }

    public void setOriginCountry(String originCountry) {
        this.originCountry = originCountry;
    }

    public String getFlightStatus() {
        return flightStatus;
    }

    public void setFlightStatus(String flightStatus) {
        this.flightStatus = flightStatus;
    }

    public String getDateOfFlight() {
        return dateOfFlight;
    }

    public void setDateOfFlight(String dateOfFlight) {
        this.dateOfFlight = dateOfFlight;
    }

    public String getDestinationCountry() {
        return destinationCountry;
    }

    public void setDestinationCountry(String destinationCountry) {
        this.destinationCountry = destinationCountry;
    }

    public String getDelayedHours() {
        return delayedHours;
    }

    public void setDelayedHours(String delayedHours) {
        this.delayedHours = delayedHours;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(String departureTime) {
        this.departureTime = departureTime;
    }

    public int getTotalNumberOfSeats() {
        return totalNumberOfSeats;
    }

    public void setTotalNumberOfSeats(int totalNumberOfSeats) {
        this.totalNumberOfSeats = totalNumberOfSeats;
    }

    public Flight(float flightID, String originCountry, String flightStatus, String dateOfFlight, String destinationCountry, String delayedHours, String departureTime, int totalNumberOfSeats) {
        this.flightID = flightID;
        this.originCountry = originCountry;
        this.flightStatus = flightStatus;
        this.dateOfFlight = dateOfFlight;
        this.destinationCountry = destinationCountry;
        this.delayedHours = delayedHours;
        this.departureTime = departureTime;
        this.totalNumberOfSeats = totalNumberOfSeats;
    }
}
