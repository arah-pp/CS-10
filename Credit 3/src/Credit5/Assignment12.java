package Credit5;
/*

Program: ${Assignment11}.java          Date: ${5/9/2022}
Author: Ashton Hirdle
School: CHHS
Course: Computer Science 10

*/
import java.util.Scanner;

public class Assignment12 
{

	public static void main(String[] args) 
	{
		
		Scanner userInput = new Scanner(System.in); //This is the scanner
		
		System.out.println("Please enter your grade percentage: "); //Telling user to input their grade percent
		
		int percent = userInput.nextInt(); //Scanning the users input
		
		
		
		if (percent >= 90) //If the grade is greater or equal to 90 you got this grade
		{ 
		System.out.println("The corresponding letter grade is: A+"); //Displaying text on users screen
		}
		else if ( percent >= 80) //If the grade is greater or equal to 80 you got this grade
		{ 
		System.out.println("The corresponding letter grade is: A"); //Displaying text on users screen
		}
		else if ( percent >= 75) //If the grade is greater or equal to 75 you got this grade
		{ 
		System.out.println("The corresponding letter grade is: B+"); //Displaying text on users screen
		}
		else if ( percent >= 70) //If the grade is greater or equal to 70 you got this grade
		{ 
		System.out.println("The corresponding letter grade is: B"); //Displaying text on users screen
		}
		else if ( percent >= 65) //If the grade is greater or equal to 65 you got this grade
		{ 
		System.out.println("The corresponding letter grade is: C+"); //Displaying text on users screen
		}
		else if ( percent >= 60) //If the grade is greater or equal to 60 you got this grade
		{ 
		System.out.println("The corresponding letter grade is: C"); //Displaying text on users screen
		}
		else if ( percent >= 55) //If the grade is greater or equal to 55 you got this grade
		{ 
		System.out.println("The corresponding letter grade is: D+"); //Displaying text on users screen
		}
		else if ( percent >= 50) //If the grade is greater or equal to 50 you got this grade
		{ 
		System.out.println("The corresponding letter grade is: D"); //Displaying text on users screen
		}
		else //If its not any other option then you get a F
		{
			System.out.println("The corresponding letter grade is: F"); //Displaying text on users screen

		}
}
}
/* Screen Dump
Please enter your grade percentage: 
78
The corresponding letter grade is: B+


Please enter your grade percentage: 
92
The corresponding letter grade is: A+
  */

