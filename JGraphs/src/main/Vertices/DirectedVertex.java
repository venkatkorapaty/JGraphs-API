package main.Vertices;

import java.util.*;

import main.AbstractDataTypesInterfaces.Tuple;
import main.Edges.Edge;

/**
 * Vertex class used for directed graphs
 * @author Venkat Korapaty
 * @since October 12, 2016
 * @param <E>
 */
public class DirectedVertex
	extends Vertex {

	Set<Edge> outEdges;
	Set<Edge> inEdges;
	
	/**
	 * Default constructor for vertex of a directed graph
	 * @param id
	 */
	public DirectedVertex(int id) {
		super(id);
		this.outEdges = new HashSet<Edge>();
		this.inEdges = new HashSet<Edge>();
	}
	
	/**
	 * Overloaded constructor if user wants to name vertices
	 * @param id
	 * @param name
	 */
	public DirectedVertex(int id, Object data) {
		super(id, data);
		this.outEdges = new HashSet<Edge>();
		this.inEdges = new HashSet<Edge>();
	}


	/**
	 * Note: The vertex on the left of the tuple is assumed to be for out going edges
	 * Vertex on the right of the tuple is assumed to be for in going edges
	 * Returns true if added to either in or out edges, or both if edge is a loop.
	 * Returns false if edge is already contained in both
	 * Returns null if the edge's incident vertices is not the same
	 * as the vertex we are connecting it to.
	 * @param edge
	 * @return true/false
	 */
	public boolean addEdge(Edge edge) {
		boolean contains = false;

		if (!isInOutEdges(edge)) {
			if (shouldAddToOutEdges(edge.getSource())) {
				outEdges.add(edge);
				contains = true;
			}
		}
		
		if (!isInInEdges(edge)) {
			if (shouldAddToInEdges(edge.getTarget())) {
				inEdges.add(edge);
				contains = true;
			}
		}

		return contains;
	}
	
	public boolean isInOutEdges(Edge edge) {
		return outEdges.contains(edge);
	}
	
	public boolean shouldAddToOutEdges(Vertex v1) {
		return v1.equals(this);
	}
	
	public boolean isInInEdges(Edge edge) {
		return inEdges.contains(edge);
	}
	
	public boolean shouldAddToInEdges(Vertex v1) {
		return v1.equals(this);
	}

	public boolean removeEdge(Edge edge) {
		return inEdges.remove(edge) || outEdges.remove(edge);
	}
}
