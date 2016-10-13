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

	public DirectedVertex() {
		this.outEdges = new HashSet<Edge>();
		this.inEdges = new HashSet<Edge>();
	}
}
