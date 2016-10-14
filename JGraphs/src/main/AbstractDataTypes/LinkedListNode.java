/**
 * 
 */
package main.AbstractDataTypes;

import main.AbstractDataTypesInterfaces.IGetID;

/**
 * @author Shaheer Haroon
 *
 */
public class LinkedListNode<T> {
	protected T data = null;
	protected LinkedListNode<T> next = null;
	protected LinkedListNode<T> prev = null;
	
	public LinkedListNode() {

	}
	
	public LinkedListNode(T data) {
		this.data = data;
	}
	
	public T getData() {
		return this.data;
	}
	
}
