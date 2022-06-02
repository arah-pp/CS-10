package Assignments;
/*
Program: Final Project.java          Date: 6/2/2022
Author: Ashton Hirdle 
School: CHHS
Course: Computer Science 10
*/
import java.util.Scanner;

public class FinalProject 
{

	public static void main(String[] args) 
	{
		Scanner userInput = new Scanner(System.in);
		
		System.out.println("Welcome to Ashton's pizzas, thank you for using my service!");
		System.out.println("Please take a look at our menu.\r\n");
		
	    System.out.println("What type of pizza would you like?");
	    String type = userInput.next();
	    
	    System.out.println("How many pizzas would you like?");
	    int quantity = userInput.nextInt();
	    
		System.out.println("Please enter the number corresponding the size pizza you would like?");
		int Size = userInput.nextInt();
		
        System.out.println("Proceeding to checkout...\r\n");
		
		System.out.print("Full name: ");
		String name = userInput.next();
		
		System.out.print("Phone number:");
		String number = userInput.next();
		System.out.println(" ");
		
		if (Size == 1)
		{
			System.out.println ( quantity + "x " + type + " pizza: $" + quantity * 7.50);
		}
		else if (Size == 2)
		{
			System.out.println( quantity + "x " + type + " pizza: $ " + quantity * 10.00);
		}
		else if (Size == 3)
		{
			System.out.println( quantity + "x " + type + " pizza: $" + quantity * 12.50);
		}
		int X = 15 + (int) (Math.random()*15);
		 
		System.out.print("\r\nDebit or Credit? ");
	    String payment = userInput.next();
		
		
	    System.out.println("\r\nThank you for your order " + name + "! Your pizza should be ready in approximately " + X + " minutes.");
	    System.out.println("We've sent a receipt to " + number + " and have charged your " + payment + " card.");
		
		

	}

}
/* Screen Dump
Welcome to Ashton's pizzas, thank you for using my service!
Please take a look at our menu.

What type of pizza would you like?
cheese
How many pizzas would you like?
5
Please enter the number corresponding the size pizza you would like?
3
Proceeding to checkout...

Name: Ashton Hirdle
Phone number:587577220
 
5x cheese pizza: $62.5

Debit or Credit? Credit

Thank you for your order Ashton Hirdle! Your pizza should be ready in approximately 17 minutes.
We've sent a receipt to 587577220 and have charged your Credit card.
 */
