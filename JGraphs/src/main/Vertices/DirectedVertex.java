package main.Vertices;

import java.util.*;

/**
 * Vertex class used for directed graphs
 * @author Venkat Korapaty
 * @since October 12, 2016
 * @param <E>
 */
public class DirectedVertex<E>
	extends Vertex<E> {

	Set<E> outEdges;
	Set<E> inEdges;

	public DirectedVertex() {
		this.outEdges = new HashSet<E>();
		this.inEdges = new HashSet<E>();
	}
}
