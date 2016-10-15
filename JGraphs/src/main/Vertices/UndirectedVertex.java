package main.Vertices;

import java.util.*;
import main.Edges.*;
import main.AbstractDataTypes.*;
import main.AbstractDataTypesInterfaces.*;

/**
 * Vertex class used for undirected graphs
 * @author Venkat Korapaty
 * @since October 12, 2016
 */
public class UndirectedVertex
	extends Vertex{

	Set<Edge> edges;


	/**
	 * Constructor for an undirected graph's vertices
	 * @param id
	 */
	public UndirectedVertex(int id) {
		super(id);
		this.edges = new HashSet<Edge>();
	}
	
	/**
	 * Constructor for a vertex of an undirected graph
	 * @param id
	 * @param name
	 */
	public UndirectedVertex(int id, Object data) {
		super(id, data);
		this.edges = new HashSet<Edge>();
	}

	/**
	 * Adds and edge to the vertex's edge set.
	 * Returns false if the set already contains the edge;
	 * true otherwise.
	 * @param edge
	 * @return true/false
	 */
	public boolean addEdge(Edge edge) {
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
	public boolean removeEdge(Edge edge) {
		return edges.remove(edge);
	}

	/**
	 * Uses the hash code of the data for the vertex
	 * @return hash code of object
	 */
	public int hashCode(){
		return super.hashCode();
	}

	/**
	 * Gets the set of edges
	 * @return edge set
	 */
	public Set<Edge> getEdges() {
		return edges;
	}

	/**
	 * Gets all the vertices adjacent to this.
	 * @return Set of adjacent vertices
	 */
	public Set<Vertex> getNeighbours() {
		Set<Vertex> adjacentVertices = new HashSet<Vertex>();

		for(Edge e : edges) {
			adjacentVertices.add(getAdjacentVertex(e));
		}
		return adjacentVertices;
	}

	private Vertex getAdjacentVertex(Edge e) {
		Tuple<Vertex, Vertex> incidentVertices = e.getIncidenceVertices();
		if (this.equals(incidentVertices.getRight()))
			return incidentVertices.getLeft();
		else
			return incidentVertices.getRight();
	}
}
