package main.AbstractDataTypesInterfaces;

/**
 * The interface to link vertex pairs and edges
 * @author Venkat Korapaty
 *
 */
public interface EdgeVertexLink<V, E> {

	/**
	 * Gets the edge for 2 vertices.
	 * If the 2 vertices are not adjacent, return null
	 * @param v1
	 * @param v2
	 * @return edge incident to source and target vertices
	 */
	E getEdge(V v1, V v2);

	boolean removeVertex(V v1);
}
