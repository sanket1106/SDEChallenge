package com.paytm.ds;

import com.paytm.ds.impl.MovingAverageList;
import com.paytm.ds.intf.IMovingAverageDS;

public class CalculateSimpleMovingAverage {

	public static void main(String[] args) {
		IMovingAverageDS<Integer> movingAverage = new MovingAverageList<Integer>();
		movingAverage.addElement(5);
		movingAverage.addElement(10);
		movingAverage.addElement(15);
		movingAverage.addElement(20);
		movingAverage.addElement(25);
		movingAverage.addElement(30);
		movingAverage.addElement(35);
		movingAverage.addElement(40);
		movingAverage.addElement(45);
		
		System.out.println(movingAverage.getMovingAverage(1));
		System.out.println(movingAverage.getMovingAverage(5));
		System.out.println(movingAverage.getMovingAverage(9));
		//System.out.println(movingAverage.getMovingAverage(-2));
		System.out.println(movingAverage.getMovingAverage(10));
	}
}
