package main.AbstractDataTypes;

import main.AbstractDataTypesInterfaces.StackInterface;

public class Stack<T> implements StackInterface<T> {

	LinkedList<T> elements;
	
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
