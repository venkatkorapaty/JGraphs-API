package main.AbstractDataTypes;

import java.util.*;

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
	Map<Tuple<V, V>, E> edgesAndVertices;

	public EdgeVertexMap() {
		edgesAndVertices = new HashMap<Tuple<V, V>, E> ();
	}

	/**
	 * Gets the edge shared with the 2 vertices
	 * @param v1
	 * @param v2
	 * @return edge
	 */
	public E getEdge(V v1, V v2) {
		return edgesAndVertices.get(new DefaultTuple<V, V>(v1, v2));
	}

	public boolean removeVertex(V v1) {
		// TODO
		return false;
	}
}
