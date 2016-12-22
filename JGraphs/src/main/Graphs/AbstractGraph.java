package main.Graphs;

import java.util.List;

import main.Edges.Edge;
import main.Interfaces.*;
import main.Vertices.*;

public abstract class AbstractGraph<V, E extends IncidentToEdge>
	implements Graph<V, E> {

	/**
	 * @graphRepresentation - representation of a graph in either
	 *  adjacency matrix or adjacency list form
	 *  
	 * @type - either 0 or 1
	 * 	0 indicates that @graphRepresentation is in adjacency matrix form
	 *  1 indicates that @graphRepresentation is in adjacency list form
	 *  
	 * The method is intended to be used to easily convert an alternative
	 * graph representation into an available format
	 */
	public abstract Graph<V, E> buildGraph(int[][] graphRepresentation, int type);
	
	/**
	 * Tells you if the graph's edge set has an edge
	 * with v1 and v2 as the ends of the edge
	 * @param v1
	 * @param v2
	 * @return true/false
	 */
	public boolean containsEdge(Vertex v1, Vertex v2) {
		return getEdge(v1, v2) != null;
	}
	
	/**
	 * Tells you if the graph's vertex set contains v1
	 * @param v1
	 * @return true/false
	 */
	public boolean containsVertex(Vertex v1) {
		return getVertices().containsValue(v1);
	}

	public abstract List<Edge> getEdge(Vertex source, Vertex target);
}
