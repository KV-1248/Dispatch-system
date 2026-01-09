# Dispatch Engine Integration Guide

**To:** Team Members (1, 2, 3, 5)
**From:** Member 4 (Dispatch Integration)

The **Dispatch Engine** is now complete. It contains the logic for matching riders to drivers using Dijkstra and a Greedy approach.

However, the engine currently relies on **Stub Methods** (empty placeholders) in your services. To make the system fully functional, you must implement the following methods exactly as defined below.

---

##  Member 1: Graph & Dijkstra
**File:** `src/main/graph/Dijkstra.java`

I need a method that returns the shortest distance from a source node to **all** other nodes.

```java
// MUST KEEP THIS SIGNATURE
public Map<String, Integer> calculateShortestPaths(CityGraph graph, String sourceNode) {
    // TODO: Implement Dijkstra's Algorithm using a PriorityQueue.
    // Return a Map where Key = Node ID (e.g., "B") and Value = Distance (e.g., 15)
}
```

---

##  Member 2: Driver Service
**File:** `src/main/service/DriverService.java`

I need to know who is free and I need to be able to mark them as busy.

```java
// MUST KEEP THIS SIGNATURE
public List<Driver> getAvailableDrivers() {
    // TODO: Return a list of all drivers where isAvailable == true
}

// MUST KEEP THIS SIGNATURE
public void updateDriverStatus(String driverId, boolean available) {
    // TODO: Find the driver by ID and update their status (and push to stack if needed)
}
```

---

##  Member 3: Ride Request Service
**File:** `src/main/service/RideRequestService.java`

I need to peek at the queue (to check availability) and poll it (to remove after matching).

```java
// MUST KEEP THIS SIGNATURE
public RideRequest peekNextRequest() {
    // TODO: Return the head of the Queue/PriorityQueue without removing it.
    // Return null if empty.
}

// MUST KEEP THIS SIGNATURE
public RideRequest pollNextRequest() {
    // TODO: Remove and return the head of the Queue/PriorityQueue.
}
```

---

##  Member 5: Trip Service
**File:** `src/main/service/TripService.java`

I need to create a trip object when a match is found.

```java
// MUST KEEP THIS SIGNATURE
public Trip createTrip(RideRequest request, Driver driver) {
    // TODO: Create a new Trip object.
    // Set status to DISPATCHED or ACTIVE.
    // Add to your internal tracking list/stack.
}
```

---

## ⚠️ Critical Note
**Do not change these method signatures.** The Dispatch Engine in `DispatchService.java` calls these specific methods. If you change the name or parameters, the integration will break.
