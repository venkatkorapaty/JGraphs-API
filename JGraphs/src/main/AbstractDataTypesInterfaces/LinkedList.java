package main.AbstractDataTypesInterfaces;

public interface LinkedList<T> {
	public void addTail(T item);
	public T removeHead();
	public T removeTail();
	public void addHead(T item);
	public boolean isEmpty();
	public int getSize();
}
