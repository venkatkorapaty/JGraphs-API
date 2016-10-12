package main.Vertices;

/**
 * 
 * @author Venkat Korapaty
 * @since October 11, 2016
 */
public abstract class Vertex<E> {

	Object data;

	public Vertex() {
		
	}

	/**
	 * Constructor for vertex with data
	 * @param data
	 */
	public Vertex(Object data) {
		this.data = data;
	}

	public int hashCode() {
		return data.hashCode();
	}
}
