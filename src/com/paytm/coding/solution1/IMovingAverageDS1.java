package com.paytm.coding.solution1;

/**
 * This interface gives access to functions to add an element to data structure,
 * to access element by index from data structure and a function to calculate
 * the moving average of N last added elements.
 * 
 * @author sanket
 *
 * @param <T>
 */
public interface IMovingAverageDS1<T extends Number> {

	/**
	 * This method adds an element to the data structure passed as a parameter.
	 * 
	 * @param element
	 */
	void addElement(T element);

	/**
	 * This method returns an element from the data structure at an index passed as
	 * parameter.
	 * 
	 * @param index
	 * @return <T>
	 */
	T getElement(Integer index);

	/**
	 * This method calculates the moving average of the N last inserted elements. N
	 * is passed as parameter.
	 * 
	 * @param numberofElements
	 * @return {@link Double}
	 */
	Double getMovingAverage(Integer numberofElements);

	// <T> void addElement(T element);

}
