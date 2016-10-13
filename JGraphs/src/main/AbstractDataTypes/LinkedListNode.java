/**
 * 
 */
package main.AbstractDataTypes;

import main.AbstractDataTypesInterfaces.IGetID;

/**
 * @author Shaheer Haroon
 *
 */
public class LinkedListNode<T extends IGetID> {
	protected T data;
	protected LinkedListNode<T> next;
	protected LinkedListNode<T> prev;
	
	public LinkedListNode() {
		this.data = null;
		this.next = null;
		this.prev = null;
	}
	
	public LinkedListNode(T data) {
		this.data = data;
		this.next = null;
		this.prev = null;
	}
	
	/*
	 * An id may be useful in the future
	 * in case we want to implement searching
	 */
	public int getID() {
		return (this.data != null) ? this.data.getID() : null;
	}
}
