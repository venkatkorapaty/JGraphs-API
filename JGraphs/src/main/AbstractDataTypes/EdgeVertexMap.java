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
	Map<Tuple<V, V>, List<E>> edgesAndVertices;

	public EdgeVertexMap() {
		edgesAndVertices = new HashMap<Tuple<V, V>, List<E>> ();
	}

	public void addEdge(V v1, V v2, E edge) {
		List<E> temp_edges = edgesAndVertices.get(new DefaultTuple<V, V>(v1, v2));
		if (temp_edges == null) {
			edgesAndVertices.put(new DefaultTuple<V, V>(v1, v2), new ArrayList<E>(Arrays.asList(edge)));
		}
		else {
			temp_edges.add(edge);
		}
	}

	/**
	 * Gets the edge(s) shared with the 2 vertices
	 * @param v1
	 * @param v2
	 * @return edge
	 */
	public List<E> getEdge(V v1, V v2) {
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
