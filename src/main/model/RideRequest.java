package model;

public class RideRequest {
    private String id;
    private Rider rider;
    private String destination;

    public RideRequest(String id, Rider rider, String destination) {
        this.id = id;
        this.rider = rider;
        this.destination = destination;
    }

    public String getId() { return id; }
    public Rider getRider() { return rider; }
    public String getDestination() { return destination; }
}