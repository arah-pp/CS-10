package Assignments;
/*

Program: ${Assignment4}.java          Date: ${4/20/2022}


Author: Ashton Hirdle 
School: CHHS
Course: Computer Science 10
 

*/
import java.util.Scanner;

public class Assignment4 
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in); //Scanning the input
		
	 System.out.println("What is your name?"); //Displaying the text "What is your name?"
	 String name = input.next(); //Scanning the input of the user and storing under "name"
	 
     System.out.println("Enter the diameter of the pizza:"); //Displaying line of text "Enter the diameter of the pizza:"
     int diameter = input.nextInt(); //Taking user input and storing it under "diameter"
      
     double D = ((0.05*diameter*diameter)+1.75); //Doing the math from the users input step by step
     System.out.println("Thank you " + name + ", Your total is $" + D); //Displaying the final thank you message
		
	}

}
/* 
What is your name?
Ashton
Enter the diameter of the pizza:
10
Thank you Ashton, Your total is $6.75


What is your name?
Ashton
Enter the diameter of the pizza:
20
Thank you Ashton, Your total is $21.75

 */