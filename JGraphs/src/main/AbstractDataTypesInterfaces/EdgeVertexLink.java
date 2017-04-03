package main.AbstractDataTypesInterfaces;

import java.util.*;
import main.Edges.*;
import main.Vertices.*;

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
	void addEdge(Vertex v1, Vertex v2, Edge edge);

	/**
	 * Gets the edge for 2 vertices.
	 * If the 2 vertices are not adjacent, return null
	 * @param v1
	 * @param v2
	 * @return edge incident to source and target vertices
	 */
	List<Edge> getEdge(Vertex v1, Vertex v2);

	/**
	 * Checks if there exists an edge between 2 vertices.
	 * @param v1
	 * @param v2
	 * @return true if 2 vertices are connected, false otherwise.
	 */
	boolean isAdjacent(Vertex v1, Vertex v2);

	/**
	 * Given an edge, remove it.
	 * @param edge
	 * @return true if exists, false otherwise.
	 */
	boolean removeEdge(Edge edge);

	/**
	 * Given a vertex, remove all edges incident to it.
	 * @param v1
	 * @return true if vertex exists, false otherwise
	 */
	boolean removeVertex(Vertex v1);

	/**
	 * Returns the amount of edges
	 * @return size of EdgeVertexMap
	 */
	int size();
}
