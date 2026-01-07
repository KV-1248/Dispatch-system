package graph;

import java.util.HashMap;
import java.util.Map;

public class Dijkstra {

    /**
     * Calculates the shortest distance from the source node to ALL other nodes.
     * @param graph The city graph
     * @param sourceNode The starting node ID (e.g., "A")
     * @return A Map where Key = Node ID, Value = Distance (Integer)
     */
    public Map<String, Integer> calculateShortestPaths(CityGraph graph, String sourceNode) {
        // STUB: Member 1 will implement the real Dijkstra logic here.
        // For now, return an empty map or dummy data to allow compilation.
        System.out.println("[STUB] Dijkstra.calculateShortestPaths called for: " + sourceNode);
        return new HashMap<>(); 
    }
}