package Credit5;
/*

Program: ${Assignment14}.java          Date: ${5/10/2022}
Author: Ashton Hirdle
School: CHHS
Course: Computer Science 10

*/
import java.util.Scanner;

public class Assignment14 
{

	public static void main(String[] args) 
	{
		Scanner userInput = new Scanner(System.in); //This is the scanner
		
		System.out.println("Please enter you age: "); //Asking user to enter their age
		int age = userInput.nextInt(); //Scanning the users input
		
		if (age > 18) //If the age is greater than 18
		{
			System.out.println("You are a Adult"); //Text displays for previous statement
		}
		else if (age > 12) //If the age is greater than 12
		{
			System.out.println("You are a Teen"); //Text displays for previous statement
		}
		else if (age >= 11) //If the age is greater than or equal to 11
		{
			System.out.println("You are a Preteen"); //Text displays for previous statement
		}
		else if (age >= 6) //If the age is  greater than or equal to 6
		{
			System.out.println("You are a Child"); //Text displays for previous statement
		}
		else if (age >=1) //If the age is greater then or equal to 1
		{
			System.out.println("You are a Toddler"); //Text displays for previous statement
		}
		

	}

}
/* Screen Dump
Please enter you age: 
4
You are a Toddler

Please enter you age: 
17
You are a Teen
 */