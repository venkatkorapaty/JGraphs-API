package main.Vertices;

import java.util.*;
import main.Edges.*;

/**
 * Vertex class used for undirected graphs
 * @author Venkat Korapaty
 * @since October 12, 2016
 */
public class UndirectedVertex
	extends Vertex{

	Set<Edge> edges;

	public UndirectedVertex(){
		super();
		this.edges = new HashSet<Edge>();
	}

	/**
	 * Constructor for an undirected graph's vertices
	 * @param data
	 */
	public UndirectedVertex(int id) {
		super(id);
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

	public Set<Edge> getEdges() {
		return edges;
	}
	
	/*
	 * IMPLEMENT ME
	 * Should return a set of all vertices adjacent to this one
	 */
	public Set<Vertex> getNeighbours() {
		throw new UnsupportedOperationException();
	}
}
