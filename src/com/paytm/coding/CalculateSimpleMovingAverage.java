package com.paytm.coding;

import com.paytm.coding.solution1.IMovingAverageDS1;
import com.paytm.coding.solution1.MovingAverageList1;
import com.paytm.coding.solution2.IMovingAverageDS2;
import com.paytm.coding.solution2.MovingAverageList2;

public class CalculateSimpleMovingAverage {

	public static void main(String[] args) {
		
		System.out.println("SOLUTION 1");
		try {
		solution1();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("\n\nSOLUTION 2");
		try {
		solution2();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static void solution1() {
		IMovingAverageDS1<Integer> movingAverage = new MovingAverageList1<Integer>();
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

		// UNCOMMENT THIS LINE TO CHECK EXCEPTION
		//System.out.println(movingAverage.getMovingAverage(10));
		
		// UNCOMMENT THIS LINE TO CHECK EXCEPTION
		//System.out.println(movingAverage.getMovingAverage(-2));

		
	}
	
	private static void solution2() {
		IMovingAverageDS2<Integer> movingAverage = new MovingAverageList2<Integer>(5);
		movingAverage.addElement(7);
		movingAverage.addElement(4);
		
		// UNCOMMENT THIS LINE TO CHECK EXCEPTION
		//System.out.println(movingAverage.getMovingAverage());
		
		movingAverage.addElement(2);
		movingAverage.addElement(1);
		movingAverage.addElement(3);
		System.out.println("AVERAGE : "+movingAverage.getMovingAverage());
		movingAverage.addElement(9);
		System.out.println("NEW AVERAGE : "+movingAverage.getMovingAverage());
	}
}
