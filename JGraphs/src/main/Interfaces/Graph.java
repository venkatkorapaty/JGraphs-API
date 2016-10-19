package main.Interfaces;

import java.util.*;
import main.AbstractDataTypes.*;

/**
 * 
 * @author Venkat Korapaty
 * @since October 10th, 2016
 *
 * @param <V>
 * @param <E>
 */
public interface Graph<V, E> {

	/**
	 * Takes a starting and finish vertex, and returns an edge between them.
	 * Returns null if such an edge does not exist, or if any of the parameters are null.
	 * @param source
	 * @param target
	 * @return the edge connecting source and target, should one exist
	 */
	E getEdge(V source, V target);
	
	/**
	 * Gets the weight of edge
	 * @param edge
	 * @return weight of edge
	 */
	E getEdgeWeight(E edge);
	
	/**
	 * Returns true if the edge is in the graph and is removed.
	 * False if the edge does not exist in the graph
	 * @param edge
	 * @return true/false
	 */
	boolean removeEdge(E edge);
	
	/**
	 * Returns true if the vertex is in the graph; the vertex is removed
	 * and all adjacent edges. False if the vertex is not in the graph.
	 * @param vertex
	 * @return true/false
	 */
	boolean removeVertex(V vertex);
	
	/**
	 * Gets the set of vertices for the graph
	 * @return set of vertices
	 */
	Set<V> getVertices();
	
	/**
	 * Gets the set of edges for the graph
	 * @return set of edges
	 */
	Set<E> getEdges();
	
	/**
	 * Checks if the graph contains edge in it's edge set
	 * @param e
	 * @return true/false
	 */
	boolean containsEdge(E edge);
	
	/**
	 * Checks if the graph contains vertex in it's vertex set
	 * @param v
	 * @return true/false
	 */
	boolean containsVertex(V vertex);
}
