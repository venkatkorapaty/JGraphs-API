package main.Graphs;

import main.AbstractDataTypes.*;
import main.AbstractDataTypesInterfaces.*;
import main.Interfaces.*;
import main.Vertices.Vertex;
import main.Edges.*;

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
	
	private Map<Object, Vertex> vertices;
	private Set<Edge> edges;
	private EdgeVertexLink<Vertex, Edge> edgesAndVertices;
	
	public DefaultGraph() {
		vertices = new HashMap<Object, Vertex>();
		edges = new HashSet<Edge>();
		edgesAndVertices = new EdgeVertexMap<Vertex, Edge>();
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
	public boolean containsEdge(Vertex v1, Vertex v2) {
		List<Edge> tempEdges = getEdge(v1, v2);
		if (tempEdges != null) {
			if (tempEdges.size() > 0)
				return true;
		}
		return false;
	}
	
	/**
	 * Tells you if the graph's vertex set contains v1
	 * @param v1
	 * @return true/false
	 */
	public boolean containsVertex(V v1) {
		return vertices.containsValue(v1);
	}

	@Override
	public List<Edge> getEdge(Vertex source, Vertex target) {
		return edgesAndVertices.getEdge(source, target);
	}

	public double getEdgeWeight(E edge) {
		return 1.0;
	}

	@Override
	public boolean removeEdge(Edge edge) {
		Tuple<Vertex, Vertex> incidentVertices = edge.getIncidentVertices();
		edges.remove(edge);
		// TODO: add "removeEdge" function to EdgeVertexLink
		edgesAndVertices.removeEdge(edge);
		return false;
	}

	@Override
	public boolean removeVertex(V vertex) {
		// TODO
		return false;
	}

	@Override
	public Map<Object, Vertex> getVertices() {
		return vertices;
	}

	@Override
	public Set<Edge> getEdges() {
		return edges;
	}

	@Override
	public boolean containsEdge(E edge) {
		return edges.contains(edge);
	}
}
