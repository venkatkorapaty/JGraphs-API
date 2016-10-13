package main.Vertices;

import main.AbstractDataTypesInterfaces.IGetID;

/**
 * 
 * @author Venkat Korapaty
 * @since October 11, 2016
 */
public abstract class Vertex implements IGetID {

	int id;
	

	public Vertex() {
		
	}

	/**
	 * Constructor for vertex with data
	 * @param data
	 */
	public Vertex(int id) {
		this.id = id;
	}

	public int hashCode() {
		return this.hashCode();
	}
	
	public int getID() {
		return this.id;
	}
}
