package main.AbstractDataTypes;

/**
 * 
 * @author Venkat Korapaty
 * @since October 10th, 2016
 *
 * @param <X>
 * @param <Y>
 */
public class Tuple<X, Y> {

	public X left;
	public Y right;
	
	public Tuple(X left, Y right) {
		this.left = left;
		this.right = right;
	}
	
	public X getLeft() {
		return this.left;
	}
	
	public Y getRight() {
		return this.right;
	}
}
