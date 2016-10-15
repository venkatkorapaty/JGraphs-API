package main.AbstractDataTypesInterfaces;

/**
 * Interface for tuple ADTs
 * @author Venkat Korapaty
 * @since October 14, 2016
 * @param <X>
 * @param <Y>
 */
public interface Tuple<X, Y> {

	/**
	 * Gets left value of the tuple
	 * @return X, left value
	 */
	X getLeft();
	
	/**
	 * Gets right value of the tuple
	 * @return Y, right value
	 */
	Y getRight();
}
