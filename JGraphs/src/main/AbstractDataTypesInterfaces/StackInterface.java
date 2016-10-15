package main.AbstractDataTypesInterfaces;

public interface StackInterface<T> {
	public T pop();
	public void push(T item);
	public boolean isEmpty();
	public int getSize();
}
