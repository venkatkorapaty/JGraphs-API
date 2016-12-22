package main.AbstractDataTypes;

import java.util.*;
import main.Edges.*;
import main.Vertices.*;
import main.AbstractDataTypesInterfaces.*;

/**
 * This ADT is to let us map vertices to edges.
 * The implemenation of this ADT uses extra space complexity.
 * @author Venkat Korapaty
 *
 */
public class EdgeVertexMap<V, E>
	implements EdgeVertexLink<V, E> {

	/*
	 * Using E as the generic doesn't support multiple edges between
	 * the same 2 vertices
	 */
	Map<Tuple<Vertex, Vertex>, List<Edge>> edgesAndVertices;

	public EdgeVertexMap() {
		edgesAndVertices = new HashMap<Tuple<Vertex, Vertex>, List<Edge>> ();
	}

	public void addEdge(Vertex v1, Vertex v2, Edge edge) {
		List<Edge> tempEdges = edgesAndVertices.get(new DefaultTuple<Vertex, Vertex>(v1, v2));
		if (tempEdges == null) {
			edgesAndVertices.put(new DefaultTuple<Vertex, Vertex>(v1, v2), new ArrayList<Edge>(Arrays.asList(edge)));
		}
		else {
			tempEdges.add(edge);
		}
	}

	/**
	 * Gets the edge(s) shared with the 2 vertices
	 * @param v1
	 * @param v2
	 * @return edge
	 */
	public List<Edge> getEdge(Vertex v1, Vertex v2) {
		return edgesAndVertices.get(new DefaultTuple<Vertex, Vertex>(v1, v2));
	}

	/**
	 * Given an edge, removes it from the map.
	 * @return true if exists, false otherwise
	 */
	public boolean removeEdge(Edge edge) {
		Tuple<Vertex, Vertex> incidentVertices = edge.getIncidentVertices();
		List<Edge> edges = edgesAndVertices.get(incidentVertices);
		if (edges == null) {
			return false;
		}
		else if (edges.size() == 1) {
			edgesAndVertices.remove(incidentVertices);
			return true;
		}
		else {
			edges.remove(edge);
			return true;
		}
	}

	public boolean removeVertex(Vertex v1) {
		boolean found = false;
		for (Tuple<Vertex, Vertex> tuple: edgesAndVertices.keySet()) {
			if (tuple.getLeft().equals(v1) || tuple.getRight().equals(v1)) {
				edgesAndVertices.remove(tuple);
				found = true;
			}
		}
		return found;
	}
}
