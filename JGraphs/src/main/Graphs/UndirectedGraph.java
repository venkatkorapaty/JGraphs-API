package main.Graphs;

import java.util.*;
import main.AbstractDataTypes.Tuple;
import main.Interfaces.*;

/**
 * An undirected, unweighted graph.
 * @author Venkat Korapaty
 * @since October 10th, 2016
 *
 * @param <V>
 * @param <E>
 */
public class UndirectedGraph<V, E>
	extends Graph<V, E>
	implements IUndirectedGraph<V, E>{

	@Override
	public E getEdge(V source, V target) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Tuple<V, V> getIncidenceVertices(Object edge) {
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

	
}
