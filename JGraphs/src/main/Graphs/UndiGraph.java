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
	implements UndirectedGraph<V, E>{

	Graph<V, E> graph;
	
	public UndiGraph() {
		
	}

	@Override
	public E getEdge(V source, V target) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Tuple<V, V> getIncidenceVertices(E edge) {
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
	public Set<V> getVertices() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Set<E> getEdges() {
		// TODO Auto-generated method stub
		return null;
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
