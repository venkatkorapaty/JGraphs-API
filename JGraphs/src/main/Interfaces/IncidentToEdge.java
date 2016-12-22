package main.Interfaces;

import main.AbstractDataTypesInterfaces.*;
import main.Vertices.*;

public interface IncidentToEdge {

	/**
	 * Gets the vertices incident to the edge as a tuple.
	 * @return tuple of v1 and v2
	 */
	Tuple<Vertex, Vertex> getIncidentVertices();
}
