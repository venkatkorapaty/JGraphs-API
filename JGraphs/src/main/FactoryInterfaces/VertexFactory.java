package main.FactoryInterfaces;

import main.Vertices.Vertex;

/**
 * This interface is for factories that generate a Vertex.
 * @author Venkat Korapaty
 *
 */
public interface VertexFactory {

	Vertex generateVertex();

}
