package main.Edges;

import main.AbstractDataTypes.DefaultTuple;
import main.Vertices.Vertex;
import main.Interfaces.*;

/**
 * 
 * @author Venkat Korapaty
 * @since October 11, 2016
 */
public class Edge
	implements IncidentToEdge {

	Vertex v1;
	Vertex v2;
	String name = null;
	

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
	public Edge(Vertex v1, Vertex v2, String name) {
		this.v1 = v1;
		this.v2 = v2;
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
