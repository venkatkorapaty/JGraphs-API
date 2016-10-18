package main.AbstractDataTypes;

import main.AbstractDataTypesInterfaces.*;

/**
 * 
 * @author Shaheer Haroon
 *
 * @param <T>
 */
public class DefaultStack<T> implements Stack<T> {

	LinkedList<T> elements;

	/**
	 * Constructor for stack
	 */
	public DefaultStack() {
		elements = new DoublyLinkedList<T>();
	}

	/**
	 * Constructor for Stack with an array of objects
	 * @param objects
	 */
	public DefaultStack(T[] objects) {
		elements = new DoublyLinkedList<T>();
		for(T element : objects) {
			elements.addTail(element);
		}
	}

	@Override
	/**
	 * Deletes the value at the top of the stack and returns it.
	 * Gives null if empty.
	 * @return object at top of stack, null if empty
	 */
	public T pop() {
		// TODO Auto-generated method stub
		T result = null;
		if (elements.isEmpty()) {
			return result;
		} else {
			result = elements.removeHead();
		}
		return result;
	}


	@Override
	/**
	 * Checks if the stack is empty
	 * @return true/false
	 */
	public boolean isEmpty() {
		return elements.isEmpty();
	}

	@Override
	/**
	 * Gets size of stack
	 * @return int, size of stack
	 */
	public int getSize() {
		return elements.getSize();
	}


	@Override
	/**
	 * Adds item to top of stack
	 * @param item
	 */
	public void push(T item) {
		// TODO Auto-generated method stub
		elements.addHead(item);
	}
	
}
