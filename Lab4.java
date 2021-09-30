/*-------------------------------------------------------------------------
// AUTHOR: Augustus Crosby
// FILENAME: Lab4.java
// SPECIFICATION: Given a menu to choose from, select what mathematical action you want to see.
// FOR: CSE 110- Lab #4
// TIME SPENT: Less than an hour
//-----------------------------------------------------------*/


//	Import required packages
import java.util.Scanner;

//	Declare class (Lab4)
 public class Lab4 {

	//	Declare the main method
	public static void main(String[] args) {


		// Declare variables for the function.
		//	Create an integer variable named choice.
		int choice = 0;

		//	Create a Scanner object (you may need to import the class)
		Scanner in = new Scanner(System.in);

		//initialize do-while loop
		// A do-while loop to execute the program until the user explicitly says to stop by selecting '4'
		do{
		//	Print the following options:
			System.out.println("Please choose your choice from following menu");
			System.out.println("1) Calculate the sum of integers 1 to m.");
			System.out.println("2) Calculate the factorial of given number.");
			System.out.println("3) Find the first digit of a given number.");
			System.out.println("4) Quit.");

			// Use scanner to get user input
			choice = in.nextInt();

			
			switch(choice){
	  			case 1:
	  				int m = 0;
	  				int sum = 0;
	  				System.out.println("m equals what number?");
	  				m = in.nextInt();
	  				int i = 1;
	  				while (i <= m) {
	  					sum = sum + i;
	  					i++;
	  				}
	  				System.out.println("The sum is: "+sum);
	  				break;
	  			case 2:
	  				int n = 0;
	  				int fact = 1;
	  				System.out.println("Enter the number you would like to see the factorial of: ");
	  				n = in.nextInt();
	  				int j = 1;
	  				while(j <= n) {
	  					fact = fact * j;
	  					j++;
	  				}
	  				System.out.println("The factorial is: "+fact);
	  				break;
	  			case 3:
	  				int num = 0;
	  				int rem = 0;
	  				System.out.println("Enter the number: ");
	  				num = in.nextInt();
	  				while(num != 0) {
	  					rem = num % 10;
	  					num = num / 10;
	  				}
	  				System.out.println("The first digit is: "+rem);
	  				break;
	  			default:
					break;
	  		}
	   	}while(choice != 4);
		in.close();


	//	Close the main method
	}
//Close the Class
 }