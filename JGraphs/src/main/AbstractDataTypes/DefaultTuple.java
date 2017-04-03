package main.AbstractDataTypes;

import main.AbstractDataTypesInterfaces.*;

/**
 * 
 * @author Venkat Korapaty
 * @since October 10th, 2016
 *
 * @param <X>
 * @param <Y>
 */
public class DefaultTuple<X, Y> 
	implements Tuple<X, Y> {

	public X left;
	public Y right;
	
	public DefaultTuple(X left, Y right) {
		this.left = left;
		this.right = right;
	}
	
	public X getLeft() {
		return this.left;
	}
	
	public Y getRight() {
		return this.right;
	}

	public int hashCode() {
		return this.left.hashCode() + this.right.hashCode();
	}

	public boolean equals(Object other) {
		if (this == other)
			return true;
		if (other == null)
			return false;
		if (other.getClass() != getClass())
			return false;
		Tuple tuple = (Tuple)other;
		if ((this.left.equals(tuple.getLeft()) && this.right.equals(tuple.getRight()))
				|| (this.left.equals(tuple.getRight()) && this.right.equals(tuple.getLeft()))) {
			return true;
		}
		return false;
	}
}
