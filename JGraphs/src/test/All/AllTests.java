package test.All;

import test.AbstractDataTypes.*;
import test.Edges.*;
import test.Graphs.*;
import test.Vertices.*;

import org.junit.runner.JUnitCore;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ AllADTTests.class, AllEdgeTests.class, AllGraphTests.class, AllVertexTests.class })

public class AllTests {
	
  public static void main(String args[]) {
	    JUnitCore.runClasses(AllTests.class);
	}
}
