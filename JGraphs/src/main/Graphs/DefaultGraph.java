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
