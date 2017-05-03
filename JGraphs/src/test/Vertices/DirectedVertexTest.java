package test.Vertices;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

import main.Edges.Edge;
import main.Vertices.DirectedVertex;
import main.Vertices.UndirectedVertex;
import main.Vertices.Vertex;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class DirectedVertexTest {

	Vertex dv1;
	Vertex dv2;
	Vertex dv3;
	Map<Vertex, Boolean> vertices;
	Edge edge;
	Edge edge1;
	Edge edge2;
	Edge edge3;

	@Before
	public void setUp() throws Exception {
		dv1 = new DirectedVertex(1, "test");
		dv2 = new DirectedVertex(2, "test1");
		dv3 = new DirectedVertex(3, "test2");
		vertices = new HashMap<Vertex, Boolean>();
		edge = new Edge(dv1, dv2);
		edge1 = new Edge(dv1, dv3);
		edge2 = new Edge(dv3, dv2);
		edge3 = new Edge(dv2, dv2);
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		Vertex dv4 = new DirectedVertex(1, "test");
		assertTrue(dv1.equals(dv4));
	}

	@Test
	public void testOneOutEdge() {
		dv1.addEdge(edge);
		DirectedVertex temp = (DirectedVertex)dv1;
		assertTrue(temp.isInOutEdges(edge) && !temp.isInInEdges(edge));
	}

	@Test
	public void testOneInEdge() {
		dv2.addEdge(edge);
		DirectedVertex temp = (DirectedVertex)dv2;
		assertTrue(temp.isInInEdges(edge) && !temp.isInOutEdges(edge));
	}

	@Test
	public void testNoOutEdge() {
		dv1.addEdge(edge);
		DirectedVertex temp = (DirectedVertex)dv1;
		assertFalse(temp.isInInEdges(edge) && !temp.isInOutEdges(edge));
	}

	@Test
	public void testNoInEdge() {
		dv2.addEdge(edge);
		DirectedVertex temp = (DirectedVertex)dv2;
		assertFalse(temp.isInOutEdges(edge) && !temp.isInInEdges(edge));
	}

	@Test
	public void testNewInstanceVertexMap() {
		vertices.put(new DirectedVertex(1, "test"), new Boolean(true));
		assertTrue(vertices.get(dv1).booleanValue());
	}

	@Test
	public void testMultipleOutEdges() {
		dv1.addEdge(edge);
		dv1.addEdge(edge1);
		DirectedVertex v1 = (DirectedVertex)dv1;
		assertTrue(v1.isInOutEdges(edge) && v1.isInOutEdges(edge1));
	}

	@Test
	public void testMultipleInEdges() {
		dv1.addEdge(edge);
		dv1.addEdge(edge1);
		DirectedVertex v1 = (DirectedVertex)dv1;
		assertTrue(v1.isInOutEdges(edge) && v1.isInOutEdges(edge1));
	}

	@Test
	public void testLoopVertex() {
		dv2.addEdge(edge3);
		DirectedVertex v1 = (DirectedVertex)dv2;
		assertTrue(v1.isInInEdges(edge3) && v1.isInOutEdges(edge3));
	}

	@Test
	public void testWrongEdgeAdded() {
		dv1.addEdge(edge3);
		DirectedVertex v1 = (DirectedVertex)dv1;
		assertFalse(v1.isInInEdges(edge3) && v1.isInOutEdges(edge3));
	}

	@Test
	public void testRemoveInEdge() {
		dv1.addEdge(edge);
		DirectedVertex v1 = (DirectedVertex)dv1;
		assertTrue(v1.removeEdge(edge));
	}
}
