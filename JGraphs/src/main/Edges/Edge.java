package main.Edges;

import main.AbstractDataTypes.Tuple;
import main.Vertices.Vertex;

/**
 * 
 * @author Venkat Korapaty
 * @since October 11, 2016
 */
public class Edge {

	Vertex v1;
	Vertex v2;
	
	public Edge() {
		
	}

	/**
	 * Constructor for an edge given the vertices
	 * @param v1
	 * @param v2
	 */
	public Edge(Vertex v1, Vertex v2) {
		this.v1 = v1;
		this.v2 = v2;
	}

	/**
	 * Returns the vertices that the edge is
	 * incident to.
	 * @return Tuple<V, V>(v1, v2)
	 */
	public Tuple<Vertex, Vertex> getIncidenceVertices() {
		return new Tuple<Vertex, Vertex>(this.v1, this.v2);
	}

	/**
	 * Gets the source vertex
	 * @return V v1
	 */
	public Vertex getSource() {
		return this.v1;
	}

	/**
	 * Gets the target vertex
	 * @return V v2
	 */
	public Vertex getTarget() {
		return this.v2;
	}
}
