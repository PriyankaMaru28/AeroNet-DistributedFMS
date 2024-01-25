package com.fms.FlightManagementSystem.model;

public class Booking {

    private long bookingId;
    private long passengerId;
    private long flightId;


    public long getBookingId() {
        return bookingId;
    }

    public void setBookingId(long bookingId) {
        this.bookingId = bookingId;
    }

    public long getPassengerId() {
        return passengerId;
    }

    public void setPassengerId(long passengerId) {
        this.passengerId = passengerId;
    }

    public long getFlightId() {
        return flightId;
    }

    public void setFlightId(long flightId) {
        this.flightId = flightId;
    }


    public Booking(long bookingId, long passengerId, long flightId) {
        this.bookingId = bookingId;
        this.passengerId = passengerId;
        this.flightId = flightId;
    }
}
