package com.qa.helloworld;

public class Flowchart {
	
	// This is the main method where I execute the method which performs the arithmetic.
	public static void main(String[] args) {
//		flowChart(3, 3, false);
		flowChartProject(700);
	}

	// Writing my method for the multiplication or sum function here. 
	public static void flowChart(int x, int y, boolean answer) {
		if (answer==true) {
			System.out.println(x+y);
		} else {
			System.out.println(x*y);
		}
	}
	
	public static void flowChartProject(int number) {
		if (number > 2000) {
			System.out.println("A");
		} else {
			System.out.println("1");
			}
		
			if (number > 100) {
				System.out.println("3");
				} else {
				System.out.println("2");
				}
		
				if (number > 600) {
					System.out.println("5");
					} else {
						System.out.println("4");
						}
		
		
//		if (number > 500) {
//			System.out.println("6");
//		} else {
//			System.out.println("7");
//		}
//		
		
	}
	
	
	
	
	
	
}


