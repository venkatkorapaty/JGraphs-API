package main.AbstractDataTypesInterfaces;

public interface Stack<T> {
	public T pop();
	public void push(T item);
	public boolean isEmpty();
	public int getSize();
}
