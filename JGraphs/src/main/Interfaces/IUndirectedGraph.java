package main.Interfaces;

/**
 * The interface for all undirected graphs
 * @author Venkat Korapaty
 *
 * @param <V>
 * @param <E>
 */
public interface IUndirectedGraph<V, E> {

	/**
	 * Gets the degree of a vertex.
	 * Degree of a vertex are all the adjacent edges.
	 * An edge pointing to the same vertex is a loop, counts as 2 edges.
	 * @param vertex
	 * @return
	 */
	int degreeOf(V vertex);
}
