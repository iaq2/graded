//Ittehad Qabid Java - Processing Grades

import java.util.Scanner;

class Graded {
	public static void main(String[] args) {					
		double grade;								// Initializing Variables
		double sumOfGrades;
		int numStudents;
		int numPass;
		int numFail;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("\n-------Grade Processing Program--------");			// Prints a Title of Grade Processing Program
		
		sumOfGrades = 0;
		numStudents = 0;
		numPass = 0;
		numFail = 0;
		
		System.out.println("Please Enter the First Student's Grade: ");				// Prompts the User to Input Student Grades
		grade = scan.nextDouble();
											// Continues to Prompt the User.. 
		while (grade >= 0) {				// Until the User Inputs a Negative Number
			sumOfGrades += grade;			// Sum of the Student Grades
			numStudents++;					// Increases the Student Count 
			
			int x = (grade<60?numFail++:numPass);	// Counts the Number of Passing Students above 60
			int y = (grade>=60?numPass++:numFail);	// Counts the Number of Failing Students below 60
			
			System.out.println("Please Enter the Next Student's Grade: ");		// Prints the Prompt for Additional Grade Input
			grade = scan.nextDouble(); }
		
		if (numStudents > 0) {															// Printing the Results
			System.out.println("\n-------Grade Summary-------");						// Prints Grade Summary Title 
			System.out.println("The Class Average is: " + sumOfGrades/numStudents);		// Prints the Class Average
			System.out.println("Number of Passing Students " + numPass);				// Prints Count of the Number of Passing Students
			System.out.println("Number of Failing Students: " + numFail); }				// Prints Count of the Number of Failing Students
		
		else { 
			System.out.println("No Grades Processed."); 		// Unless if No Grades were Processed
			}
		}
	}

