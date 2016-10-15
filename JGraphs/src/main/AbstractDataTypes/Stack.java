package main.AbstractDataTypes;

import main.AbstractDataTypesInterfaces.*;

public class Stack<T> implements StackInterface<T> {

	LinkedList<T> elements;
	
	public Stack() {
		elements = new SinglyLinkedList<T>();
	}
	
	public Stack(T[] objects) {
		elements = new SinglyLinkedList<T>();
		for(T element : objects) {
			elements.addHead(element);
		}
	}
	
	@Override
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
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return elements.isEmpty();
	}

	@Override
	public int getSize() {
		// TODO Auto-generated method stub
		return elements.getSize();
	}


	@Override
	public void push(T item) {
		// TODO Auto-generated method stub
		elements.addHead(item);
	}
	
}
