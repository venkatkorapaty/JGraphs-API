package main.AbstractDataTypes;

import main.AbstractDataTypesInterfaces.LinkedList;

/**
 * 
 * Implementation of Linked List
 * @author Shaheer Haroon
 * @param <T>
 */
public class DoublyLinkedList<T> implements LinkedList<T> {
	public LinkedListNode<T> head = null;
	public LinkedListNode<T> tail = null;
	public int size = 0;
	
	public DoublyLinkedList() {
		
	}

	/**
	 * Adds item to linked list at the head
	 * @param item
	 */
	@Override
	public void addHead(T item) {
		// TODO Auto-generated method stub
		LinkedListNode<T> newNode = new LinkedListNode<T>(item);
		if (this.size == 0) {
			// list is empty
			this.head = newNode;
			this.tail = newNode;
		} else {
			// list is not empty
			// set old head to new head.next
			newNode.next = this.head;
			this.head.prev = newNode;
			this.head = newNode;
		}
		// update size
		this.size++;
	}

	/**
	 * Adds item at tail of linked list
	 * @param item
	 */
	@Override
	public void addTail(T item) {
		// TODO Auto-generated method stub
		LinkedListNode<T> newNode = new LinkedListNode<T>(item);
		if (isEmpty()) {
			this.tail = newNode;
			this.head = newNode;
		} else {
			// list is not empty
			// set old tail to new tail.prev
			newNode.prev = this.tail;
			this.tail.next = newNode;
			this.tail = newNode;
		}
		// update size
		this.size++;
	}

	/**
	 * Deletes item at head of linked list
	 * @return object at head, null if empty
	 */
	@Override
	public T removeHead() {
		// TODO Auto-generated method stub
		T item;
		if (isEmpty()) {
			return null;
		} else if (this.size == 1) {
			item = this.head.getData();
			this.head = null;
			this.tail = null;
		} else {
			item = this.head.getData();
			this.head = this.head.next;
			this.head.prev = null;
		}
		this.size--;
		return item;
	}

	/**
	 * Deletes object at tail of linked list
	 * @return object at tail,null if empty
	 */
	@Override
	public T removeTail() {
		// TODO Auto-generated method stub
		T item;
		if (isEmpty()) {
			return null;
		} else if (this.size == 1) {
			item = this.tail.getData();
			this.head = null;
			this.tail = null;
		} else {
			item = this.tail.getData();
			this.tail = this.tail.prev;
			this.tail.next = null;
		}
		this.size--;
		return item;
	}

	/**
	 * Checks if list is empty, true if empty, false otherwise
	 * @return true/false
	 */
	public boolean isEmpty() {
		return this.size == 0;
	}

	@Override
	/**
	 * Gets size of linked list
	 * @return int, size of list
	 */
	public int getSize() {
		// TODO Auto-generated method stub
		return this.size;
	}


}
