package main.Graphs;

import java.util.*;

import main.AbstractDataTypes.*;
import main.Interfaces.*;

/**
 * An undirected, unweighted graph.
 * @author Venkat Korapaty
 * @since October 10th, 2016
 *
 * @param <V>
 * @param <E>
 */
public class UndiGraph<V, E>
	extends DefaultGraph<V, E>
	implements UndirectedGraph<V, E> {

	Graph<V, E> graph;
	
	public UndiGraph() {
		graph = new UndiGraph<V, E>();
	}

	@Override
	public List<E> getEdge(V source, V target) {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean removeEdge(E edge) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean removeVertex(V vertex) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	/**
	 * Gets the graph's vertex set
	 * @return set of vertices
	 */
	public Set<V> getVertices() {
		return graph.getVertices();
	}

	@Override
	/**
	 * Gets the graph's edge set
	 * @return set of edges
	 */
	public Set<E> getEdges() {
		return graph.getEdges();
	}

	@Override
	public E getEdgeWeight(E edge) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int degreeOf(V vertex) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean containsEdge(E edge) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean containsVertex(V vertex) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public DefaultGraph<V, E> buildGraph(int[][] graphRepresentation, int type) {
		// TODO Auto-generated method stub
		return null;
	}

	
}
