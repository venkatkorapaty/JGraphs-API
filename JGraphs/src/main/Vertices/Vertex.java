package main.Vertices;

import main.AbstractDataTypesInterfaces.*;
import main.Edges.*;

/**
 * 
 * @author Venkat Korapaty
 * @since October 11, 2016
 */
public abstract class Vertex
	implements Id {

	int id;
	Object data;
	private static int result = 19;
	

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
		int hashCode = this.id*result;
		if (this.data != null) {
			hashCode += this.data.hashCode();
			return hashCode;
		}
		return hashCode;
	}
	
	/**
	 * Not final decision:
	 * 2 vertices are equal if they have the same data and id
	 * @param other
	 * @return
	 */
	public boolean equals(Object other) {
		if (other == null)
			return false;
		if (this == other)
			return true;
		if (other.getClass() != getClass())
			return false;
		Vertex v1 = (Vertex)other;
		return this.data.equals(v1.data) && this.id == v1.id;
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
	
	public abstract boolean addEdge(Edge edge);
	
	public abstract boolean removeEdge(Edge edge);
}
