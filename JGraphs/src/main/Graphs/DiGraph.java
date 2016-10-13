package main.Graphs;

import java.util.*;

import main.Interfaces.*;
import main.AbstractDataTypes.*;

public class DiGraph<V, E>
	extends DefaultGraph<V, E>
	implements DirectedGraph<V, E> {
	
	Graph<V, E> graph;

	@Override
	public Tuple<V, V> getIncidenceVertices(E edge) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public E getEdge(V source, V target) {
		// TODO Auto-generated method stub
		return null;
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
	public V getTailVertex(E edge) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public V getHeadVertex(E edge) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getOutDegree(V vertex) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getInDegree(V vertex) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public DefaultGraph<V, E> buildGraph(int[][] graphRepresentation, int type) {
		// TODO Auto-generated method stub
		return null;
	}

}
