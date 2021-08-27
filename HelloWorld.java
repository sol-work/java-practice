package com.qa.helloworld;

public class HelloWorld {
	
	 public static int x = 100; // adding variables
	 public static int y =10;
	
	 public static void main(String[] args) {
//		 System.out.println("Hello World, it's Soleiman coding in Java for the first time!");
//		 System.out.println(additionCalc(4,2));
//		 System.out.println(subtractionCalc(4,2));
//		 System.out.println(multCalc(4,2));
		 
		 if(x < y) {
	            System.out.println(divCalc(x,y));
	        } else {
	            System.out.println("The division cannot be performed.");
	        }
//		 System.out.println(divCalc(10,4));
		 
	}	
	 
	public static int additionCalc(int x, int y) {
		return x + y;
	}
	
	public static int subtractionCalc(int x, int y) {
		return x-y;	
	}
	
	public static int multCalc(int x, int y) {
		return x*y;
	}
	
	public static double divCalc(double x, double y) {
		return x/y;
	}
	

}