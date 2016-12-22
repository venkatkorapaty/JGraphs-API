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

	public boolean equals(Tuple other) {
		if (this.left == other.getLeft() && this.right == other.getRight()) {
			return true;
		}
		return false;
	}
}
