package com.qa.helloworld;

public class ExamResults {

	public static int physics = 100;
	public static int chemistry = 120;
	public static int biology = 110;
	public static int total;
	public static int percentage;
	
	public static void main(String[] args) {
		System.out.println("Total score for all exams: " + individualResults() 
		+ "and your individual results for physics, chemistry, and biology out of 150, respectively are: " 
				+ physics + ", " + chemistry + ", " + biology + ".");
		System.out.println("Your overall score is: " + overallPercentageResult() + "%. Well done!" );
	}
	
	public static int individualResults() {
		total = physics + chemistry + biology;
		return total ;
		
	}
	
	public static int overallPercentageResult() {
		percentage = total * 100/450;
		return percentage;
	}
	
}
