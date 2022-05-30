package Assignments;

import java.util.Scanner;

public class FinalProject 
{

	public static void main(String[] args) 
	{
		Scanner userInput = new Scanner(System.in);
		
		System.out.println("Welcome to Ashton's pizzas, thank you for using my service!");
		System.out.println("Please take a look at our menu.\r\n");
		System.out.println("What size pizza would you like to order?");
		int Size = userInput.nextInt();
	
		
		System.out.println("What sauce would you like?");
		int Sauce = userInput.nextInt();
		
		System.out.println("Please enter all the toppings you would like on your pizza:");
		int Toppings = userInput.nextInt();
		
		System.out.println("Your pizza has ");
		
		System.out.println("The total price of your pizza is: ");
		

	}

}
