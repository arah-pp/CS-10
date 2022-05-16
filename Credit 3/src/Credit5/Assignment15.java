package Credit5;

/*
Program: ${Assignment15}.java          Date: ${5/10/2022}
Author: Ashton Hirdle
School: CHHS
Course: Computer Science 10
*/

import java.util.Scanner;

public class Assignment15
{

	public static void main(String[] args) 
	{
		
		int X = (int) (Math.random()*5); //This is the generator for the  First Random Number
		int Y = 1 + (int) (Math.random()*10); //This is the Second Random Number generator
		
		Scanner userinput = new Scanner(System.in); //This is the scanner
		System.out.println("What is  " + X + " * " + Y); //Asking the user what is "X" * "Y"
		int input = userinput.nextInt(); //Scanning the users input
				if ( input == X * Y) // If the users input is correct 
				{
					System.out.println("You got it right! Congratulations!!" ); //Displays on screen if correct
				}
				else 
				{
					Scanner userinput1 = new Scanner(System.in); //This is the scanner
					System.out.println("You got it wrong. Please Try again." ); //Displays if wrong
					int input1 = userinput.nextInt(); //Lets you try again so need another scanner
					
					if (input1 == X * Y) //If you get it correct
					{
						System.out.println("You got it right! Congratulations!!" ); //Displays if your correct

					}
					
					else 
					{
						System.out.println("You got it wrong." ); //If you got it wrong again displays on screen
					}

				}
	}

}
/* Screen Dump
What is  4 * 7
28
You got it right! Congratulations!!

What is  4 * 8
36
You got it wrong. Please Try again.
32
You got it right! Congratulations!!
 */