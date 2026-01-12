package service;
import java.util.HashMap;
import java.util.Map;

public class ReportService {

    // Total wait time accumulated from all trips
    private int totalWaitTime;

    // Number of completed trips
    private int completedRides;

    // Frequency of pickup nodes (busy areas)
    private HashMap<Integer, Integer> busyNodes;
 
    public ReportService() {
        this.totalWaitTime = 0;
        this.completedRides = 0;
        this.busyNodes = new HashMap<>();
    }

        public void recordTrip(int waitTime, int pickupNode) {
        totalWaitTime += waitTime;

        // HashMap frequency counting
        busyNodes.put(
            pickupNode,
            busyNodes.getOrDefault(pickupNode, 0) + 1
        );
    }

    //Updates analytics when a trip is COMPLETED
    public void completeTrip() {
        completedRides++;
    }

    //Generates and prints system report
    public void generateReport() {
        System.out.println("\n SYSTEM REPORT");

        if (completedRides > 0) {
            double avgWait = (double) totalWaitTime / completedRides;
            System.out.println("Average Wait Time: " + avgWait);
        } else {
            System.out.println("Average Wait Time: N/A (no completed rides)");
        }

        System.out.println("Total Completed Rides: " + completedRides);

        System.out.println("Busy Pickup Nodes:");
        if (busyNodes.isEmpty()) {
            System.out.println("No pickup data available.");
        } else {
            for (Map.Entry<Integer, Integer> entry : busyNodes.entrySet()) {
                System.out.println(
                    "Node " + entry.getKey() +
                    " -> " + entry.getValue() + " pickups"
                );
            }
        }

        System.out.println("\n");
    }

}
