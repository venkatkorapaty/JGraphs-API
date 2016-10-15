package test.AbstractDataTypes;

import static org.junit.Assert.*;

import org.junit.Test;

import main.AbstractDataTypes.SinglyLinkedList;

public class LinkedListTest {

	@Test
	public void setUp() {
		// test comment2
	}

	@Test
	public void tearDown() {

	}

	@Test
	public void testRemoveHead() {
		SinglyLinkedList<Integer> ll = new SinglyLinkedList<Integer>();
		ll.addHead(1);
		ll.addHead(2);
		Integer i = ll.removeHead();
		assertEquals(Integer.valueOf(2), i);
	}

	@Test
	public void testRemoveTail() {
		SinglyLinkedList<Integer> ll = new SinglyLinkedList<Integer>();
		ll.addHead(1);
		ll.addHead(2);
		Integer i = ll.removeTail();
		assertEquals(Integer.valueOf(1), i);
	}
}
