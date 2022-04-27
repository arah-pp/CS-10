package Assignments;
/*

Program: ${Coins}.java          Date: ${4/27/22}


Author: Ashton Hirdle
School: CHHS
Course: Computer Science 10
 

*/
import java.util.Scanner;

public class Assignment7 
{

	public static void main(String[] args) 
	{

		Scanner input = new Scanner (System.in); //Scanning the users input
		
		System.out.println("Enter the change in cents: "); //Displaying this text
		
		int change = input.nextInt(); //Taking in the total amount of change
		int quarters = change / 25; // Calculating the amount of quarters
		int dimes = (change % 25)/10; //Taking the remaining number and dividing by the amount of dimes
		int nickels = ((change % 25)%10)/5; //Taking the remaining change and calculating the final amount of nickels
		int remainder = (((change % 25)%10)%5)/1; //Calculating and giving back the extra amount of pennies
		
		System.out.println("The amount of change you provided is: " + change); //Displaying the amount of change the user inputed
		System.out.println("\r\n"); //Spacing a line
		System.out.println("The number of coins back:"); //Displaying "The number of coins back:"
		System.out.println("Quarters: " + quarters); //Showing the amount of quarters deciphered from the calculations
		System.out.println("Dimes: " + dimes); //Showing the total amount of dimes they user gets
		System.out.println("Nickels: " + nickels); //Showing the amount of nickels the user gets back
		System.out.println("Pennies: "+ remainder); //Showing the amount of pennies the user has left over
		
	}

}
/* 
Enter the change in cents: 
219
The amount of change you provided is: 219


The number of coins back:
Quarters: 8
Dimes: 1
Nickels: 1
Remaining Pennies: 4
 */