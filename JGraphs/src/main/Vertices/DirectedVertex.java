package main.Vertices;

import java.util.*;

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
	public DirectedVertex(int id, String name) {
		super(id, name);
		this.outEdges = new HashSet<Edge>();
		this.inEdges = new HashSet<Edge>();
	}
}
