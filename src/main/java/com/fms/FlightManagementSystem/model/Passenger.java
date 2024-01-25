package com.fms.FlightManagementSystem.model;

public class Passenger {

    private long userID;
    private long bookingId;

    private String firstName;
    private String LastName;
    private long phoneNumber;

    private String email;
    private String address;
    private String passportNumber;
    private String flightOriginCountry;
    private String flightDestinationCountry;
    private String seatClass;
    private String dateOfFlight;
    private String departureTime;



    public long getUserID() {
        return userID;
    }

    public void setUserID(long userID) {
        this.userID = userID;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPassportNumber() {
        return passportNumber;
    }

    public void setPassportNumber(String passportNumber) {
        this.passportNumber = passportNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getFlightOriginCountry() {
        return flightOriginCountry;
    }

    public void setFlightOriginCountry(String flightOriginCountry) {
        this.flightOriginCountry = flightOriginCountry;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFlightDestinationCountry() {
        return flightDestinationCountry;
    }

    public void setFlightDestinationCountry(String flightDestinationCountry) {
        this.flightDestinationCountry = flightDestinationCountry;
    }

    public String getSeatClass() {
        return seatClass;
    }

    public void setSeatClass(String seatClass) {
        this.seatClass = seatClass;
    }

    public String getDateOfFlight() {
        return dateOfFlight;
    }

    public void setDateOfFlight(String dateOfFlight) {
        this.dateOfFlight = dateOfFlight;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(String departureTime) {
        this.departureTime = departureTime;
    }

    public long getBookingId() {
        return bookingId;
    }

    public void setBookingId(long bookingId) {
        this.bookingId = bookingId;
    }
}
