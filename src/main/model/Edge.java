package model;


public class Edge {
    private final int source;
    private final int destination;
    private final double weight;

public Edge(int source, int destination, double weight) {
    
    if (source <0){
        throw new IllegalArgumentException("Source must be non-negative, got: " + source);

    }

        if (destination <0){
        throw new IllegalArgumentException("Destination must be non-negative, got: " + destination);

    }
        if (source == destination){
        throw new IllegalArgumentException("Source and destination cannot be the same");

    }
        if (weight <=0){
        throw new IllegalArgumentException("Weight must be positive"+weight);

    }
    this.source = source;
    this.destination = destination;
    this.weight = weight;
}

public int getSource(){
    return source;
}

public int getDestination(){
    return destination;
}
public double getWeight(){
    return weight;
}

/*Utility*/
@Override
public String toString() {
    return "Edge[" + source + " -> " + destination + ", weight=" + weight + "]";
}

}






/*
DOCUMENTATION
________________
The class Edge is a representation of a road/path in the city graph.
An edge connects two locations which we refer to as nodes. Has an attribute weight/ distance. 
packages are like a folder that organises the JAVA classes into logical groups. 
Once created the values cannot change-> immutable
Used by the city graph to store the road connections. 
 
 package model;

 * Represents a weighted, directed edge (road) in the city graph.
 * 
 * KEY PROPERTIES:
 * - Immutable: Once created, values cannot be changed
 * - Validated: Constructor ensures all constraints are met
 * - Directed: Represents a one-way connection from source to destination
 * 
 * CONSTRAINTS:
 * - Source and destination must be non-negative (>= 0)
 * - Source and destination must be different (no self-loops)
 * - Weight must be strictly positive (> 0)
 * 
 * USAGE BY OTHER MODULES:
 * - CityGraph uses Edge objects to store road connections
 * - Dijkstra reads edge weights during shortest path computation
 * - Other members use getters to access edge properties
 * 
 * @author [Your Name] - Member 1
 *
public class Edge {
    // ========== FIELDS ==========
    
    private final int source;       // Starting node ID
    private final int destination;  // Ending node ID
    private final double weight;    // Cost to travel (distance/time)
    
    // ========== CONSTRUCTOR ==========
    
    /**
     * Creates a new weighted edge between two nodes.
     * 
     * @param source      the starting node ID (must be >= 0)
     * @param destination the ending node ID (must be >= 0, must be != source)
     * @param weight      the cost to travel this edge (must be > 0)
     * @throws IllegalArgumentException if any constraint is violated
     *
    public Edge(int source, int destination, double weight) {
        // Validate source (must be non-negative)
        if (source < 0) {
            throw new IllegalArgumentException("Source must be non-negative, got: " + source);
        }
        
        // Validate destination (must be non-negative)
        if (destination < 0) {
            throw new IllegalArgumentException("Destination must be non-negative, got: " + destination);
        }
        
        // Validate source != destination (no self-loops)
        if (source == destination) {
            throw new IllegalArgumentException("Source and destination cannot be the same, got: " + source);
        }
        
        // Validate weight (must be positive)
        if (weight <= 0) {
            throw new IllegalArgumentException("Weight must be positive, got: " + weight);
        }
        
        // Initialize fields (all validations passed)
        this.source = source;
        this.destination = destination;
        this.weight = weight;
    }
    
    // ========== GETTERS ==========
    
    /**
     * Returns the source node ID.
     * 
     * @return the starting node of this edge
     *
    public int getSource() {
        return source;
    }
    
    /**
     * Returns the destination node ID.
     * 
     * @return the ending node of this edge
     *
    public int getDestination() {
        return destination;
    }
    
    /**
     * Returns the weight (cost) of this edge.
     * 
     * @return the weight/cost of traveling this edge
     *
    public double getWeight() {
        return weight;
    }
    
    // ========== UTILITY METHODS ==========
    
    /**
     * Returns a string representation of this edge.
     * Useful for debugging and logging.
     * 
     * @return a string in the format "Edge[source -> destination, weight=w]"
     *
    @Override
    public String toString() {
        return "Edge[" + source + " -> " + destination + ", weight=" + weight + "]";
    }
}
 
 */