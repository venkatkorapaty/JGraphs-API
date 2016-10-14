package main.Vertices;

import main.AbstractDataTypesInterfaces.IGetID;

/**
 * 
 * @author Venkat Korapaty
 * @since October 11, 2016
 */
public abstract class Vertex implements IGetID {

	int id;
	String name = null;
	

	/**
	 * Constructor for vertex with data
	 * @param data
	 */
	public Vertex(int id) {
		this.id = id;
	}
	
	public Vertex(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public int hashCode() {
		return this.hashCode();
	}
	
	public int getID() {
		return this.id;
	}
	
	public String getName() {
		return this.name;
	}
}
