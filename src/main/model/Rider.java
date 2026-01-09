package model;

public class Rider {
    private String id;
    private String name;
    private String pickupLocation;

    public Rider(String id, String name, String pickupLocation) {
        this.id = id;
        this.name = name;
        this.pickupLocation = pickupLocation;
    }

    public String getId() { return id; }
    public String getPickupLocation() { return pickupLocation; }
}