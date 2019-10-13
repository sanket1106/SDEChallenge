package com.paytm.ds.impl;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import com.paytm.ds.intf.IMovingAverageDS;

/**
 * This class is an implementation for the data structure that stores elements
 * added to it, and calculates a moving average of N last added elements.
 * 
 * @author sanket
 *
 * @param <T extends Number>
 */
public class MovingAverageList<T extends Number> implements IMovingAverageDS<T> {

	private List<T> list = null;

	public MovingAverageList() {
		this.list = new ArrayList<T>();
	}

	@Override
	public void addElement(T element) {
		if (element != null)
			this.list.add(element);
	}

	@Override
	public T getElement(Integer index) {
		if (index == null)
			return null;
		if (index > (this.list.size() - 1))
			throw new IndexOutOfBoundsException("Value of index should be less than total number of elements added");
		return this.list.get(index);
	}

	@Override
	public Double getMovingAverage(Integer numberofElements) {
		if (numberofElements == null)
			return null;
		if (numberofElements > (this.list.size()))
			throw new IndexOutOfBoundsException("Value of parameter passed should be less than total number of elements added");
		if(numberofElements <= 0)
			throw new IndexOutOfBoundsException("Value of parameter passed should be greater than 0");
		Integer startIndex = this.list.size() - numberofElements;
		BigDecimal sum = new BigDecimal(0);
		while (startIndex < this.list.size()) {
			sum = sum.add(new BigDecimal(this.list.get(startIndex).toString()));
			startIndex++;
		}
		return sum.divide(new BigDecimal(numberofElements), 2).doubleValue();
	}

}
