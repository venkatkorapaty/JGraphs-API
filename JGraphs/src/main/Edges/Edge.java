package main.Edges;

import main.AbstractDataTypes.Tuple;

/**
 * 
 * @author Venkat Korapaty
 * @since October 11, 2016
 */
public class Edge<V> {

	V v1;
	V v2;
	
	public Edge() {
		
	}

	/**
	 * Constructor for an edge given the vertices
	 * @param v1
	 * @param v2
	 */
	public Edge(V v1, V v2) {
		this.v1 = v1;
		this.v2 = v2;
	}

	/**
	 * Returns the vertices that the edge is
	 * incident to.
	 * @return Tuple<V, V>(v1, v2)
	 */
	public Tuple<V, V> getIncidenceVertices() {
		return new Tuple<V, V>(this.v1, this.v2);
	}

	/**
	 * Gets the source vertex
	 * @return V v1
	 */
	public V getSource() {
		return this.v1;
	}

	/**
	 * Gets the target vertex
	 * @return V v2
	 */
	public V getTarget() {
		return this.v2;
	}
}
