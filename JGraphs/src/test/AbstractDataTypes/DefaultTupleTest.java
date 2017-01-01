package test.AbstractDataTypes;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import main.AbstractDataTypes.*;
import main.AbstractDataTypesInterfaces.*;
import main.Vertices.*;
import java.util.*;

public class DefaultTupleTest {

	Tuple t1;
	Tuple t2;
	Vertex v1;
	Vertex v2;
	Vertex v3;
	Map<Tuple, Boolean> tuples;
	
	@Before
	public void setUp() throws Exception {
		v1 = new UndirectedVertex(1, "test");
		v2 = new UndirectedVertex(2, "test1");
		v3 = new UndirectedVertex(1, "test");
		t1 = new DefaultTuple(v1, v2);
		t2 = new DefaultTuple(v2, v3);
		tuples = new HashMap<Tuple, Boolean>();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testEquals() {
		assertEquals(t1, t2);
	}

	@Test
	public void testTupleMap() {
		Tuple t3 = new DefaultTuple(v2, v1);
		tuples.put(t1, new Boolean(true));
		assertTrue(tuples.get(t3));
	}

	@Test
	public void testSwitchedTuple() {
		tuples.put(t1, new Boolean(true));
		assertTrue(tuples.get(t2));
	}
}
