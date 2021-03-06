package main.AbstractDataTypes;

import java.util.*;

import main.Edges.*;
import main.Vertices.*;
import main.AbstractDataTypesInterfaces.*;

/**
 * This ADT is to let us map vertices to edges.
 * The implemenation of this ADT uses extra space complexity.
 * @author Venkat Korapaty
 *
 */
public class EdgeVertexMap<V, E>
	implements EdgeVertexLink<V, E> {

	/*
	 * Using E as the generic doesn't support multiple edges between
	 * the same 2 vertices
	 */
	Map<Tuple<Vertex, Vertex>, List<Edge>> edgesAndVertices;

	public EdgeVertexMap() {
		edgesAndVertices = new HashMap<Tuple<Vertex, Vertex>, List<Edge>> ();
	}
	
	public boolean compareMaps(Object other) {
		if (this == other)
			return true;
		if (other == null)
			return false;
		if (other.getClass() != getClass())
			return false;
		EdgeVertexMap<Vertex, Edge> temp = (EdgeVertexMap<Vertex, Edge>)other;
		try{
			if (!bothContainsSameKeyValuePair(temp)) {
				return false;
			}
			if (!bothContainSameKeys(temp)) {
				return false;
			}
	    } catch (NullPointerException np) {
	        return false;
	    }
	    return true;
	}

	private boolean bothContainsSameKeyValuePair(EdgeVertexMap<Vertex, Edge> other) throws NullPointerException {
		Map<Tuple<Vertex, Vertex>, List<Edge>> current = this.getMap();
    	Map<Tuple<Vertex, Vertex>, List<Edge>> otherCurrent = other.getMap();
        for (Tuple<Vertex, Vertex> vertexPair : other.getMap().keySet())
        {
        	
            if (!current.get(vertexPair).equals(otherCurrent.get(vertexPair))) {
                return false;
            }
        }
        return true;
	}
	
	private boolean bothContainSameKeys(EdgeVertexMap<Vertex, Edge> other) throws NullPointerException {
		Map<Tuple<Vertex, Vertex>, List<Edge>> current = this.getMap();
    	Map<Tuple<Vertex, Vertex>, List<Edge>> otherCurrent = other.getMap();
    	for (Tuple<Vertex, Vertex> vertexPair : current.keySet())
        {
            if (!otherCurrent.containsKey(vertexPair)) {
                return false;
            }
        }
    	return true;
	}

	public Map<Tuple<Vertex, Vertex>, List<Edge>> getMap() {
		return edgesAndVertices;
	}

	public void addEdge(Vertex v1, Vertex v2, Edge edge) {
		List<Edge> tempEdges = edgesAndVertices.get(new DefaultTuple<Vertex, Vertex>(v1, v2));
		if (tempEdges == null) {
			edgesAndVertices.put(new DefaultTuple<Vertex, Vertex>(v1, v2), new ArrayList<Edge>(Arrays.asList(edge)));
		}
		else {
			tempEdges.add(edge);
		}
	}

	/**
	 * Gets the edge(s) shared with the 2 vertices
	 * @param v1
	 * @param v2
	 * @return edge
	 */
	public List<Edge> getEdge(Vertex v1, Vertex v2) {
		return edgesAndVertices.get(new DefaultTuple<Vertex, Vertex>(v1, v2));
	}

	/**
	 * Given an edge, removes it from the map.
	 * @return true if exists, false otherwise
	 */
	public boolean removeEdge(Edge edge) {
		Tuple<Vertex, Vertex> incidentVertices = edge.getIncidentVertices();
		List<Edge> edges = edgesAndVertices.get(incidentVertices);
		if (edges == null) {
			return false;
		}
		else if (edges.size() == 1) {
			edgesAndVertices.remove(incidentVertices);
			return true;
		}
		else {
			edges.remove(edge);
			return true;
		}
	}

	public boolean removeVertex(Vertex v1) {
		boolean found = false;
		List<Tuple<Vertex, Vertex>> verticesToRemove = new ArrayList<Tuple<Vertex, Vertex>>();
		for (Tuple<Vertex, Vertex> tuple: edgesAndVertices.keySet()) {
			if (tuple.getLeft().equals(v1) || tuple.getRight().equals(v1)) {
				verticesToRemove.add(tuple);
				found = true;
			}
		}
		
		for (Tuple<Vertex, Vertex> tuple: verticesToRemove) {
			edgesAndVertices.remove(tuple);
		}
		return found;
	}

	@Override
	public boolean isAdjacent(Vertex v1, Vertex v2) {
		List<Edge> edges = edgesAndVertices.get(new DefaultTuple<Vertex, Vertex>(v1, v2));
		if (edges != null) {
			if (edges.size() > 0) {
				return true;
			}
		}
		return false;
	}

	public int size() {
		return edgesAndVertices.size();
	}
}
