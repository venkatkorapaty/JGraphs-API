package main.Graphs;

import java.util.*;
import main.Interfaces.*;
import main.AbstractDataTypes.*;
import main.Vertices.*;
import main.Edges.*;

public class DiGraph<V, E>
	extends DefaultGraph<V, E>
	implements DirectedGraph<V, E> {
	
	Graph<V, E> graph;

	@Override
	public List<Edge> getEdge(Vertex source, Vertex target) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public double getEdgeWeight(E edge) {
		// TODO Auto-generated method stub
		return 0.0;
	}

	@Override
	public boolean removeEdge(Edge edge) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean removeVertex(V vertex) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Map<Object, Vertex> getVertices() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Set<Edge> getEdges() {
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
