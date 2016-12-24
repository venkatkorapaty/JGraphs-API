package main.AbstractDataTypes;

import java.util.*;
import main.Edges.*;

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
	Map<Tuple<V, V>, List<Edge>> edgesAndVertices;

	public EdgeVertexMap() {
		edgesAndVertices = new HashMap<Tuple<V, V>, List<Edge>> ();
	}

	public void addEdge(V v1, V v2, Edge edge) {
		List<Edge> tempEdges = edgesAndVertices.get(new DefaultTuple<V, V>(v1, v2));
		if (tempEdges == null) {
			edgesAndVertices.put(new DefaultTuple<V, V>(v1, v2), new ArrayList<Edge>(Arrays.asList(edge)));
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
	public List<Edge> getEdge(V v1, V v2) {
		return edgesAndVertices.get(new DefaultTuple<V, V>(v1, v2));
	}

	public boolean removeVertex(V v1) {
		boolean found = false;
		for (Tuple<V, V> tuple: edgesAndVertices.keySet()) {
			if (tuple.getLeft().equals(v1) || tuple.getRight().equals(v1)) {
				edgesAndVertices.remove(tuple);
				found = true;
			}
		}
		return found;
	}
}
