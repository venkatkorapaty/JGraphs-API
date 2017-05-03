package main.FactoryInterfaces;

import main.Edges.Edge;

/**
 * This interface is for factories that generate an Edge.
 * @author Venkat
 *
 */
public interface EdgeFactory {

	Edge generateEdge();

}
