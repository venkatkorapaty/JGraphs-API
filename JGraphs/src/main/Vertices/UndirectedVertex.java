package main.Vertices;

import java.util.*;

/**
 * Vertex class used for undirected graphs
 * @author Venkat Korapaty
 * @since October 12, 2016
 */
public class UndirectedVertex<E>
	extends Vertex<E>{

	Set<E> edges;

	public UndirectedVertex(){
		super();
		this.edges = new HashSet<E>();
	}

	/**
	 * Constructor for an undirected graph's vertices
	 * @param data
	 */
	public UndirectedVertex(Object data) {
		super(data);
	}

	/**
	 * Adds and edge to the vertex's edge set.
	 * Returns false if the set already contains the edge;
	 * true otherwise.
	 * @param edge
	 * @return true/false
	 */
	public boolean addEdge(E edge) {
		if(!edges.contains(edge)) {
			edges.add(edge);
			return true;
		}
		return false;
	}

	/**
	 * Removes edge from edges, returns false if the edge
	 * is not in the edge set, true otherwise.
	 * @param edge
	 * @return
	 */
	public boolean removeEdge(E edge) {
		return edges.remove(edge);
	}

	/**
	 * Uses the hash code of the data for the vertex
	 * @return hash code of object
	 */
	public int hashCode(){
		return super.hashCode();
	}

	public Object getData() {
		return this.data;
	}

	public Set<E> getEdges() {
		return edges;
	}
}
