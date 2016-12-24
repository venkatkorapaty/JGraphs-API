package main.Vertices;

import main.AbstractDataTypesInterfaces.*;

/**
 * 
 * @author Venkat Korapaty
 * @since October 11, 2016
 */
public abstract class Vertex
	implements Id {

	int id;
	Object data;
	

	/**
	 * Constructor for vertex with data
	 * @param data
	 */
	public Vertex(int id) {
		this.id = id;
		data = null;
	}
	
	public Vertex(int id, Object data) {
		this.id = id;
		this.data = data;
	}

	public int hashCode() {
		return this.hashCode();
	}
	
	/**
	 * Not final decision:
	 * 2 vertices are equal if they have the same data
	 * @param other
	 * @return
	 */
	public boolean equals(Vertex other) {
		return this.data.equals(other.data);
	}
	
	public int getID() {
		return this.id;
	}

	public Object getData() {
		return this.data;
	}

	public String getName() {
		return data.toString();
	}
}
