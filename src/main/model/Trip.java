package model;

import util.IdGenerator;

public class Trip {
    private String tripId;
    private Driver driver;
    private RideRequest request;
    private TripStatus status;

    public Trip() {
        // Default constructor for stubs
    }

    public Trip(Driver driver, RideRequest request) {
        this.tripId = IdGenerator.generateTripId();
        this.driver = driver;
        this.request = request;
        this.status = TripStatus.DISPATCHED;
    }

    public String getTripId() { return tripId; }
    public Driver getDriver() { return driver; }
    public RideRequest getRequest() { return request; }
    public TripStatus getStatus() { return status; }
    
    public void setStatus(TripStatus status) { this.status = status; }
}