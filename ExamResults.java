package com.qa.helloworld;

public class ExamResults {

	public static int physics = 150;
	public static int chemistry = 120;
	public static int biology = 110;
	public static int total;
	public static int percentage;
	
	public static void main(String[] args) {
		
		individualResuls();
		System.out.println("Your overall score is: " + overallPercentageResult() + "%. Well done!" );
	}
	
	public static void individualResuls() {
		total = physics + chemistry + biology;
		System.out.println("Total score for all exams: " + total 
		+ " and your individual results for physics, chemistry, and biology out of 150 are, respectively: " 
		+ physics + ", " + chemistry + ", " + biology + ".");
		
	}
	
	public static int overallPercentageResult() {
		percentage = total * 100/450;
		return percentage;
	}
	
}
