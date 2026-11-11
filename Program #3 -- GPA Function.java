//Programmer: Javan Graber
//Date: 11/10/26

package javanproject;
import java.util.Scanner;


public class MyProject {   
    static Scanner userinput = new Scanner(System.in); 
	
	//Create the GPA calculation method
	static double computeGPA(double [] grades, double [] credits) {
		
		//Initialize the variables
		int creditsLength = credits.length;
		double totalGrades = 0;
		double totalCredits = 0;
		
		//Find the total grade and the total credits
		for (int i = 0; i < creditsLength; i++) {
			totalGrades += grades [i] * credits [i];
			totalCredits += credits [i];
		}
		
		//Divide the total grade by the total credits to find the GPA and return it
		double GPA = totalGrades / totalCredits;
		return GPA;
	}
	
	//Create the mainline
	public static void main (String[] args){
		try {
	    	//Ask for the number of courses
	    	System.out.print("Enter the number of courses you would like to add: ");
	    	int numbers = userinput.nextInt();
	    	userinput.nextLine();
	    	
	    	//Initialize the arrays with the required memory
	    	double [] providedGrades = new double [numbers];
	    	double [] providedCredits = new double [numbers];
	    	
	    	//Ask if they want to enter letter grades instead of numbers
	    	System.out.println();
	    	System.out.println("Would you like to enter the grades as letters (like A, A-, B+, etc.)? Enter y or n --> ");
	    	String userPreference = userinput.nextLine();
	    	
	    	//If they want to use letter grades...
	    	if (userPreference.equals("y")) {
	    		//Ask for the letter grades
		    	System.out.println("Please enter the grades (as letter form) with their respective credits below: ");
		    	System.out.println();
		    	
		    	String letterGrade = "";
		    	
		    	//Use a loop to get each grade and substitute it for the number grade
		    	for (int i = 0; i < numbers; i++) {
		    		System.out.println("Grade #" + (i + 1) + ": ");
		    		letterGrade = userinput.nextLine();
		    		
		    		if (letterGrade.equals("A")) {providedGrades [i] = 4;}
		    		else if (letterGrade.equals("A-")) {providedGrades [i] = 3.67;}
		    		else if (letterGrade.equals("B+")) {providedGrades [i] = 3.33;} 
		    		else if (letterGrade.equals("B")) {providedGrades [i] = 3;}
		    		else if (letterGrade.equals("B-")) {providedGrades [i] = 2.67;}
		    		else if (letterGrade.equals("C+")) {providedGrades [i] = 2.33;}
		    		else if (letterGrade.equals("C")) {providedGrades [i] = 2;}
		    		else if (letterGrade.equals("C-")) {providedGrades [i] = 1.67;}
		    		else if (letterGrade.equals("D+")) {providedGrades [i] = 1.33;}
		    		else if (letterGrade.equals("D")) {providedGrades [i] = 1;}
		    		else if (letterGrade.equals("D-")) {providedGrades [i] = 0.67;}
		    		else if (letterGrade.equals("F")) {providedGrades [i] = 0;}
		    		
		    		//Get the credits
			        System.out.println("Credits #" + (i + 1) + ": ");
			    	providedCredits [i] = userinput.nextDouble();
			        userinput.nextLine(); 
		    	}

	    	}
	    	//If they want to use number grades...
	    	else {
		    	//Ask for the number grades
		    	System.out.println("Please enter the grades (as GPA form, like 3.7 or 4.0) with their respective credits below: ");
		    	System.out.println();
		    	
		    	//Use a loop to get each number grade and the credits
		    	for (int i = 0; i < numbers; i++) {
		    		System.out.println("Grade #" + (i + 1) + ": ");
			    	providedGrades [i] = userinput.nextDouble();
			        userinput.nextLine(); 
			        
			        System.out.println("Credits #" + (i + 1) + ": ");
			    	providedCredits [i] = userinput.nextDouble();
			        userinput.nextLine(); 
		    	}

	    	}
	    	
	    	//Call the compute GPA method, giving the arrays as input
			double studentGPA = computeGPA(providedGrades, providedCredits);
			
			//Display the GPA
			System.out.println();
			System.out.format("Student GPA: %.2f", studentGPA);
			
		}
		//Catch any exceptions
		catch (Exception e) {
			System.out.println("Something you entered was not valid. Make sure you enter valid information!");
		}
	}
		
}
