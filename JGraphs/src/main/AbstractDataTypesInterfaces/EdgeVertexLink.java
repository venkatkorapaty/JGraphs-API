package main.AbstractDataTypesInterfaces;

import java.util.*;
import main.Edges.*;

/**
 * The interface to link vertex pairs and edges
 * @author Venkat Korapaty
 *
 */
public interface EdgeVertexLink<V, E> {

	/**
	 * Adds an edge between vertices v1	 and v2
	 * making them adjacent.
	 * @param v1
	 * @param v2
	 */
	void addEdge(V v1, V v2, Edge edge);

	/**
	 * Gets the edge for 2 vertices.
	 * If the 2 vertices are not adjacent, return null
	 * @param v1
	 * @param v2
	 * @return edge incident to source and target vertices
	 */
	List<Edge> getEdge(V v1, V v2);

	boolean removeVertex(V v1);
}
