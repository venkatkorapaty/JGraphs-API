package main.Graphs;

import main.AbstractDataTypes.*;
import main.Interfaces.*;
import java.util.*;

/**
 * 
 * @author Venkat Korapaty
 * @since October 10th, 2016
 *
 * @param <V>
 * @param <E>
 */
public class DefaultGraph<V, E> 
	extends AbstractGraph<V, E> {
	
	private Set<V> vertices;
	private Set<E> edges;
	private EdgeVertexMap<V, E> edgesAndVertices;
	
	public DefaultGraph() {
		
	}

	@Override
	public Graph<V, E> buildGraph(int[][] graphRepresentation, int type) {
		// TODO Auto-generated method stub
		return null;
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
		return vertices.contains(v1);
	}

	@Override
	public List<E> getEdge(V source, V target) {
		return edgesAndVertices.getEdge(source, target);
	}

	@Override
	public E getEdgeWeight(E edge) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean removeEdge(E edge) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean removeVertex(V vertex) {
		// TODO
		return false;
	}

	@Override
	public Set<V> getVertices() {
		return vertices;
	}

	@Override
	public Set<E> getEdges() {
		return edges;
	}

	@Override
	public boolean containsEdge(E edge) {
		return edges.contains(edge);
	}
}
