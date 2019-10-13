package com.paytm.coding.solution2;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import com.paytm.coding.solution1.IMovingAverageDS1;

/**
 * This class is an implementation for the data structure that stores elements
 * added to it, and calculates a moving average of N last added elements.
 * 
 * @author sanket
 *
 * @param <T extends Number>
 */
public class MovingAverageList2<T extends Number> implements IMovingAverageDS2<T> {

	private List<T> list = null;
	private Integer numberOfElementsForAverage = 0;
	private Double movingAverage;
	
	private MovingAverageList2() {
	}

	public MovingAverageList2(Integer numberOfElementsForAverage) {
		this.list = new ArrayList<T>();
		this.numberOfElementsForAverage = numberOfElementsForAverage;
	}

	@Override
	public void addElement(T element) {
		if (element != null) {
			this.list.add(element);
		}
		
		if (this.list.size() >= numberOfElementsForAverage)
			calculateMovingAverage();
	}

	@Override
	public T getElement(Integer index) {
		if (index == null)
			return null;
		if (index > (this.list.size() - 1))
			throw new IndexOutOfBoundsException("Value of index should be less than total number of elements added");
		return this.list.get(index);
	}

	// @Override
	public Double getMovingAverage() {
		if (numberOfElementsForAverage > (this.list.size()))
			throw new IndexOutOfBoundsException("Not enough elements to calculate moving average of "
					+ numberOfElementsForAverage + " last added elements");
		return this.movingAverage;
	}

	private void calculateMovingAverage() {
		if (numberOfElementsForAverage == this.list.size()) {
			BigDecimal sum = new BigDecimal(0);
			for(T element:this.list)
				sum = sum.add(new BigDecimal(element.toString()));
			this.movingAverage = sum.divide(new BigDecimal(numberOfElementsForAverage)).doubleValue();
		} else {
			BigDecimal lastElement = new BigDecimal(this.list.get(this.list.size()-1).toString());
			BigDecimal droppedElement = new BigDecimal(this.list.get(this.list.size()-1-numberOfElementsForAverage).toString());
			 this.movingAverage = this.movingAverage + (lastElement.subtract(droppedElement)).divide(new BigDecimal(numberOfElementsForAverage)).doubleValue();
		}
	}

}
