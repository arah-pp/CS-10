package Assignments;
/*

Program: ${Assignment16}.java          Date: ${5/16/2022}
Author: Ashton Hirdle
School: CHHS
Course: Computer Science 10

*/
import java.util.Scanner;

public class Assignment16 
{

	public static void main(String[] args)
	{
		
		int X = 1 + (int) (Math.random()*20); //Creating a random number between 1 and 20
		
		
		System.out.println("Please enter a number between 1 and 20: "); //Displaying text on screen
		Scanner userInput = new Scanner (System.in); //This is the scanner
		int number = userInput.nextInt(); //Scanning the users input
		System.out.println("Computers number was: " + X); //Displaying computers number on users screen
		System.out.println("Your number was: " + number); //Displaying the number the user entered
		
		
		if (number == X) //If number is equal to computers number...
		{
		System.out.println("You Won :)"); //Then you win
		}
		else //If computers number is not equal to users number...
		{
			System.out.println("Better luck next time :("); //Then you loose and text displays on users screen
		}
		
		
		
	}

}
/* Screen Dump
Please enter a number between 1 and 20: 
17
Computers number was: 10
Your number was: 17
Better luck next time :(


Please enter a number between 1 and 20: 
3
Computers number was: 3
Your number was: 3
You Won :)
 */
