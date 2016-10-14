package main.AbstractDataTypesInterfaces;

public interface LinkedListInterface<T> {
	public void addTail(T item);
	public T removeHead();
	public T removeTail();
	public void addHead(T item);
	public boolean isEmpty();
}
