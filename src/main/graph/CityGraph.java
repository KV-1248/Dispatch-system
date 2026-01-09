package graph;

import model.Edge;
import java.util.List;
import java.util.ArrayList;
/**We will be using and Adajacency List 
to represent the graph of city locations(nodes) with weights(distance/time) 

Store nodes and edges between them 
AL is advantagious for small project like ours since its efficienct neighbour lookup
The no of nodes are immutable(fixed at innitialization i.e final)

HOW ITLL BE USED BY OTHER MODULES
itll be initialized with a fixed no of nodes
Adding edges -> addEdge() method
Dijkstra will query neighbours via getNeighbours() method
*/
public class CityGraph {

    /** AL representation of the graph.
      Index i contains a list of all edges originating from node i. */

    private final List<List<Edge>> adjList;

        /**
      Total number of nodes in the graph.
      Fixed at creation - nodes cannot be added or removed later. final
     */

    private final int numNodes;

    public CityGraph(int numNodes){
        if(numNodes <=0){
            throw new IllegalArgumentException("Number of nodes must be positive, got: " + numNodes);
        }

        if(numNodes >100){
            throw new IllegalArgumentException("Graph should have at most 100 nodes");
        }

        this.numNodes = numNodes;
        this.adjList = new ArrayList<>();

        for (int i = 0; i < numNodes; i++) {
       adjList.add(new ArrayList<>());
   }
    }

    public void addEdge(int source, int destination, double weight){
        //Validation checks
        if (source < 0 || source >= numNodes) {
            throw new IllegalArgumentException("Invalid source: " + source + " (must be 0-" + (numNodes-1) + ")");
        }

        if (destination < 0 || destination >= numNodes) {
            throw new IllegalArgumentException("Invalid destination: " + destination + " (must be 0-" + (numNodes-1) + ")");
        }
        //creating and Edge object

        Edge edge = new Edge(source, destination, weight);

        //adding it to corresponding correct node's list
        adjList.get(source).add(edge);
    }
}
