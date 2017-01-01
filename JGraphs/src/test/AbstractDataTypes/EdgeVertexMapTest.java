package test.AbstractDataTypes;

import static org.junit.Assert.*;
import java.util.*;
import main.AbstractDataTypesInterfaces.EdgeVertexLink;
import main.Edges.*;
import main.Vertices.*;
import main.AbstractDataTypes.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class EdgeVertexMapTest {

    EdgeVertexMap<Vertex, Edge> edgesAndVertices;
    Vertex v1;
    Vertex v2;
    Vertex v3;
    Vertex v4;
    Edge e1;
    Edge e2;
    Edge e3;

	@Before
	public void setUp() throws Exception {
		edgesAndVertices = new EdgeVertexMap<Vertex, Edge>();
		v1 = new UndirectedVertex(1, "test");
		v2 = new UndirectedVertex(2, "test1");
		v3 = new UndirectedVertex(3, "test2");
		v4 = new UndirectedVertex(4, "test3");
		e1 = new Edge(v1, v2);
		e2 = new Edge(v1, v3);
		e3 = new Edge(v3, v4);
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testSize() {
		int result = edgesAndVertices.getMap().size();
		int expected = 0;
		assertEquals(expected, result);
	}

	@Test
	public void testAddEdge() {
		edgesAndVertices.addEdge(v1, v2, e1);
		int result = edgesAndVertices.getMap().size();
		int expected = 1;
		assertEquals(expected, result);
	}

	@Test
	public void testAddThreeEdges() {
		edgesAndVertices.addEdge(v1,  v2, e1);
		edgesAndVertices.addEdge(v1, v3, e2);
		edgesAndVertices.addEdge(v3, v4, e3);
		int result = edgesAndVertices.getMap().size();
		int expected = 3;
		assertEquals(expected, result);
	}

	@Test
	public void testContainsOneEdge() {
		edgesAndVertices.addEdge(v1, v2, e1);
		boolean result = edgesAndVertices.isAdjacent(v1, v2);
		assertTrue(result);
	}

	@Test
	public void testGetEdge() {
		edgesAndVertices.addEdge(v1, v2, e1);
		List<Edge> edges = edgesAndVertices.getEdge(v1, v2);
		Edge result = edges.get(0);
		Edge expected = e1;
		assertEquals(expected, result);
	}

	@Test
	public void testRemoveVertex() {
		fail("Not yet implemented");
	}

}
