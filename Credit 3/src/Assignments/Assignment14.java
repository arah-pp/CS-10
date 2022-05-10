package Assignments;
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
		Scanner userInput = new Scanner(System.in);
		
		System.out.println("Please enter you age: ");
		int age = userInput.nextInt();
		
		if (age > 18)
		{
			System.out.println("You are a Adult");
		}
		else if (age > 12)
		{
			System.out.println("You are a Teen");
		}
		else if (age >= 11)
		{
			System.out.println("You are a Preteen");
		}
		else if (age >= 6)
		{
			System.out.println("You are a Child");
		}
		else if (age >=1)
		{
			System.out.println("You are a Toddler");
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