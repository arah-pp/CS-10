package Assignments;
/*

Program: ${Assignment8}.java          Date: ${4/29/2022}


Author: Ashton Hirdle 
School: CHHS
Course: Computer Science 10
 

*/
import java.util.Scanner;

public class Assignment8
{

	public static void main(String[] args)
	{
		
		Scanner input = new Scanner(System.in); //The scanner  scans the users input
		System.out.println("Enter a three digit number: "); //Telling the user to enter a 3 digit number
		int DN = input.nextInt(); //Scanning the users input
		int hundreds = DN / 100; //Dividing the number by 100
		int tenths = DN % 100/10; //Taking the remaining number and dividing by 10
		int ones = DN % 100%10; //Recording the remaining number
		
		System.out.println("Hundreds spot: " + hundreds); //Displaying the hundreds spot on the screen
		System.out.println("Tens spot: " + tenths); //Displaying the Tens spot on the screen
		System.out.println("Ones spot: " + ones); //Displaying the remaining number or ones on the screen
		
	}

}
/* 
Enter a three digit number: 
352
Hundreds spot: 3
Tens spot: 5
Ones spot: 2
 */