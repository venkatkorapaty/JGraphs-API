package main.Interfaces;

/**
 * The interface for directed graphs; methods that a directed graph should have
 * @author Venkat Korapaty
 * @since October 10th, 2016
 *
 * @param <V>
 * @param <E>
 */
public interface DirectedGraph<V, E> {

	/**
	 * Gets the vertex that the directed edge starts from
	 * @param edge
	 * @return the source/tail vertex of edge
	 */
	V getTailVertex(E edge);
	
	/**
	 * Gets the vertex that the directed edge ends at
	 * @param edge
	 * @return the target/head vertex of edge
	 */
	V getHeadVertex(E edge);
	
	/**
	 * Gets the amount of edges that are a tail to vertex
	 * @param vertex
	 * @return number of tail edges
	 */
	int getOutDegree(V vertex);
	
	/**
	 * Gets the amount of edges that are a head to vertex
	 * @param vertex
	 * @return number of head edges
	 */
	int getInDegree(V vertex);
}
