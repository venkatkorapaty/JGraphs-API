package test.AbstractDataTypes;

import static org.junit.Assert.*;

import org.junit.Test;

import main.AbstractDataTypes.LinkedList;

public class LinkedListTest {
	
	/*@Test
	public void setUp() {
		LinkedList<Integer> ll = new LinkedList<Integer>();
		ll.addHead(1);
		ll.addHead(2);
	}
	
	@Test
	public void tearDown() {
		
	}*/
	
	@Test
	public void testRemoveHead() {
		LinkedList<Integer> ll = new LinkedList<Integer>();
		ll.addHead(1);
		ll.addHead(2);
		Integer i = ll.removeHead();
		assertEquals(Integer.valueOf(2), i);
	}
	
	@Test
	public void testRemoveTail() {
		LinkedList<Integer> ll = new LinkedList<Integer>();
		ll.addHead(1);
		ll.addHead(2);
		Integer i = ll.removeTail();
		assertEquals(Integer.valueOf(1), i);
	}
}