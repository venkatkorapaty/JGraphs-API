package main.Edges;

import main.AbstractDataTypes.DefaultTuple;
import main.Vertices.Vertex;
import main.Interfaces.*;

/**
 * 
 * @author Venkat Korapaty
 * @since October 11, 2016
 */
public class Edge {

	Vertex v1;
	Vertex v2;
	Object data = null;
	

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
	 * Overloaded constructor if user wants to name edge
	 * @param v1
	 * @param v2
	 * @param name
	 */
	public Edge(Vertex v1, Vertex v2, Object data) {
		this.v1 = v1;
		this.v2 = v2;
		this.data = data;
	}

	public boolean equals(Object other) {
		if (this == other)
			return true;
		if (other == null)
			return false;
		if (other.getClass() != getClass())
			return false;
		Edge temp = (Edge)other;
		if (this.data.equals(temp.data)) {
			return true;
		}
		return false;
	}

	/**
	 * Returns the vertices that the edge is
	 * incident to.
	 * @return Tuple<V, V>(v1, v2)
	 */
	public DefaultTuple<Vertex, Vertex> getIncidentVertices() {
		return new DefaultTuple<Vertex, Vertex>(this.v1, this.v2);
	}

	/**
	 * Gets the source vertex
	 * @return source vertex
	 */
	public Vertex getSource() {
		return this.v1;
	}

	/**
	 * Gets the target vertex
	 * @return target vertex
	 */
	public Vertex getTarget() {
		return this.v2;
	}
}
