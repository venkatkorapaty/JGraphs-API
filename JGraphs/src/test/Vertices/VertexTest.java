package test.Vertices;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import main.Vertices.*;
import java.util.*;

public class VertexTest {

	Vertex uv1;
	Vertex uv2;
	Vertex uv3;
	Map<Vertex, Boolean> vertices;

	@Before
	public void setUp() throws Exception {
		uv1 = new UndirectedVertex(1, "test");
		uv2 = new UndirectedVertex(2, "test1");
		uv3 = new UndirectedVertex(1, "test");
		vertices = new HashMap<Vertex, Boolean>();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testNotEqual() {
		assertFalse(uv1.equals(uv2));
	}

	@Test
	public void testSameVertex() {
		assertTrue(uv1.equals(uv1));
	}

	@Test
	public void testSameTypeOfVertex() {
		assertTrue(uv1.equals(uv3));
	}

	@Test
	public void testSameVertexMap() {
		vertices.put(uv1, new Boolean(true));
		assertTrue(vertices.get(uv1).booleanValue());
	}

	@Test
	public void testSameTypeVertexMap() {
		vertices.put(uv1, new Boolean(true));
		assertTrue(vertices.get(uv3).booleanValue());
	}

	@Test
	public void testNewInstanceVertexMap() {
		vertices.put(new UndirectedVertex(1, "test"), new Boolean(true));
		assertTrue(vertices.get(uv1).booleanValue());
	}
}
