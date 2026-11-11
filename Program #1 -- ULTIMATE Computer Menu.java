//Programmer: Javan Graber
//Date: 11/10/26

package javanproject;
import java.util.Scanner;


public class MyProject {   
    static Scanner userinput = new Scanner(System.in); 
    
    //Create the functions
	static void displayApp() {
		//This method will contain the code for the display APP
		}
	static void textArtApp() {
		//This method will contain the code for the text art APP
		}
	static void calculatorApp() {
		//This method will contain the code for the calculator APP
		}
	static void binaryCalculatorApp() {
		//This method will contain the code for the binary calculator APP
		}
	static void encouragementApp() {
		//This method will contain the code for the encouragement APP
		}
	static void diceApp() {
		//This method will contain the code for the dice APP
		}
	static void oppishApp() {
		//This method will contain the code for the Oppish APP
		}
	static void fibonacciApp() {
		//This method will contain the code for the Fibonacci APP
		}
	static void doubleFactorialApp() {
		//This method will contain the code for the double factorial APP
		}
	
	//Create the mainline
	public static void main (String[] args){
		
		//Display the options
		System.out.println("1. Display APP");
		System.out.println("2. Text Art APP");
		System.out.println("3. Calculator APP");
		System.out.println("4. Binary Calculator APP");
		System.out.println("5. Encouragement APP");
		System.out.println("6. Dice APP");
		System.out.println("7. Oppish APP");
		System.out.println("8. Fibonacci APP");
		System.out.println("9. Double Factorial APP");
		
		//Initialize the choice
		int choice = 10;
		
		//Go until the user enters 0
		while (choice != 0) {
			
			try {
				System.out.println();
				System.out.println("Please enter the number for your choice (it must be an integer) or enter 0 to stop: ");
				choice = userinput.nextInt();
				userinput.nextLine();
				
				//Based on the selection, call the required function by the menu order
				if (choice == 1) {
					displayApp();
				}
				else if (choice == 2) {
					textArtApp();
				}
				else if (choice == 3) {
					calculatorApp();
				}
				else if (choice == 4) {
					binaryCalculatorApp();
				}
				else if (choice == 5) {
					encouragementApp();
				}
				else if (choice == 6) {
					diceApp();
				}
				else if (choice == 7) {
					oppishApp();
				}
				else if (choice == 8) {
					fibonacciApp();
				}
				else if (choice == 9) {
					doubleFactorialApp();
				}
				//Check for numbers beyond the specified options
				else if (choice > 9 || choice < 0) {
					System.out.println("Sorry, that integer was not a valid option!");
				}

			//Catch any exceptions for invalid input
			} catch (Exception e) {
				System.out.println("That choice was not valid. Please enter a valid integer!");
				userinput.nextLine();
			}
			
		}

	}
		
}
