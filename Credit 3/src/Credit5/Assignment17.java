package Credit5;

import java.util.Scanner;
/*
Program: Assignment17.java          Date: 5/27/2022
Author: Ashton Hirdle 
School: CHHS
Course: Computer Science 10
*/
public class Assignment17 
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in); // This is the scanner
		
		System.out.print("Please enter your GPA or input \"-1\" to end the program: "); // asks user for GPA
		double GPA = input.nextDouble(); // Scanning users input
		
		if (GPA == -1) // checks if input is -1
		{
			System.out.print("Thank you for using our program, have a great day"); // Final message
			System.exit(0); //finishes program
		}
		while (GPA != -1) // if input is not equal to -1
		{
			
			if (GPA >= 3.8) // checks if GPA is greater than or equal to 3.8
			{
				System.out.print("\nsumma cum laude"); // Displays on users screen
			}
			else if (GPA >= 3.65) // Checks if GPA is greater than or equal to 3.65
			{
				System.out.print("\nmagna cum laude"); // Displays on users screen
			}
			else if (GPA >= 3.5) // If GPA is greater or equal to 3.5
			{
				System.out.print("\ncum laude"); // Displays on users screen
			}
			else
			{
				System.out.print("Sorry, at this time you did not qualify for an honors distinction"); // tells user if they didn't qualify
	}
			
			System.out.print("\nEnter \"-1\" to end the program or enter another GPA: "); // asks user if they want to run program again
			GPA = input.nextDouble(); // Records GPA again
			if (GPA == -1) // If input is -1
			{
				System.out.print("Thank you for using our program, have a great day"); // Final message
				System.exit(0); // Finishes program
			}
		}
	}
}
/* Screen Dump
Please enter your GPA or input "-1" to end the program: 3.9
summa cum laude

Enter "-1" to end the program or enter another GPA: 3.0
Sorry, at this time you did not qualify for an honors distinction

Enter "-1" to end the program or enter another GPA: -1
Thank you for using our program, have a great day!
 */
