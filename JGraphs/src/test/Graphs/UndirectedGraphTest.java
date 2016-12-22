package test.Graphs;

import java.util.*;
import main.Graphs.*;
import main.AbstractDataTypes.*;
import main.Edges.*;
import main.Vertices.*;
import main.Interfaces.*;
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class UndirectedGraphTest {

	@Before
	public void setUp() throws Exception {
		// UndiGraph graph = new UndiGraph();
	}

	@After
	public void tearDown() throws Exception {
		// UndiGraph graph = null;
	}

	@Test
	public void getEmptyEdges() {
		Graph<UndirectedVertex, Edge> graph = new UndiGraph<UndirectedVertex, Edge>();
		
		Set<Edge> edges = graph.getEdges();
		
		assertEquals(new HashSet<Edge>(), edges);
	}

	@Test
	public void addEdge() {
		Graph<UndirectedVertex, Edge> graph = new UndiGraph<UndirectedVertex, Edge>();
		fail("not complete test");
	}
}

