package main.Graphs;

import main.Interfaces.*;

/**
 * 
 * @author Venkat Korapaty
 * @since October 10th, 2016
 *
 * @param <V>
 * @param <E>
 */
public abstract class DefaultGraph<V, E> 
	implements Graph<V, E> {
	
	public DefaultGraph() {
		
	}
	/*
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
	public abstract DefaultGraph<V, E> buildGraph(int[][] graphRepresentation, int type);
	
	/**
	 * Tells you if the graph's edge set has an edge
	 * with v1 and v2 as the ends of the edge
	 * @param v1
	 * @param v2
	 * @return true/false
	 */
	public boolean containsEdge(V v1, V v2) {
		return getEdge(v1, v2) != null;
	}
	
	/**
	 * Tells you if the graph's vertex set contains v1
	 * @param v1
	 * @return true/false
	 */
	public boolean containsVertex(V v1) {
		return getVertices().contains(v1);
	}

	//public boolean removeEdge(E edge) {
		// TODO Auto-generated method stub
	//	return false;
	//}

}
