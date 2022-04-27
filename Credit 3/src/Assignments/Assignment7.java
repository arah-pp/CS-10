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

		Scanner input = new Scanner (System.in);
		
		System.out.println("Enter the change in cents: ");
		
		int change = input.nextInt();
		int quarters = change / 25;
		int dimes = (change % 25)/10;
		int nickels = ((change % 25)%10)/5;
		int remainder = (((change % 25)%10)%5)/1;
		
		System.out.println("The amount of change you provided is: " + change);
		System.out.println("\r\n");
		System.out.println("The number of coins back:");
		System.out.println("Quarters: " + quarters);
		System.out.println("Dimes: " + dimes);
		System.out.println("Nickels: " + nickels);
		System.out.println("Pennies: "+ remainder);
		
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