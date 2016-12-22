package test.AbstractDataTypes;

import static org.junit.Assert.*;
import main.AbstractDataTypesInterfaces.EdgeVertexLink;
import main.Edges.*;
import main.Vertices.*;
import main.AbstractDataTypes.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class EdgeVertexMapTest {


    EdgeVertexLink<Vertex, Edge> edgesAndVertices;

	@Before
	public void setUp() throws Exception {
		edgesAndVertices = new EdgeVertexMap<Vertex, Edge>();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testAddEdge() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetEdge() {
		fail("Not yet implemented");
	}

	@Test
	public void testRemoveVertex() {
		fail("Not yet implemented");
	}

}
