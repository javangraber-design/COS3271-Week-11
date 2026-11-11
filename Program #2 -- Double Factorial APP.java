//Programmer: Javan Graber
//Date: 11/10/26

package javanproject;
import java.util.Scanner;


public class MyProject {   
    static Scanner userinput = new Scanner(System.in); 
	
	//Create the error-catching method
	static int testInteger(String message) {
		int userNumber;
		String usage;
		while (1==1) {
			try {
				System.out.println(message);
				userNumber = userinput.nextInt();
				return userNumber;
			}
			catch(Exception e) {
				usage = userinput.nextLine();
			}
		}
		}
	
	//Create the double factorial method
	static int doubleFactorial(int value) {
		
		//If the value is 1 or 2, return 1 and 2 respectively
		if (value == 1) {
			return 1;
		}
		else if (value == 2) {
			return 2;
		}
		//Calculate the double factorial by continually subtracting 2 from the value and multiplying the resulting numbers
		//by themselves and the original value
		return doubleFactorial(value - 2) * value;
		}
	
	//Create the mainline
	public static void main (String[] args){
		int number = 10;
		
		//Go until the user enters 0
		while (number != 0) {
			
			//Get the number and test it
			number = testInteger("Please enter the integer for the double factorial (or type 0 to stop): ");
			
			//End if the number is 0 and display the double factorial if it is not
			if (number == 0) {System.out.println("Thanks for using the double factorial program");}
			else {System.out.println("The double factorial is " + doubleFactorial(number));}
		}
		
	}
		
}
