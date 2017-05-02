package test.Vertices;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

import main.Edges.Edge;
import main.Vertices.DirectedVertex;
import main.Vertices.Vertex;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class DirectedVertexTest {

	Vertex dv1;
	Vertex dv2;
	Vertex dv3;
	Map<Vertex, Boolean> vertices;

	@Before
	public void setUp() throws Exception {
		dv1 = new DirectedVertex(1, "test");
		dv2 = new DirectedVertex(2, "test1");
		dv3 = new DirectedVertex(3, "test2");
		vertices = new HashMap<Vertex, Boolean>();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		Vertex dv4 = new DirectedVertex(4, "test");
		assertTrue(dv1.equals(dv4));
	}

	@Test
	public void testOneOutEdge() {
		Edge edge = new Edge(dv1, dv2);
		dv1.addEdge(edge);
		DirectedVertex temp = (DirectedVertex)dv1;
		assertTrue(temp.isInOutEdges(edge));
	}

	@Test
	public void test1() {
		Edge edge = new Edge(dv1, dv2);
		dv2.addEdge(edge);
		DirectedVertex temp = (DirectedVertex)dv2;
		assertTrue(temp.isInInEdges(edge));
	}
}
